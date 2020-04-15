import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.File;

import javax.swing.JOptionPane;

import java.io.FileOutputStream;

public class Account{

    private String userName;
    private String type;
    private String name;
    private String email;
    private String password;
    private int idNumber; 


    public Account(String userN, String tpe, String nme, String mail, String pass){
        try{
            boolean valid = true;
            FileReader reader = new FileReader("accounts.txt");
            FileWriter writer = new FileWriter("accounts.txt", true);
            BufferedReader accountsInput = new BufferedReader(reader);
            //StringBuffer inputBuffer = new StringBuffer();
            //The following saves everything into a String buffer and appends the one line.
            String account = accountsInput.readLine();
            while(account != null){
                    if (account.equals(userN)){
                        System.out.println("User already exists");
                        valid = false;
                        break;
                        
                    } 

                account = accountsInput.readLine();

            }
            accountsInput.close();
            if (valid){
                writer.write("\n");
                writer.write(userN + "\n");
                writer.write(tpe + "\n");
                writer.write(nme + "\n");
                writer.write(mail + "\n");
                writer.write(pass + "\n");
                writer.close();    
            }
            

        }catch(IOException error){
            error.printStackTrace();
        }
        this.userName = userN;
        this.type = tpe;
        this.name = nme;
        this.email = mail;
        this.password = pass;
    }

	public static String VerifyLogin(String username, String password) {

    	String verifyPassword = "";
    	String type = "";
    	
		try{
            FileReader reader = new FileReader("accounts.txt");
            BufferedReader accounts_input = new BufferedReader(reader);
            String account = accounts_input.readLine();

            while (account != null){
                if (account.equals(username)){
                	type = accounts_input.readLine();
                	account = accounts_input.readLine();
                	account = accounts_input.readLine();
                	verifyPassword = accounts_input.readLine();
                	if (verifyPassword.equals(password)) {
                		if (type.equals("Doctor")){
                			return type;
                		}
                		else if (type.equals("Patient")){
                			return type;
                		}
                		else if (type.equals("Staff")){
                			return type;
                		}
                	}
                }
                account = accounts_input.readLine();
            }
            accounts_input.close();
        }
		catch(Exception e){
			System.out.println("Error");
        }
		return type;	
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

        return copyPass;

    }

    public int getID(){
        int id = this.idNumber;

        return id;
    }


    public void setUserName(String newUserName){
        try{
            FileReader reader = new FileReader("accounts.txt");
            BufferedReader accountsInput = new BufferedReader(reader);
            StringBuffer inputBuffer = new StringBuffer();
            //The following saves everything into a String buffer and appends the one line.
            String account = accountsInput.readLine();
            while(account != null){
                    if (account.equals(this.userName)){
                        account = newUserName;
                        inputBuffer.append(account);
                        inputBuffer.append("\n");
                    } else{
                        inputBuffer.append(account);
                        inputBuffer.append("\n");
                    }

                account = accountsInput.readLine();

            }
            accountsInput.close();
            //This reprints the String buffer created above
            FileOutputStream fileOut = new FileOutputStream("accounts.txt");
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();
            this.userName = newUserName;

        }catch(IOException error){
            error.printStackTrace();
        }
    }

    public void setType(String newType){
        //String userN = this.userName;
        //this.type = tpe;
        try{
            FileReader reader = new FileReader("accounts.txt");
            BufferedReader accountsInput = new BufferedReader(reader);
            StringBuffer inputBuffer = new StringBuffer();
            //The following saves everything into a String buffer and appends the one line.
            String account = accountsInput.readLine();
            while(account != null){
                    if (account.equals(this.userName)){
                        int counter = 1;
                        while(counter < 2){
                            inputBuffer.append(account);
                            inputBuffer.append("\n");
                            account = accountsInput.readLine(); 
                            counter += 1; 
                        }
                        account = newType;
                        inputBuffer.append(account);
                        inputBuffer.append("\n");
                    } else{
                        inputBuffer.append(account);
                        inputBuffer.append("\n");
                    }

                account = accountsInput.readLine();

            }
            accountsInput.close();
            //This reprints the String buffer created above
            FileOutputStream fileOut = new FileOutputStream("accounts.txt");
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();
            this.type = newType;

        }catch(IOException error){
            error.printStackTrace();
        }
    }

