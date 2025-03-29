import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Evento {
    private String nombre;
    private String ciudad;
    private int capacidad;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private LocalDateTime fechaInicioVentas;
    private LocalDateTime fechaFinVentas;
    private Double precioBoletos;
    private int boletosVendidos;
    private int boletosDevueltos;
    private int personasAsistentes;
    private List<Boleto> boletos;
    private List<Presentacion> presentacions;

    public Evento(String nombre, String ciudad, int capacidad, LocalDateTime fechaInicio, LocalDateTime fechaFin,
            LocalDateTime fechaInicioVentas, LocalDateTime fechaFinVentas, Double precioBoletos) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.fechaInicioVentas = fechaInicioVentas;
        this.fechaFinVentas = fechaFinVentas;
        this.precioBoletos = precioBoletos;
        this.boletosVendidos = 0;
        this.boletosDevueltos = 0;
        this.personasAsistentes = 0;
        this.boletos = new ArrayList<>();
        this.presentacions = new ArrayList<>();
    }

    public void crearEvento() {
        System.out.println("Evento creado exitosamente: " + nombre);
    }

    public String getDetails() {
        DateTimeFormatter formater = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        return "Evento: " + nombre + " ciudad: " + ciudad + " capacidad " + capacidad + " Fecha y hora: "
                + fechaInicio.format(formater) + " Precio: " + precioBoletos;
    }

    public int calcularBoletosDisponibles() {
        return capacidad - (boletosVendidos - boletosDevueltos);
    }

    public void confirmarAsistencia() {
        personasAsistentes++;
    }

    public void incrementarBoletosDevueltos() {
        this.boletosDevueltos++;
    }

    public Boleto generarBoleto(Usuario usuario) {
        if (LocalDateTime.now().isBefore(fechaInicioVentas) || LocalDateTime.now().isAfter(fechaFin)) {
            System.out.println("Fechas fuera del rango establecido");
            return null;
        }
        if (calcularBoletosDisponibles() < 1) {
            System.out.println("No hay boletos disponibles");
            return null;
        }

        Boleto boleto = new Boleto(UUID.randomUUID().toString(), LocalDateTime.now(), usuario, this);
        boletos.add(boleto);
        boletosVendidos++;
        return boleto;

    }

    public String obtenerEstadisticas() {
        return "Estadísticas del evento: " + nombre +
                "\nBoletos vendidos: " + boletosVendidos +
                "\nBoletos devueltos: " + boletosDevueltos +
                "\nPersonas que asistieron: " + personasAsistentes;
    }

    public void agregarPresentacion(Presentacion presentacion) {
        presentacions.add(presentacion);
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public LocalDateTime getFechaInicioVentas() {
        return fechaInicioVentas;
    }

    public LocalDateTime getFechaFinVentas() {
        return fechaFinVentas;
    }

    public Double getPrecioBoletos() {
        return precioBoletos;
    }

    public int getBoletosVendidos() {
        return boletosVendidos;
    }

    public int getBoletosDevueltos() {
        return boletosDevueltos;
    }

    public int getPersonasAsistentes() {
        return personasAsistentes;
    }

    public List<Boleto> getBoletos() {
        return boletos;
    }

    public List<Presentacion> getPresentacions() {
        return new ArrayList<>(presentacions);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setFechaFin(LocalDateTime fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setFechaInicioVentas(LocalDateTime fechaInicioVentas) {
        this.fechaInicioVentas = fechaInicioVentas;
    }

    public void setFechaFinVentas(LocalDateTime fechaFinVentas) {
        this.fechaFinVentas = fechaFinVentas;
    }

    public void setPrecioBoletos(Double precioBoletos) {
        this.precioBoletos = precioBoletos;
    }

    public void setBoletosVendidos(int boletosVendidos) {
        this.boletosVendidos = boletosVendidos;
    }

    public void setBoletosDevueltos(int boletosDevueltos) {
        this.boletosDevueltos = boletosDevueltos;
    }

    public void setPersonasAsistentes(int personasAsistentes) {
        this.personasAsistentes = personasAsistentes;
    }

    public void setBoletos(List<Boleto> boletos) {
        this.boletos = boletos;
    }

    public void setPresentacions(List<Presentacion> presentacions) {
        this.presentacions = presentacions;
    }

}
