import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Account{

    private String userName;
    private String name;
    private String email;
    private String password;
    private int idNumber; 


    public Account(String userN, String nme, String mail, String pass, int id){


    }


    public String getUserName(){
        
        String userN = userName;

        return userN;

    }

    public String getName(){
        
        String newName = name;

        return newName;

    }

    public String getEMail(){
        
        String mail = email;

        return mail;

    }

    public String getPassword(){
        
        String copyPass = password;

        return Password;

    }

    public int getID(){
        int id = idNumber;

        return id;
    }


    public void setUserName(String userN){
        
        userN = userName;


    }

    public void getName(String newName){
        
        newName = name;


    }

    public void setEMail(String mail){
        
        mail = email;

    }

    public void setPassword(String copyPass){
        
        copyPass = password;

    }

    public void setID(int id){
        id = idNumber;

    }




}