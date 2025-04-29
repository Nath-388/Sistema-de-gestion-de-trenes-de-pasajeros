package ModuloModelos;
import java.util.Arrays;

public class Tren {
    private String nombre;
    private String id;
    private double capacidadCarga;
    private double kilometraje;
    private Vagon[] vagones;
    private int cantidadVagones;

    protected Tren(String nombre, double capacidadCarga, double kilometraje, int maxVagones) {
        this.nombre = nombre;
        this.id = String.valueOf(ModuloUtilidades.GeneradorIDs.generarID(this));
        this.capacidadCarga = capacidadCarga;
        this.kilometraje = kilometraje;
        this.vagones = new Vagon[maxVagones]; // Límite definido por la subclase
        this.cantidadVagones = 0;
    }

    public Vagon[] getVagones() {
        return Arrays.copyOf(vagones, cantidadVagones);
    }


    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public int getCantidadVagones() {
        return cantidadVagones;
    }
}