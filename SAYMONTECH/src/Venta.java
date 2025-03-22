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

    public Venta(String idTransaccion, LocalDateTime fechaCompra, double montoCompra, Boolean reembolsada,
            Usuario comprador) {
        this.idTransaccion = idTransaccion;
        this.fechaCompra = fechaCompra;
        this.montoCompra = montoCompra;
        this.reembolsada = reembolsada;
        this.boletos = new ArrayList<>();
        this.comprador = comprador;
    }

}
