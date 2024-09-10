/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contacts;

import java.util.regex.Pattern;

/**
 *
 * @author Elnemr
 */
public class Client {
    private String fullName;
    private String phoneNumber;
    private String gmail;
    private String city;
    private String message;
    private boolean f;
    
    {
        message = "";
        fullName = "";
        phoneNumber = "";
        gmail = "";
        city = "";
        f = true;
    }
    public String getMessage(){
        return message;
    }

    public Client(String fullName,String phoneNumber,String gmail,String city) {
        this(fullName,phoneNumber,gmail);
        setCity(city) ;
    }

    public Client(String fullName,String phoneNumber,String gmail) {
        setFullName(fullName) ;
        setPhoneNumber (phoneNumber);
        setGmail(gmail) ;
    }
    
    public String getFullName(){
        return fullName.trim();
    }
    public void setFullName(String fullName){
        if(!fullName.isEmpty()&& fullName.trim().length()>=10){
            this.fullName = fullName.trim();
        }
        else{
            message += "Full Name Is Invalid \n";
            f = false;
        }
        
       
    }
   
    public String getPhoneNumber(){
        return phoneNumber.trim();
    }
    public void setPhoneNumber(String phoneNumber){
        if(Pattern.matches("((\\+201)|(201)|(01))[0125]\\d{8}",phoneNumber.trim()))
        {
          this.phoneNumber = phoneNumber.trim();
        }
        else{
            message += "Phone Number Is Invalid \n";
            f = false;
        }
    }
    
    public String getGmail(){
        return gmail.trim().toLowerCase();
    }
   
    public void setGmail(String gmail){
        if(Pattern.matches("[a-z0-9]{5,20}@[a-z]{3,6}\\.[a-z]{3,6}", gmail.trim())){
            this.gmail = gmail.trim();
        }
        else
        {
            message += "Gmail Is Invalid \n";
            f = false;
        }
    }
    
    public String getCity(){
        return city.trim();
    }
    public void setCity(String city){
        if(city.trim().length()<20 || city.trim().length()>3)
        {
            this.city = city.trim();
        }
        else{
            message += "City Is Invalid \n";
            f= false;
        }
        
    }
   
    public boolean falg(){
        return f;
    }
    
}

