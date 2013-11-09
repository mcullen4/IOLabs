/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author mcullen4
 */
public class MicheleCustomConverter implements FormatConverter{

    private int LINES_PER_RECORD;
    private List <Map> fileContent;
    
//    public Map convertFile(List <Map> data){
//        Map  map = new LinkedHashMap ();
//        for (int i = 0; i<data.size(); i++){
//        map.putAll(data.get(i));
//                
//        }
//
//        return map;
//    }
    
    @Override
    public Map convertFile(List <Map> fileContent){
    this.fileContent=fileContent;
    
    Map map = new LinkedHashMap();
    Set keys = map.keySet();
    
    for (Map m:fileContent)
    {
    map.putAll(m);
    
    
    }
    
    
    return map;
    
    }
    
    public String writeconvert(Map data){
        return null;
    }
    
    
    
    public static void main(String[] args) {
        MicheleCustomConverter converter = new MicheleCustomConverter();
    }

    
}
