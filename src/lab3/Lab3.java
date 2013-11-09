
package lab3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Lab3 {

    
    public static void main(String[] args) {
        
               File file = new File("E:" + File.separatorChar + "java" + File.separatorChar
                + "lab1.txt");
        boolean append = true;
        int LINES_PER_RECORD = 3;
        int lineCount = 0;
        int recordNumber = 1;
        int requestedRecordNumber = 2;
        int lineNumberToRead = 3;
        char [] lineArray;
        
        
            

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
                   for (int i = 2; i <= LINES_PER_RECORD; i++){
                       line = in.readLine();
                    if (i == lineNumberToRead){
                        
                        lineArray = line.toCharArray();
                        for(int a = 0; a< lineArray.length;a++)
                        {
                        if (lineArray[a] != ','){
                        System.out.print(lineArray[a]);
                        }else{
                        break;
                        }
                        
                        }
                        
                        
                     
                    }
                    }
                        
                    }
                   }}
                 
     

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
