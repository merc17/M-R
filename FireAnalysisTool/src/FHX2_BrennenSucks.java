/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JFrame;
import fhx.mainFrame;
import firehistory.FireHistory;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author andreskis
 */
public class FHX2_BrennenSucks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length == 0 || args[0].compareTo("gui") == 0) {
            System.out.println("Starting GUI...");
            JFrame f = new mainFrame();
            f.setVisible(true);
        } else if (args[0].compareTo("h") == 0 || args[0].compareTo("help") == 0 || args[0].compareTo("man") == 0) {
            System.out.println("Fire History Man Page");
            System.out.println("");
            System.out.println("Params");
            System.out.println("==============================================");
            System.out.println("-d [file_path] => Print out the file");
            System.out.println("-c             => Create New Fire History");
            System.out.println("-h             => Display the Man Page");
            System.out.println("==============================================");
        } else if (args[0].compareTo("d") == 0 || args[0].compareTo("display") == 0) {
            System.out.println("Display Fire History");
            if (args.length == 2) {
                try {
                    // Open the file that is the first 
                    // command line parameter
                    FileInputStream fstream = new FileInputStream(args[1]);//file path
                    // Get the object of DataInputStream
                    DataInputStream in = new DataInputStream(fstream);
                    BufferedReader br = new BufferedReader(new InputStreamReader(in));
                    String strLine;
                    //Read File Line By Line
                    while ((strLine = br.readLine()) != null) {
                        // Print the content on the console
                        System.out.println(strLine);
                    }
                    //Close the input stream
                    in.close();
                } catch (Exception e) {//Catch exception if any
                    System.err.println("Error: " + e.getMessage());
                }
            } else if (args[0].compareTo("c") == 0 || args[0].compareTo("create") == 0) {
                System.out.println("Create Fire History");
                FireHistory f = new FireHistory();

                
            } else {
                System.out.println("ERROR: No File Specifided");
            }
        }
    }
}
