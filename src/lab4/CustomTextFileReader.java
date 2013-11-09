/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author Michele
 */
public class CustomTextFileReader implements FileReader {

    private int linesPerRecord = 3;
    private int lineCount = 0;
    private File activeFile;
    private FormatConverter converter;
    private String line;
    private int recordNumber=1;
    private Map <Integer, MicheleCustomFileRecord> map = new LinkedHashMap<Integer, MicheleCustomFileRecord>();
    private String filePath;
    private Map <Integer, MicheleCustomFileRecord> returnedMap = new LinkedHashMap<Integer, MicheleCustomFileRecord>();
    public List <Map> list = new ArrayList<Map>();
    public CustomTextFileReader() {
        
    }

    @Override
    public Map readFile(String path) {
        File file = new File(path);

        if (file.exists()) {

            BufferedReader in = null;
            try {
                in = new BufferedReader(new java.io.FileReader(file));

                //Change this to create a map for each record ??  Maybe email ??
                line=in.readLine();
                while(line != null) {
                    MicheleCustomFileRecord record = new MicheleCustomFileRecord();
                    record.setFullName(line);
                    line = in.readLine();
                    record.setStreetAddress(line);
                    line = in.readLine();
                    record.setCityStateZip(line);
                    map.put(recordNumber, record);
                    recordNumber++;
                    line=in.readLine();
                }                        
              
               list.add(map);
                                         

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
        return map;
    }

    public int getLinesPerRecord() {
        return linesPerRecord;
    }

    public void setLinesPerRecord(int linesPerRecord) {
        if (linesPerRecord < 1) {
            //throw exception to the GUI
        }
        this.linesPerRecord = linesPerRecord;
    }

    public int getLineCount() {
        return lineCount;
    }

    public void setLineCount(int lineCount) {
        if (lineCount < 1) {
            //throw exception to the GUI
        }
        this.lineCount = lineCount;
    }

    public File getActiveFile() {
        return activeFile;
    }

    public void setActiveFile(File file) {
        if (file == null) {
            //throw exception to GUI
        }
        this.activeFile = file;
    }

    public FormatConverter getConverter() {
        return converter;
    }

    public void setConverter(FormatConverter converter) {
        if (converter == null) {
            //throw exception to GUI
        }
        this.converter = converter;
    }
    
    
    public static void main(String[] args) {
        CustomTextFileReader reader = new CustomTextFileReader();
        Map returnedMap = reader.readFile("E:\\java\\lab1.txt");
        MicheleCustomFileRecord activeRecord = new MicheleCustomFileRecord();
        activeRecord = (MicheleCustomFileRecord) returnedMap.get(1);
        System.out.println(activeRecord);
        
    }
    
}
