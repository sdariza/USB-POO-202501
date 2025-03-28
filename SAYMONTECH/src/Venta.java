import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Venta {
    String idTransaccion;
    LocalDateTime fechaCompra;
    double montoCompra;
    Boolean reembolsada;
    List<Boleto> boletos;
    Usuario comprador;

    public Venta(String idTransaccion, LocalDateTime fechaCompra, double montoCompra,
            Usuario comprador) {
        this.idTransaccion = idTransaccion;
        this.fechaCompra = fechaCompra;
        this.montoCompra = montoCompra;
        this.reembolsada = false;
        this.boletos = new ArrayList<>();
        this.comprador = comprador;
    }

    public void procesarVenta() {
        System.out.println("Venta procesada con transaccion: " + idTransaccion);
    }

    public void generarFactura() {
        System.out.println("Factura para la transaccion: " + idTransaccion);
        System.out.println("Comprador: " + comprador.getNombre());
        System.out.println("Monto: " + montoCompra);
        System.out.println("Fecha: " + fechaCompra);
    }

    public void procesarReembolso() {
        if (!reembolsada) {
            reembolsada = true;
            System.out.println("Reembolso procesado para la venta: " + idTransaccion);
        } else {
            System.out.println("Venta ya fue reembolsada!");
        }
    }

    public String getIdTransaccion() {
        return idTransaccion;
    }

    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }

    public double getMontoCompra() {
        return montoCompra;
    }

    public Boolean getReembolsada() {
        return reembolsada;
    }

    public List<Boleto> getBoletos() {
        return new ArrayList<>(boletos);
    }

    public Usuario getComprador() {
        return comprador;
    }

}
