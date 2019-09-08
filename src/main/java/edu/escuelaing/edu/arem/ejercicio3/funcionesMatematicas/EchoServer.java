package edu.escuelaing.edu.arem.ejercicio3.funcionesMatematicas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null; try {
            serverSocket = new ServerSocket(35000);
        } catch (IOException e) {
            System.err.println("Could not listen on port: 35000.");
            System.exit(1);
        }
        Socket clientSocket = null;
        try {
            clientSocket = serverSocket.accept();
        } catch (IOException e) {
            System.err.println("Accept failed.");
            System.exit(1);
        }
        PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        String inputLine = "";
        String outputLine = "";
        while ((inputLine = in.readLine()) != null) {
            System.out.println("Mensaje:" + inputLine);
            outputLine = "Respuest - El numero cuadrado es" + inputLine;
            out.println(outputLine);
            if (outputLine.equals("Respuestas: Bye."))
                break;
        }
        out.close();
        in.close();
        clientSocket.close();
        serverSocket.close();
    }

    public Double calculateFunction(String inputLine){
        double number = 0.0;
        String [] radianNumber;
        Integer otherNumber = 1;
        if(inputLine.contains("/")){
            radianNumber = inputLine.split("/");
            inputLine = radianNumber[1];
            if(radianNumber[0].equals("π")){

            }
        }
        return 0.0;


    }

}
