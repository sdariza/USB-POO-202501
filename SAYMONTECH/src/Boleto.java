import java.time.LocalDateTime;

public class Boleto {
    String codigoUnico;
    String codigoQR;
    LocalDateTime fechaCompra;
    Boolean utilizado;
    Boolean devuelto;
    Usuario propietario;
    Evento evento;
    Venta venta;

    public Boleto(String codigoUnico, LocalDateTime fechaCompra, Usuario propietario, Evento evento) {
        this.codigoUnico = codigoUnico;
        this.fechaCompra = fechaCompra;
        this.utilizado = false;
        this.devuelto = false;
        this.evento = evento;
        this.propietario = propietario;
        generarQR();
    }

    public void generarQR() {
        this.codigoQR = "QR-" + codigoUnico;
    }

}
