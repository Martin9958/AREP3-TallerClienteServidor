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
        this.ReadingURL();


    }
    private void ReadingURL (){
        BufferedReader readerUrl = new BufferedReader(new InputStreamReader(System.in));
        try {
            URL url = new URL(readerUrl.readLine());
            FileWriter result = new FileWriter (SAVED_FILE_PATH);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line = null ;
            while((line = bufferedReader.readLine()) != null){
                result.write(line);
            }
            bufferedReader.close();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String [] args){
        BrowserURL browserURL = new BrowserURL();
    }
}
