public class Militar extends Avion {// Clase hija de Avion

    private String tipoArmamento;
    private boolean esSigiloso;

    public Militar(String modelo, int capacidadCombustible, int tripulacion, String tipoArmamento, boolean esSigiloso) {
        super(modelo, capacidadCombustible, tripulacion);
        this.tipoArmamento = tipoArmamento;
        this.esSigiloso = esSigiloso;
    }

    public void disparar() {
        System.out.println("Avión disparando " + tipoArmamento);
    }

    public void activarSigiloso() {
        if (esSigiloso) {
            System.out.println("Modo sigiloso activado");
        } else {
            System.out.println("Este avión no tiene capacidad de sigilo");
        }
    }

    public String getTipoArmamento() {
        return tipoArmamento;
    }

    public boolean isEsSigiloso() {
        return esSigiloso;
    }

}
