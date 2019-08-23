package edu.escuelaing.edu.arem.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReader {

    public static void main(String[] args) throws Exception{
        URL google = new URL("https://colombia.payulatam.com/blog/llega-la-nueva-era-del-debito");
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(google.openStream()))){
            String inputLine = null;
            while ((inputLine = reader.readLine()) != null){
                System.out.println("Protocol: " + google.getProtocol() +
                        "\n" + "Authority: " + google.getAuthority() +
                        "\n" + "Host: "+ google.getHost() +
                        "\n" + "Port: " + google.getPort() +
                        "\n" + "Path: "+ google.getPath() +
                        "\n" + "Query: "+ google.getQuery() +
                        "\n" + "File: "+ google.getFile() +
                        "\n" + "Ref: "+ google.getRef()
                );
            }
        }catch (IOException x){
            System.out.println(x);
        }
    }

}
