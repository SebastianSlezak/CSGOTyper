package app;

import io.DataReader;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

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
        Document document = null;

        try {
            document = Jsoup.connect(url).userAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, jak Gecko) Chrome/111.0.0.0 Safari/537.36").get();
            Elements elements = document.select("div#teamName");
            System.out.println(elements);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }



    }
}
