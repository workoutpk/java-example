import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class GetAPIAsync {
        public static void main(String[] args) {
                // Create an HTTP client
                HttpClient httpClient = HttpClient.newHttpClient();

                // Create an HTTP request
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create("https://www.google.com"))
                        .version(HttpClient.Version.HTTP_1_1)
                        .setHeader("User-Agent", "Java Aysnc HTTPClient Example...")
                        .build();

                // Send the request asynchronously
                HttpResponse<String> response = httpClient.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                        .join();

                // Print the response
                System.out.println(response.body());
        }
}
