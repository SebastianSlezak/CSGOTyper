package app;

import io.DataReader;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;
import java.util.Map;

public class TyperControl {
    private final DataReader dataReader = new DataReader();
    public void controlLoop() {
        String url;
        do {
            typeMatch(dataReader.readUrl());
        } while (true);
    }

    public void typeMatch(String url){

        try {
            Connection.Response response = Jsoup.connect(url).referrer("http://www.google.com").ignoreHttpErrors(true).execute();
//            Document response = Jsoup.connect(url).ignoreHttpErrors(true).timeout(5000).get();

            Map<String, String> cookies = response.cookies();

            System.out.println(cookies);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
