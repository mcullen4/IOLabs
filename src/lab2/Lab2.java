
package lab2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Lab2 {

  
    public static void main(String[] args) {
        File file = new File("E:" + File.separatorChar + "java" + File.separatorChar
                + "lab1.txt");
        boolean append = true;
        int LINES_PER_RECORD = 3;
        int lineCount = 0;
        int recordNumber = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter record number");
        int requestedRecordNumber = keyboard.nextInt();
            

        if (file.exists()) {

            BufferedReader in = null;
            try {
                in = new BufferedReader(new FileReader(file));
                String line = in.readLine();
                if(line != null) {
                    lineCount++;
                    if (requestedRecordNumber == 1){
                        while (lineCount <= LINES_PER_RECORD){
                            System.out.println(line);
                            line = in.readLine();
                            lineCount++;
                        }
                    }else{
                    
                                         
                    do{
                    
//                    if(lineCount % LINES_PER_RECORD == 1){
//                    recordNumber++;
//                    }
                    line = in.readLine();
                    if (line == null){
                    System.out.println("End of file reached - invalid record number");
                    break;
                    }
                    lineCount++;
                    if(lineCount % LINES_PER_RECORD == 1){
                    recordNumber++;
                    }
                    }while (recordNumber != requestedRecordNumber);
                    
                   if (recordNumber == requestedRecordNumber){ 
                   for (int i = 0; i < LINES_PER_RECORD; i++){   
                    System.out.println(line);
                    line = in.readLine();
                 } 
                   } 
                    
                    } 
//                 
                    
                    
               
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
    }
}
