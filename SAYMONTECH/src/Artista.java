import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String name;
    private String nacionalidad;
    private List<Presentacion> presentaciones;

    public Artista(String name, String nacionalidad) {
        this.name = name;
        this.nacionalidad = nacionalidad;
        this.presentaciones = new ArrayList<>();
    }

    public String infoArtista() {
        return "Artista: " + name + " nacionalidad: " + nacionalidad;
    }

    public void agregarPresentacion(Presentacion presentacion) {
        presentaciones.add(presentacion);
    }

    public String getName() {
        return name;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public List<Presentacion> getPresentaciones() {
        return new ArrayList<>(presentaciones);
    }

}
