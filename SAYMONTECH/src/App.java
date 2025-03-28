import java.time.LocalDateTime;
import java.util.UUID;

public class App {
    public static void main(String[] args) throws Exception {
        Evento myEvento = new Evento("Peta Concierto", "Sincelejo",
                47000,
                LocalDateTime.of(2025, 7, 20, 19, 0),
                LocalDateTime.of(2025, 7, 21, 2, 0),
                LocalDateTime.of(2025, 5, 19, 0, 0),
                LocalDateTime.of(2025, 6, 30, 23, 59),
                120.0);

        myEvento.crearEvento();
        System.out.println("Datelles del evento:");
        System.out.println(myEvento.getDetails());
        System.out.println("Boletos disponibles: " + myEvento.calcularBoletosDisponibles());

        Artista dady = new Artista("Dady Yannke", "Puerto Rico");

        System.out.println(dady.infoArtista());

        // Presentacion presentacionDady = new Presentacion();

    }
}
