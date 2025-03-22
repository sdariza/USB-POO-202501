import java.time.LocalDateTime;

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
    }
}
