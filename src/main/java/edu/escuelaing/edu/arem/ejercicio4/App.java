package edu.escuelaing.edu.arem.ejercicio4;

import edu.escuelaing.edu.arem.ejercicio4.connection.ServerService;

/**
 *
 *
 */
public class App 
{
    /**
     *
     * @param args
     */
    public static void main( String[] args )
    {
        ServerService serverService = new ServerService();
        while(true){
            serverService.serverStart();
        }
    }
}