    public void setName(String newName){
        try{
            FileReader reader = new FileReader("accounts.txt");
            BufferedReader accountsInput = new BufferedReader(reader);
            StringBuffer inputBuffer = new StringBuffer();
            //The following saves everything into a String buffer and appends the one line.
            String account = accountsInput.readLine();
            while(account != null){
                    if (account.equals(this.userName)){
                        int counter = 1;
                        while(counter < 3){
                            inputBuffer.append(account);
                            inputBuffer.append("\n");
                            account = accountsInput.readLine(); 
                            counter += 1; 
                        }
                        account = newName;
                        inputBuffer.append(account);
                        inputBuffer.append("\n");
                    } else{
                        inputBuffer.append(account);
                        inputBuffer.append("\n");
                    }

                account = accountsInput.readLine();

            }
            accountsInput.close();
            //This reprints the String buffer created above
            FileOutputStream fileOut = new FileOutputStream("accounts.txt");
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();
            this.name = newName;

        }catch(IOException error){
            error.printStackTrace();
        }


    }

    public void setEMail(String newEmail){
        try{
            FileReader reader = new FileReader("accounts.txt");
            BufferedReader accountsInput = new BufferedReader(reader);
            StringBuffer inputBuffer = new StringBuffer();
            //The following saves everything into a String buffer and appends the one line.
            String account = accountsInput.readLine();
            while(account != null){
                    if (account.equals(this.userName)){
                        int counter = 1;
                        while(counter < 4){
                            inputBuffer.append(account);
                            inputBuffer.append("\n");
                            account = accountsInput.readLine(); 
                            counter += 1; 
                        }
                        account = newEmail;
                        inputBuffer.append(account);
                        inputBuffer.append("\n");
                    } else{
                        inputBuffer.append(account);
                        inputBuffer.append("\n");
                    }

                account = accountsInput.readLine();

            }
            accountsInput.close();
            //This reprints the String buffer created above
            FileOutputStream fileOut = new FileOutputStream("accounts.txt");
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();
            this.email = newEmail;

        }catch(IOException error){
            error.printStackTrace();
        }
    }

    public void setPassword(String newPassword){
        try{
            FileReader reader = new FileReader("accounts.txt");
            BufferedReader accountsInput = new BufferedReader(reader);
            StringBuffer inputBuffer = new StringBuffer();
            //The following saves everything into a String buffer and appends the one line.
            String account = accountsInput.readLine();
            while(account != null){
                    if (account.equals(this.userName)){
                        int counter = 1;
                        while(counter < 5){
                            inputBuffer.append(account);
                            inputBuffer.append("\n");
                            account = accountsInput.readLine(); 
                            counter += 1; 
                        }
                        account = newPassword;
                        inputBuffer.append(account);
                        inputBuffer.append("\n");
                    } else{
                        inputBuffer.append(account);
                        inputBuffer.append("\n");
                    }

                account = accountsInput.readLine();

            }
            accountsInput.close();
            //This reprints the String buffer created above
            FileOutputStream fileOut = new FileOutputStream("accounts.txt");
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();
            this.password = newPassword;

        }catch(IOException error){
            error.printStackTrace();
        }
    }

    public void setID(Integer newId){
        try{
            FileReader reader = new FileReader("accounts.txt");
            BufferedReader accountsInput = new BufferedReader(reader);
            StringBuffer inputBuffer = new StringBuffer();
            //The following saves everything into a String buffer and appends the one line.
            String account = accountsInput.readLine();
            while(account != null){
                    if (account.equals(this.userName)){
                        int counter = 1;
                        while(counter < 6){
                            inputBuffer.append(account);
                            inputBuffer.append("\n");
                            account = accountsInput.readLine(); 
                            counter += 1; 
                        }
                        account = newId.toString();
                        inputBuffer.append(account);
                        inputBuffer.append("\n");
                    } else{
                        inputBuffer.append(account);
                        inputBuffer.append("\n");
                    }

                account = accountsInput.readLine();

            }
            accountsInput.close();
            //This reprints the String buffer created above
            FileOutputStream fileOut = new FileOutputStream("accounts.txt");
            fileOut.write(inputBuffer.toString().getBytes());
            fileOut.close();
            this.idNumber = newId;

        }catch(IOException error){
            error.printStackTrace();
        }

        

    }

