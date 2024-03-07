import java.util.HashMap;
import java.util.Map;

public class Account {

    private String id;
    private String password;
    private String email;
    private String name;
    private String lastname;
    private int age;
     // Simulation  d'une base de données en mémoire
    private static Map<String, Account> accountsDB = new HashMap<>();

    public Account(String id, String password, String email, String name, String lastname, int age) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        // Ajouter le compte à la "base de données" 
        accountsDB.put(email, this);
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

    public Account login(String email, String password) {
        Account account = accountsDB.get(email);
        if (account != null && account.password.equals(password)) {
            System.out.println("Connexion réussie.");
            return account;
        } else {
            throw new IllegalArgumentException("Informations de connexion incorrectes.");
        }
    }



    
}