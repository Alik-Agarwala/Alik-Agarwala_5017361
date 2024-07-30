package Week1.Module1DesignPatternsAndPrinciples.DependencyInjectionExample;

public class Customer {
    private String id;
    private String name;
    private String email;

    // Constructor
    public Customer(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Getters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Customer{id='" + id + "', name='" + name + "', email='" + email + "'}";
    }
}
