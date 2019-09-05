package edu.escuelaing.edu.arem.ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class BrowserURL {

    private String SAVED_FILE_PATH = "src/main/resources/result.html";

    public BrowserURL(){
        System.out.println("Browser Exercise # 2 : \n"+
                "Welcome user !! \n" +
                "Enter the URL you wish to store: ");
        try {
            FileWriter result = new FileWriter (SAVED_FILE_PATH);
            URL url = this.readingURL();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = null ;
            while((line = bufferedReader.readLine()) != null){
                result.write(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(" See in the result path : "+ SAVED_FILE_PATH + "\n" +
                " The solution of the exercise!!");
    }

    private URL readingURL () throws IOException {
        BufferedReader readerUrl = new BufferedReader(new InputStreamReader(System.in));
        URL url = new URL(readerUrl.readLine());
        System.out.println("The URL is : " + url);
        return url;

    }
    public static void main(String [] args){
        BrowserURL browserURL = new BrowserURL();
    }
}
