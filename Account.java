public class Account {

    private String id;
    private String password;
    private String email;
    private String name;
    private String lastname;
    private int age;

    public Account(String id, String password, String email, String name, String lastname, int age) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public void updateAccount(String id, String password, String email, String name, String lastname, int age) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
    }

    public Account signUp(String id, String password, String email, String name, String lastname, int age) {
        return new Account(id, password, email, name, lastname, age);
    }



    
}