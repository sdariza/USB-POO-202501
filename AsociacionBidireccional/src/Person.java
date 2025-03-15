public class Person {
    private String name;
    private Address address;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address; // Person ----> Address
        address.setPerson(this); // Person <--- Address
    }

    @Override
    public String toString() {
        return "Name: " + name + " Address: " + address;
    }
}
