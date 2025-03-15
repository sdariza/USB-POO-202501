public class App {
    public static void main(String[] args) throws Exception {
        Customer customer1 = new Customer("Ana Paez");

        Order order1 = new Order("ORD-1", "Esta es una orden de ana, todos los paquetes se envian...");
        Order order2 = new Order("ORD-2", "Esta es la 2nd orden de ana, todos los paquetes se envian...");

        customer1.addOrder(order1);
        customer1.addOrder(order2);
        customer1.showOrders();

        Customer customer2 = new Customer("Juan Perez");
        Order order3 = new Order("ORD-3", "Primera orden de Juan");
        customer2.addOrder(order3);
        customer2.showOrders();
        // +++++++++++++++++++++++++++++++++++++++++++++
        
        Person person1 = new Person("Sebastian");
        Address address = new Address("Calle falsa 15F", "Barranquilla");
        person1.setAddress(address);
        System.out.println(person1.getAddress());
        System.out.println(address.getPerson());
    }
}
