/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Michele
 */
public class Lab1 {

    public static void main(String[] args) throws IOException {

        File file = new File("E:" + File.separatorChar + "java" + File.separatorChar
                + "lab1.txt");
        boolean append = true;
        
        //Lab 1 - Read all records used at end to verify the write also

        if (file.exists()) {

            BufferedReader in = null;
            try {
                in = new BufferedReader(new FileReader(file));
                String line = in.readLine();
                while (line != null) {
                    System.out.println(line);
                    line = in.readLine();
                }

            } catch (IOException ioe) {
                System.out.println("Error reading file");
            } finally {
                try {
                    in.close();
                } catch (Exception e) {
                }
            }

        } else {
            System.out.println("File not found: " + file.getAbsoluteFile());
        }
        
        
//        //Read only the second record
//        int lineCount = 0;
//        
//        if (file.exists()) {
//
//            BufferedReader in = null;
//            try {
//                in = new BufferedReader(new FileReader(file));
//                String line = in.readLine();
//                while (line != null) {
//                    lineCount++;
//                    if (lineCount > 3 && lineCount < 7){
//                    System.out.println(line);
//                    }
//                    line = in.readLine();
//                }
//
//            } catch (IOException ioe) {
//                System.out.println("Error reading file");
//            } finally {
//                try {
//                    in.close();
//                } catch (Exception e) {
//                }
//            }
//
//        } else {
//            System.out.println("File not found: " + file.getAbsoluteFile());
//        }
        
//      PrintWriter out = new PrintWriter(
//						new BufferedWriter(
//						new FileWriter(file, append)));  
//        
//     out.print("John Doe");
//     out.println("789 Main Street");
//     out.println("Milwaukee, WI  53220");
//     out.close();
//     
//     System.out.println("Wrote file to: " + file.getAbsolutePath());
    }//end of main
    
    
    
    
    }//end of class

