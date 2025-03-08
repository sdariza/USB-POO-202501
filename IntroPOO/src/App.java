public class App {
    public static void main(String[] args) throws Exception {

        Method method = new Method();
        int x = 5;
        int y = 10;
        int result = method.mayor(x, y);
        System.out.println("El mayor entre " + x + " y " + y + " es: " + result);

        // Voy a crear usuarios --> Name, Age, Email
        String name1 = "Juan";
        int age1 = 25;
        String email1 = "email@gmail.com";

        String name2 = "Juan 2";
        int age2 = 5;
        String email2 = "email2@gmail.com";

        String name3 = "Juan 3";
        int age3 = 15;
        String email3 = "email3@gmail.com";

        // Usando intro a POO
        User usuario1 = new User("Juan", 25, "email@email.com");
        User usuario2 = new User("Juan 2", 5, "email2@gmail.com");
        User usuario3 = new User("Juan 3", 15, "email3@gmail.com");

        // Puedes acceder por lo pronto a los atributos de cada usuario
        System.out.println("Name: " + usuario1.getName() + " Age: " + usuario1.Age + " Email:" + usuario1.email);
        System.out.println("Name: " + usuario2.getName() + " Age: " + usuario2.Age + " Email:" + usuario2.email);
        System.out.println("Name: " + usuario3.getName() + " Age: " + usuario3.Age + " Email:" + usuario3.email);

        // Con toString() puedo imprimir todos los atributos de un objeto
        System.out.println(usuario1);
        System.out.println(usuario1.toString());
        System.out.println(usuario1.getClass());
        System.out.println(usuario1.toString().getClass());

        System.out.println(usuario1.toString());
        System.out.println(usuario2.toString());
        System.out.println(usuario3.toString());
        // System.out.println(usuario2.toString());
        // System.out.println(usuario3.toString());

        //
        // usuario1.name = "Juan 1";
        // System.out.println(usuario1.toString());
        System.out.println(usuario1.getName());
        usuario1.setName("Juan 1");
        System.out.println(usuario1.getName());
    }
}
