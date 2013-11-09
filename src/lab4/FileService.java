/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Map;

/**
 *
 * @author Michele
 */
public class FileService {
    
       
    private FileReader reader;
    
    public FileService(FileReader reader /*FileWriter writer */){
    //validate    
    this.reader=reader;
    }
    
    public Map readFile(String filePath){
    Map map = reader.readFile(filePath);
    return map;
    }
    
}
