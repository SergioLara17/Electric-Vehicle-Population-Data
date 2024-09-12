package co.edu.uptc;

import com.google.gson.Gson;

import co.edu.uptc.utility.APIConsumer;
import co.edu.uptc.utility.Root;

public class Tester {
    
    public static void main(String[] args) {

        APIConsumer ac = new APIConsumer();
        String jsonString = ac.readAPI();

        Gson gson = new Gson();
        Root root = gson.fromJson(jsonString, Root.class);
    }
}
