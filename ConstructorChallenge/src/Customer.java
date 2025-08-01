public class Customer {
    private String name;
    private double creditLimit;
    private String email;

    // constructor


    public Customer() {
        this("Devendra","bhattadevendra60@gmail.com");
    }

    public Customer(String name, String email) {
        this(name, 1000, email);
    }
    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }


    //getter

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
