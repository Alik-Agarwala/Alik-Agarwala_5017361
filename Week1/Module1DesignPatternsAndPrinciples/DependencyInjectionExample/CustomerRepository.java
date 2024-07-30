package Week1.Module1DesignPatternsAndPrinciples.DependencyInjectionExample;

public interface CustomerRepository {
    Customer findCustomerById(String id);
}
