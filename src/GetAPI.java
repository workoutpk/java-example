import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetAPI {
        public static void getApiRequest() throws IOException {

                // Get 10th record data
                URL getUrl = new URL("https://jsonplaceholder.typicode.com/posts/10");

                HttpURLConnection conection = (HttpURLConnection) getUrl.openConnection();

                // Set request method
                conection.setRequestMethod("GET");

                // Getting response code
                int responseCode = conection.getResponseCode();

                // If responseCode is 200 means we get data successfully
                if (responseCode == HttpURLConnection.HTTP_OK) {
                        BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
                        StringBuffer jsonResponseData = new StringBuffer();
                        String readLine = null;

                        // Append response line by line
                        while ((readLine = in.readLine()) != null) {
                                jsonResponseData.append(readLine);
                        }

                        in.close();
                        // Print result in string format
                        System.out.println("JSON String Data " + jsonResponseData.toString());
                } else {
                        System.out.println(responseCode);
                }

        }
        public static void main(String[] args) {
                try {
                        getApiRequest();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
}
