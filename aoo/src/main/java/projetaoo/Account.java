package projetaoo;

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

    public static Account signUp(String id, String password, String repeatPassword, String email, String name, String lastname, int age) {
        if (password == null || password.length() <= 6) {
            throw new IllegalArgumentException("Le mot de passe doit contenir plus de 6 caractères.");
        }
        if (!password.equals(repeatPassword)) {
            throw new IllegalArgumentException("Les mots de passe ne correspondent pas.");
        }
        if (!password.contains("@")) {
            throw new IllegalArgumentException("Le mot de passe doit contenir le caractère '@'.");
        }
        return new Account(id, password, email, name, lastname, age);
    }

 



    
}