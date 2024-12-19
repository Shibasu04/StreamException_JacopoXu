/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.streamexception_jacopoxu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jacopo Xu
 */
public class InputStream {
    public static void Scanner(){
        Scanner in = new Scanner (System. in);
        System.out. println("Digita un intero:");
        String line = in.next();
        int intValue = Integer. parseInt(line); 
        System. out. println("Valore inserito con Scanner: " + intValue);
        in. close();
    }
     public static void usingBufferedeReader(){
        BufferedReader inR = new BufferedReader(new InputStreamReader(System.in));
        try {
            int lineR = inR.read();
            System.out.println("Valore inserito con BufferedReader: " + lineR);
        } catch (IOException ex) {
            Logger.getLogger(InputStream.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Errore in lettura");
        }
        try {
            inR.close();
        } catch (IOException ex) {
            Logger.getLogger(InputStream.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Errore in scrittura");
        }
        
     }
}
