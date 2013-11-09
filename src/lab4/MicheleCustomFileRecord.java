/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Michele
 */
public class MicheleCustomFileRecord {
    private String fullName;
    private String streetAddress;
    private String cityStateZip;
    
    
    public MicheleCustomFileRecord(){}
    
    public MicheleCustomFileRecord(String fullName, String streetAddress, 
            String cityStateZip){
    this.fullName=fullName;
    this.streetAddress=streetAddress;
    this.cityStateZip=cityStateZip;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getCityStateZip() {
        return cityStateZip;
    }

    public void setCityStateZip(String cityStateZip) {
        this.cityStateZip = cityStateZip;
    }

    @Override
    public String toString() {
        return "MicheleCustomFileRecord{" + "fullName=" + fullName + ", streetAddress=" + streetAddress + ", cityStateZip=" + cityStateZip + '}';
    }
    
    
    
    
}
