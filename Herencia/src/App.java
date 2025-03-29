public class App {
    public static void main(String[] args) throws Exception {
        Comercial myComercial1 = new Comercial("avx 011", 50000, 4, 416, "Avianca");
        System.out.println(myComercial1.getModelo());// nota que puedes acceder a atributos en la clase padre
        myComercial1.anuniarVuelo();
        myComercial1.despegar();
        myComercial1.servirComida();
        myComercial1.aterrizar();

        Militar myMilitar1 = new Militar("Fc23 Rap", 20000, 1, "misiles aire-aire", true);

        myMilitar1.despegar();
        myMilitar1.activarSigiloso();
        myMilitar1.disparar();
        myMilitar1.aterrizar();

        // Tarea: Simula la herencia entre un cuadrado y un rectángulo
    }
}
