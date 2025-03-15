import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String theName) {
        this.name = theName;
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        this.orders.add(order);// customer ---> Cliente
        order.setCustomer(this);// Customer <--- Cliente
    }

    public String getName() {
        return name;
    }

    public void showOrders() {
        System.out.println("Cliente: " + name);
        System.out.println("Tiene las siguientes ordenes:");
        for (Order order : orders) {
            System.out.println("-" + order.getId()+ " Desc:"+ order.getDescription());
        }
    }

}
