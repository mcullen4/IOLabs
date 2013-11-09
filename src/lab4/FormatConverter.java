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
public interface FormatConverter  {
//    public abstract Map convertFile(String fileContent);
    
    public abstract Map convertFile (List <Map> fileContent);
//    
//    public abstract Map convertFile (List <Map <K,V>> fileContent);
}
