package co.edu.uptc.utility;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIConsumer{

    public String readAPI(){
        try {
            URL url = new URL("https://jsonplaceholder.typicode.com/users");

            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String line;
            String result = "";
            while ((line = reader.readLine()) != null) {
                result += line;
            }
        
            reader.close();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}