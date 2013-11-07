/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author mcullen4
 */
public class CustomConverter {

    /* Converts from Custom Format to a map
     * 
     * Example:
     * 
     * Format:  one data point per line in the file.  First data point is total
     * hour and second data point is total fees
     * 
     *      Array: [22.50, 44.0] where the first item is the total hours and 
     *      second item is total fees.
     */
    
    public Map readConvert(Collection <String> data){
        String [] dataArray = data.toArray(new String[0]);
        String totalHours = dataArray[0];
        String totalFees = dataArray[1];
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("totalHours", totalHours);
        map.put("totalFees", totalFees);
        return map;
    }
    
    public String writeconvert(Map data){
        return null;
    }
    
    
    
    public static void main(String[] args) {
        CustomConverter converter = new CustomConverter();
    }
}
