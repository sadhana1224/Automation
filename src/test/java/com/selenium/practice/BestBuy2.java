package com.selenium.practice;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class BestBuy2 {

    public static void main(String[] args) {
        String urlToCheck = "https://www.bestbuy.com/";

        try {
            URL url = new URL(urlToCheck);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("HEAD");
            int responseCode = connection.getResponseCode();

            if (responseCode != HttpURLConnection.HTTP_OK) {
                System.out.println("The URL '" + urlToCheck + "' is broken.");
            } else {
                System.out.println("The URL '" + urlToCheck + "' is not broken.");
            }
        } catch (IOException e) {
            System.out.println("An exception occurred, indicating a broken link.");
        }
    }
}

