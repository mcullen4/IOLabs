/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.List;
import java.util.Map;

/**
 *
 * @author Michele
 */
public class TextReader implements FileReader {
    FormatConverter formatter;
    
    public TextReader(FormatConverter formatter){
    this.formatter = formatter;
    }
    
    @Override
    public Map readFile(String path){
     //read the path, instantiate a file and convert the data to a list of maps   
        List <Map> fileContent = null;    
        
    Map map = formatter.convertFile(fileContent);
    return map;
    };
}
