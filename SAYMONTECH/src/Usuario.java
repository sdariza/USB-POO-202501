import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Usuario {
    private String nombre;
    private String email;
    private String telefono;

    private List<Boleto> boletosCompreados;

    private List<Venta> ventasRealizadas;

    public Usuario(String nombre, String email, String telefono) {
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
        this.boletosCompreados = new ArrayList<>();
        this.ventasRealizadas = new ArrayList<>();
    }

    public void registrarse() {
        System.out.println("Usuario registrado: " + nombre);
    }

    public void iniciarSesion() {
        System.out.println("Sesión iniciada con el usuario: " + nombre);
    }

    public Boleto comprarBoleto(Evento evento) {
        Boleto boleto = evento.generarBoleto(this);
        if (boleto != null) {
            boletosCompreados.add(boleto);
            Venta venta = new Venta(UUID.randomUUID().toString(), LocalDateTime.now(), evento.getPrecioBoletos(), this);
            venta.boletos.add(boleto);
            ventasRealizadas.add(venta);
            System.out.println("Venta realizada exitosamente");
        }
        return boleto;
    }

    public List<Boleto> verBoletosComprados() {
        return new ArrayList<>(boletosCompreados);
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public List<Venta> getVentasRealizadas() {
        return new ArrayList<>(ventasRealizadas);
    }

    public void addBoleto(Boleto boleto) {
        boletosCompreados.add(boleto);
    }

}
