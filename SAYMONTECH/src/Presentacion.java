import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Presentacion {
    private LocalDateTime horaInicio;
    private LocalDateTime horaFin;
    private Artista artista;
    private Evento evento;

    public Presentacion(LocalDateTime horaInicio, LocalDateTime horaFin, Artista artista, Evento evento) {
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.artista = artista;
        this.evento = evento;
        artista.agregarPresentacion(this);
        evento.agregarPresentacion(this);
    }

    public void programarEvento() {
        System.out.println("Presentacion programada para: " + artista.getName() + " en: " + evento.getNombre());
    }

    public String obtenerHorario() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
        return "Presentacion de: " + artista.getName() + " desde: " + horaInicio.format(formatter) + " hasta: "
                + horaFin.format(formatter);
    }

    public LocalDateTime getHoraInicio() {
        return horaInicio;
    }

    public LocalDateTime getHoraFin() {
        return horaFin;
    }

    public Artista getArtista() {
        return artista;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setHoraInicio(LocalDateTime horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setHoraFin(LocalDateTime horaFin) {
        this.horaFin = horaFin;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

}
