import Model.Employee;
import Model.Manager;

public class App {
    public static void main(String[] args) throws Exception {
        
        Employee info = new Employee();
        info.intel("Hello there, please sign in or create a new account");
        
        Employee info2 = new Employee();


        info2.setUserName("nomekop");
        info2.setPassword("arbil1094");
        info2.setInforma("Adrian Moria, April 3rd 1998, Male");
        info.setEmail(2);


        System.out.println(info2.getUserName());
        System.out.println(info2.getPassword());
        System.out.println(info2.getInforma());
        System.out.println(info2.getEmail());


        Manager mg = new Manager();
        mg.intel("Hello there, please create an account or sign in.");
        
        mg.setUserName("");
        mg.setPassword("");
        
        System.out.println(mg.getUserName());
        System.out.println(mg.getPassword());

    }
}
