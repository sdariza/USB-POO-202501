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

    public boolean validarBoleto() {
        return !utilizado && !devuelto;
    }

    public void marcarBoleto() {
        if (!utilizado && !devuelto) {
            this.utilizado = true;
            System.out.println("El boleto se ha marcado como utilizado");
        } else {
            System.out.println("El boleto ya ha sido utilizado");
        }
    }

    public boolean solicitarReembolso() {
        LocalDateTime limiteEnDiasReembolso = fechaCompra.plusDays(2);

        if (!utilizado && !devuelto && LocalDateTime.now().isBefore(limiteEnDiasReembolso)) {
            this.devuelto = true;
            evento.incrementarBoletosDevueltos();
            System.out.println("Reeembolso procesaso con exitosamente");
            return true;
        }
        System.out.println("No es posible realizar el reembolso");
        return false;
    }
    
    public String getCodigoUnico() {
        return codigoUnico;
    }

    public String getCodigoQR() {
        return codigoQR;
    }

    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }

    public Boolean getUtilizado() {
        return utilizado;
    }

    public Boolean getDevuelto() {
        return devuelto;
    }

    public Usuario getPropietario() {
        return propietario;
    }

    public Evento getEvento() {
        return evento;
    }

    public Venta getVenta() {
        return venta;
    }

}
