import java.time.LocalDateTime;
import java.util.UUID;

public class App {
    public static void main(String[] args) throws Exception {

        // Creo el evento
        Evento myEvento = new Evento("Peta Concierto", "Sincelejo",
                47000,
                LocalDateTime.of(2025, 4, 20, 19, 0),
                LocalDateTime.of(2025, 4, 21, 2, 0),
                LocalDateTime.of(2025, 3, 19, 0, 0),
                LocalDateTime.of(2025, 3, 30, 23, 59),
                120.0);

        myEvento.crearEvento();
        System.out.println("Datelles del evento:");
        System.out.println(myEvento.getDetails());
        System.out.println("Boletos disponibles: " + myEvento.calcularBoletosDisponibles());

        // Creo a los artistas

        Artista dady = new Artista("Dady Yannke", "Puerto Rico");
        Artista maluma = new Artista("Maluma", "Colombia");
        Artista badBunny = new Artista("Bad Bunny", "Puerto Rico");

        System.out.println(dady.infoArtista());
        System.out.println(maluma.infoArtista());
        System.out.println(badBunny.infoArtista());

        // Creo la presentación de cada artista

        Presentacion presentacionDady = new Presentacion(LocalDateTime.of(2025, 7, 20, 21, 0),
                LocalDateTime.of(2025, 7, 20, 22, 30), dady, myEvento);

        Presentacion presentacionMaluma = new Presentacion(LocalDateTime.of(2025, 7, 20, 23, 0),
                LocalDateTime.of(2025, 7, 21, 0, 30), maluma, myEvento);

        Presentacion presentacionBad = new Presentacion(LocalDateTime.of(2025, 7, 21, 1, 0),
                LocalDateTime.of(2025, 7, 21, 2, 30), dady, myEvento);

        // Usuarios
        Usuario myUsuario1 = new Usuario("Ana Rodriguez", "ana@gmail.com", "300000000");
        Usuario myUsuario2 = new Usuario("Pedro Perez", "pedro@gmail.com", "300000001");
        Usuario myUsuario3 = new Usuario("Sebastian Ariza", "sebastian@gmail.com", "300000020");

        // Registrar los usuarios:
        myUsuario1.registrarse();
        myUsuario2.registrarse();
        myUsuario3.registrarse();

        // Comprar Boletos

        Boleto myBoleto1 = myUsuario1.comprarBoleto(myEvento);
        Boleto myBoleto2 = myUsuario2.comprarBoleto(myEvento);
        Boleto myBoleto3 = myUsuario3.comprarBoleto(myEvento);

        // Similación de reembolso
        System.out.println("Similación de reembolso");
        System.out.println("Boleto 3");
        if (myBoleto3 != null) {
            System.out.println(myBoleto3.devuelto);
            myBoleto3.solicitarReembolso();
            System.out.println(myBoleto3.devuelto + " " + myBoleto3.utilizado);
        }

        // Simulación de asistencia al evento
        System.out.println("Simulación de asistencia al evento");
        System.out.println("Boleto 2");
        if (myBoleto2 != null) {
            System.out.println(myBoleto2.codigoUnico + " : " + myBoleto2.devuelto + " " + myBoleto2.utilizado);
            myBoleto2.marcarBoleto();
            System.out.println(myBoleto2.codigoUnico + " : " + myBoleto2.devuelto + " " + myBoleto2.utilizado);
        }
        System.out.println("Boleto 1");
        if (myBoleto1 != null) {
            System.out.println(myBoleto1.codigoUnico + " : " + myBoleto1.devuelto + " " + myBoleto1.utilizado);
            myBoleto1.marcarBoleto();
            System.out.println(myBoleto1.codigoUnico + " : " + myBoleto1.devuelto + " " + myBoleto1.utilizado);
        }
        // Detalles del evento
        System.out.println(myEvento.obtenerEstadisticas());
        // Horarios de presentaciones
        System.out.println(presentacionBad.obtenerHorario());
        System.out.println(presentacionMaluma.obtenerHorario());
        System.out.println(presentacionDady.obtenerHorario());

        // Relaciones de composicion y agregación
        System.out.println("Relaciones entre usuario y boletos");
        for (Boleto boleto : myUsuario1.verBoletosComprados()) {
            if (!boleto.getDevuelto()) {
                System.out.println("El usario " + boleto.getPropietario().getNombre() + " Tiene un boleto para: "
                        + boleto.getEvento().getNombre());
            }
        }

        // Tarea: añadir el código que ilustra los demás usuarios y tambié usuario venta

        System.out.println("Relación de artista y presentacion");
        for (Presentacion presentacion : maluma.getPresentaciones()) {
            System.out.println("El artista " + presentacion.getArtista().getName() + " se va a presentar en: "
                    
                    + presentacion.getEvento().getNombre());
        }

    }
}
