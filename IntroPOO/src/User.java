public class User {
    // Atributos
    private String name;
    int Age;
    String email;


    public User(String theName, int theAge, String theEmail) {// configura a cada usuario
        this.name = theName;
        this.Age = theAge;
        this.email = theEmail;
    }

    // public User(){ --> contructor vacío.

    // }

    @Override
    public String toString() {
        return "Name: " + name + " Age: " + Age + " Email: " + email;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }


}