package com.server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {/*
        try{
            ServerSocket server = new ServerSocket(3000);

            Socket s = server.accept();
            System.out.println("Un client si è connesso al server.");

            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            DataOutputStream out = new DataOutputStream(s.getOutputStream());

            String stringRicevuta = in.readLine();
            System.out.println("Il client ha inviato " + stringRicevuta);

            String stringModifica = stringRicevuta.toUpperCase();
            out.writeBytes(stringModifica + "\n");

            server.close();
            s.close();

        }catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Errore durante l'instanziamento.");
            System.exit(1);
        }
        */
    }
}
