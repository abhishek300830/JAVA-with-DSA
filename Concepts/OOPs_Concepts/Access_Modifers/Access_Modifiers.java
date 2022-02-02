package Concepts.OOPs_Concepts.Access_Modifers;

class Account{
    public String name;     // public: accessed anywhere
    String phone;           // default: only accessed with in the package
    protected String email; // Protected: accessed by package and by sub classes using inheritance
    private String password;
    void setPassword(String pass){
        this.password=pass;
    }
    String getPassword(){
        return this.password;
    }
}

public class Access_Modifiers {
    public static void main(String[] args) {
        Account a = new Account();
        a.setPassword("ABCD");
        System.out.println(a.getPassword());
        
    }
}
