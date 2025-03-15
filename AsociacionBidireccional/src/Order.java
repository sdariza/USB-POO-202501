public class Order {
    private String id;
    private String description;

    private Customer customer;

    public Order(String id, String theDescription) {
        this.id = id;
        description = theDescription;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDescription() {
        return description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
