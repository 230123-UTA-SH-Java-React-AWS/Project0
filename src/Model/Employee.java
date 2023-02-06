package Model;

public class Employee {

    //To get started I decided to incorporate fields into my Employee class. And I made them private since this is sensitive information.
    private String username;
    private String password;
    private String informa;
    private int email;
    
    public void intel(String message) {
        System.out.println(message);
    }
    
    //Seeing that I used the private keyword, I also used the setters and getters for the username, password, additional information, and work emails.
    public void setUserName(String username) {
        if (username.equalsIgnoreCase("nomekop")) {
            this.username = username;
        } else {
            System.out.println("Incorrect username. Please try again.");
        }
    
    
    
    }
    
    public String getUserName() {
        return username;
    }
    
    
    // Here I used the setters method in combination with the if and else statement.
    public void setPassword(String password) {
        if (password.equalsIgnoreCase("arbil1094")) {
            this.password = password;
        } else {
            System.out.println("Incorrect password. Please try again.");
        }
    
    
    }
    //Next I used the getters method for the password follow with the return statement.
    public String getPassword() {
        return password;
    
    }
    
    
    public void setInforma(String informa) {
        if(informa.equalsIgnoreCase("Adrian Moria, April 3rd 1998, Male")) {
            System.out.println("Welcome to your account settings. Feel free to change any information within your account.");
            this.informa = informa;
        } else {
            System.out.println("That username is not on file. Please create a new account so we can verify it.");
        }
    
        
    
    
    }
    
    public String getInforma() {
        return informa;
    }
    
    
    public void setEmail(int email) {
        if(email <= 0) {
            System.out.println("You are caught up to date with your emails");
        } else {
            System.out.println("You have numerous unread emails in your account");
        }
    
    }
    
    public int getEmail() {
        return email;
    }
    
    
    
        
    }
    
    
