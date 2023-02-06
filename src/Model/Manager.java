package Model;

public class Manager {
    private String username;
    private String password;

    public void intel(String message) {
        System.out.println(message);
    }
    
    //Seeing that I used the private keyword, I also used the setters and getters for the username, password, additional information, and work emails.
    public void setUserName(String username) {
        if (username.equalsIgnoreCase("Seto")) {
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
        if (password.equalsIgnoreCase("Nrod3200")) {
            this.password = password;
        } else {
            System.out.println("Incorrect password. Please try again.");
        }
    
    
    }
    //Next I used the getters method for the password follow with the return statement.
    public String getPassword() {
        return password;
    
    }
    
    
    
    
    
    
    
}
