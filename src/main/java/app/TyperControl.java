package app;

import io.DataReader;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.IOException;

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
            Document response = Jsoup.connect(url).get();
            System.out.println(response);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
