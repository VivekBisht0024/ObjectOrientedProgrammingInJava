class Account{
    public String name;
    protected String password;


    public String getPassword(){
        return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Account ac = new Account();
        ac.setPassword("abcd");
        System.out.println(ac.getPassword());
        
    }
}
