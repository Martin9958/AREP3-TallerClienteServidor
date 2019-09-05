package edu.escuelaing.edu.arem.ejercicio1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLReader {

    public static void main(String[] args) throws Exception{
        URL google = new URL("http://campusvirtual.escuelaing.edu.co:80/moodle/pluginfile.php/61298/mod_resource/content/3/TallerClientesYServicios.pdf?key1=value1&key2=value2#resource");
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
                        "\n" + "Reference: "+ google.getRef() +
                        "\n" + "<----------------------->"
                );
            }
        }catch (IOException x){
            System.out.println(x);
        }
    }

}
