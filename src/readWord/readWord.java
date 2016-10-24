/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readWord;

import com.sun.javafx.util.Utils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import org.jsoup.Jsoup;

/**
 *
 * @author User
 */
public class readWord {

    private String word;
    private String[] splWord;

    public readWord() {
        this.word = "";
    }

    public void readText(String path) throws FileNotFoundException, IOException {
        File file = new File(path);
        if (file.exists()) {
            try (BufferedReader in_file = new BufferedReader(new FileReader(file))) {
                String inputLine;
                while ((inputLine = in_file.readLine()) != null) {
                    word = word + inputLine;
                }
            }
        }
    }

    public void readURL(String url) throws FileNotFoundException, IOException {
        URL file = new URL(url);
        try (BufferedReader in_file = new BufferedReader(new InputStreamReader(file.openStream()))) {
            String inputLine;
            while ((inputLine = in_file.readLine()) != null) {
                word = word + inputLine;
            }
            word = convertHtml2Text(word);
        }

    }
    private String convertHtml2Text(String html){return Jsoup.parse(html).text();}

    public String getWord() {
        return word;
    }

    public String[] getSplWord() {
        splWord = Utils.split(word, " ");
        return splWord;
    }

}
