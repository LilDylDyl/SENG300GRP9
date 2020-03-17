import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Account{

    private String userName;
    private String type;
    private String name;
    private String email;
    private String password;
    private int idNumber; 


    public Account(String userN, String tpe, String nme, String mail, String pass, int id){
        this.userName = userN;
        this.type = tpe;
        this.name = nme;
        this.email = mail;
        this.password = pass;
        this.idNumber = id;
    }


    public String getUserName(){
        
        String userN = this.userName;

        return userN;

    }

    public String getType(){
        
        String userT = this.type;

        return userT;

    }

    public String getName(){
        
        String newName = this.name;

        return newName;

    }

    public String getEMail(){
        
        String mail = this.email;

        return mail;

    }

    public String getPassword(){
        
        String copyPass = this.password;

        return Password;

    }

    public int getID(){
        int id = this.idNumber;

        return id;
    }


    public void setUserName(String userNme){
        String userN = this.userName;
        this.userName = userNme;
        try{
            FileReader reader = new FileReader("accounts.txt");

            BufferedReader accounts_input = new BufferedReader(reader);
            String account = accounts_input.readLine();
            while (account != null){
                if (account.equals(userN)){
                    break;
                }

                 account = accounts_input.readLine();

            }
            accounts_input.close();

        }catch(IOException error){
            error.printStackTrace();
        }
    }

    public void setType(String tpe){
        String userN = this.userName;
        this.type = tpe;
        try{
            FileReader reader = new FileReader("accounts.txt");

            BufferedReader accounts_input = new BufferedReader(reader);
            String account = accounts_input.readLine();
            while (account != null){
                if (account.equals(userN)){
                    break;
                }

                 account = accounts_input.readLine();

            }
            accounts_input.close();

        }catch(IOException error){
            error.printStackTrace();
        }
    }

    public void setName(String newName){
        String userN = this.userName;
        this.name = newName;
        try{
            FileReader reader = new FileReader("accounts.txt");

            BufferedReader accounts_input = new BufferedReader(reader);
            String account = accounts_input.readLine();
            while (account != null){
                if (account.equals(userN)){
                    break;
                }

                 account = accounts_input.readLine();

            }
            accounts_input.close();

        }catch(IOException error){
            error.printStackTrace();
        }


    }

    public void setEMail(String mail){
        String userN = this.userName;
        this.email = mail;
        try{
            FileReader reader = new FileReader("accounts.txt");

            BufferedReader accounts_input = new BufferedReader(reader);
            String account = accounts_input.readLine();
            while (account != null){
                if (account.equals(userN)){
                    break;
                }

                 account = accounts_input.readLine();

            }
            accounts_input.close();

        }catch(IOException error){
            error.printStackTrace();
        }

    }

    public void setPassword(String copyPass){
        String userN = this.userName;
        this.password = copyPass;
        try{
            FileReader reader = new FileReader("accounts.txt");

            BufferedReader accounts_input = new BufferedReader(reader);
            String account = accounts_input.readLine();
            while (account != null){
                if (account.equals(userN)){
                    break;
                }

                 account = accounts_input.readLine();

            }
            accounts_input.close();

        }catch(IOException error){
            error.printStackTrace();
        }

    }

    public void setID(int id){
        String userN = this.userName;
        this.idNumber = id;
        try{
            FileReader reader = new FileReader("accounts.txt");

            BufferedReader accounts_input = new BufferedReader(reader);
            String account = accounts_input.readLine();
            while (account != null){
                if (account.equals(userN)){
                    break;
                }

                 account = accounts_input.readLine();

            }
            accounts_input.close();

        }catch(IOException error){
            error.printStackTrace();
        }

        

    }




}