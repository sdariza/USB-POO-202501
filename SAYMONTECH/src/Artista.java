import java.util.ArrayList;
import java.util.List;

public class Artista {
    String name;
    String nacionalidad;
    List<Presentacion> presentaciones;

    public Artista(String name, String nacionalidad) {
        this.name = name;
        this.nacionalidad = nacionalidad;
        this.presentaciones = new ArrayList<>();
    }

}
