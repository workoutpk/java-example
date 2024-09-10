import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class GetAPIAsynchronousHTTPClient {
        private static final HttpClient crunchifyHttpClient = HttpClient.newBuilder()
                .version(HttpClient.Version.HTTP_1_1)
                .connectTimeout(Duration.ofSeconds(5))
                .build();
        // HttpClient: An HttpClient can be used to send requests and retrieve their responses. An HttpClient is created through a builder.
        // Duration: A time-based amount of time, such as '5 seconds'.
        private static void crunchifyAsyncHTTPClient() {
                HttpRequest crunchifyRequest = HttpRequest.newBuilder()
                        .GET()
                        .uri(URI.create("https://crunchify.com/wp-content/java/crunchify-java-httpclient-tutorial.html"))
                        .setHeader("User-Agent", "Crunchify Java Aysnc HTTPClient Example...")
                        .build();
                CompletableFuture<HttpResponse<String>> crunchifyAsyncResponse = null;
                // sendAsync(): Sends the given request asynchronously using this client with the given response body handler.
                //Equivalent to: sendAsync(request, responseBodyHandler, null).
                crunchifyAsyncResponse = crunchifyHttpClient.sendAsync(crunchifyRequest, HttpResponse.BodyHandlers.ofString());
                String crunchifyAsyncResultBody = null;
                int crunchifyAsyncResultStatusCode = 0;
                try {
                        crunchifyAsyncResultBody = crunchifyAsyncResponse.thenApply(HttpResponse::body).get(5, TimeUnit.SECONDS);

                        // OR:

                        // join(): Returns the result value when complete, or throws an (unchecked) exception if completed exceptionally.
                        // To better conform with the use of common functional forms,
                        // if a computation involved in the completion of this CompletableFuture threw an exception,
                        // this method throws an (unchecked) CompletionException with the underlying exception as its cause.

                        HttpResponse<String> response = crunchifyAsyncResponse.join();
                        crunchifyAsyncResultStatusCode = crunchifyAsyncResponse.thenApply(HttpResponse::statusCode).get(5, TimeUnit.SECONDS);
                } catch (InterruptedException | ExecutionException | TimeoutException e) {
                        e.printStackTrace();
                }
                crunnchifyPrint("=============== AsyncHTTPClient Body:===============  \n" + crunchifyAsyncResultBody);
                crunnchifyPrint("\n=============== AsyncHTTPClient Status Code:===============  \n" + crunchifyAsyncResultStatusCode);
        }
        private static void crunnchifyPrint(Object data) {
                System.out.println(data);
        }
        public static void main(String[] args) {

                // Async HTTPClient Example
                crunchifyAsyncHTTPClient();

        }
}
