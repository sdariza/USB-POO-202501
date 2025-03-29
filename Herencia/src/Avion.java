public class Avion {// Clase padre
    private String modelo;
    private int capacidadCombustible;
    private int tripulacion;

    public Avion(String modelo, int capacidadCombustible, int tripulacion) {
        this.modelo = modelo;
        this.capacidadCombustible = capacidadCombustible;
        this.tripulacion = tripulacion;
    }

    public void despegar() {
        System.out.println("El avión " + modelo + " ha despegado");
    }

    public void aterrizar() {
        System.out.println("El avión " + modelo + " ha aterrizado");
    }

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadCombustible() {
        return capacidadCombustible;
    }

    public int getTripulacion() {
        return tripulacion;
    }

}