    public static int getPositionOnDataBase(String username, String type, String name, String email, String password) {
		int counter = 0;
		try {
	        FileReader reader = new FileReader("accounts.txt");
	        FileWriter writer = new FileWriter("accounts.txt", true);
	        BufferedReader accountSymbols = new BufferedReader(reader);
	        String uname = accountSymbols.readLine();
	        while(uname != null){
				if(uname.equals(username)){
                    counter++;
                    uname = accountSymbols.readLine();
                    if(uname.equals(type)){
                        uname = accountSymbols.readLine();
                        if(uname.equals(name)){
                            uname = accountSymbols.readLine();
                            if(uname.equals(email)){
                                uname = accountSymbols.readLine();
                                if(uname.equals(password)){
                                    break;
                                }
                            }
                        }
                    }
				}
				uname = accountSymbols.readLine();	
				}
                accountSymbols.close();
                writer.close();
	            
		}catch(IOException error){
            error.printStackTrace();
        }
		return counter;
	}
    public static ArrayList<String> getUserDetails(String username){
        ArrayList<String> accountInfo = new ArrayList<String>();
        try{
            FileReader reader = new FileReader("accounts.txt");
            BufferedReader accountSymbols = new BufferedReader(reader);
            String line = accountSymbols.readLine();
            while(line != null){
				if(line.equals(username)){
					accountInfo.add(line);
					line = accountSymbols.readLine();
					accountInfo.add(line);
                    line = accountSymbols.readLine();
                    accountInfo.add(line);
                    line = accountSymbols.readLine();
                    accountInfo.add(line);
                    line = accountSymbols.readLine();
                    accountInfo.add(line);
				} 
                line = accountSymbols.readLine();
            }
            accountSymbols.close();
            
            
        } catch (IOException error){
			error.printStackTrace();
        }
        return accountInfo;
   }
    
    public static boolean deleteAccount(String username, String type, String name, String email, String password)
	{
        int position = getPositionOnDataBase(username, type, name, email, password);
        int counter = 0;
        boolean accountFound = false;
		try{
			PrintWriter writer = new PrintWriter("temp.txt", "UTF-8");
			FileReader reader = new FileReader("accounts.txt");
            BufferedReader accountSymbols = new BufferedReader(reader);
            StringBuffer inputBuffer = new StringBuffer();
            //The following saves everything into a String buffer and appends the one line.
			String line ="";
			while(line != null){
				line = accountSymbols.readLine();
				if (line != null){
					if(line.equals(username)){
                        counter += 1;
                        if (counter == position){
                            line = accountSymbols.readLine();
                        }
						if(line.equals(type)){
							line = accountSymbols.readLine();
							if (line.equals(name)){
								accountFound = true;
								line = accountSymbols.readLine();
                                line = accountSymbols.readLine();
                                line = accountSymbols.readLine();
                                line = accountSymbols.readLine();
							}
						} 
					} 
					if(line != null)
						writer.println(line);
				}
            }
			accountSymbols.close();
			writer.close();

			String osName = System.getProperty("os.name").toLowerCase();
            boolean isWindows = osName.startsWith("windows");
            if (isWindows) 
            {
                System.out.println("Knows it's windows");
            } else {
                File old = new File("accounts.txt");
                File newFile = new File("temp.txt");
                boolean b = old.delete();
                boolean rename = newFile.renameTo(old);
            }
			

		} catch (IOException error){
			error.printStackTrace();
		}

		return accountFound;
    }

    public static void main(String[] args){
        Account test = new Account("testUser", "Patient", "John Dough", "matty@gmail.ca", "password");
    }




}
