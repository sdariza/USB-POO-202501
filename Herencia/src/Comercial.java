public class Comercial extends Avion {// Clase hija de Avion
    private int pasajeros;
    private String aerolinea;

    public Comercial(String modelo, int capacidadCombustible, int tripulacion, int pasajeros, String aerolinea) {
        super(modelo, capacidadCombustible, tripulacion);
        this.pasajeros = pasajeros;
        this.aerolinea = aerolinea;
    }

    public void servirComida() {
        System.out.println("Sirviendo comida a los" + pasajeros + " pasajeros");
    }

    public void anuniarVuelo() {
        System.out.println("Bienvendidos a bordo del vuelo de: " + aerolinea);
    }

}
