package ModuloModelos;

public class Tren {
    private String nombre;
    private String id;
    private double capacidadCarga;
    private double kilometraje;
    private Vagon[] vagones;

    public Tren(String nombre, String id, double capacidadCarga, double kilometraje, Vagon[] vagones) {
        this.nombre = nombre;
        this.id = id;
        this.capacidadCarga = capacidadCarga;
        this.kilometraje = kilometraje;
        this.vagones = vagones;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Vagon[] getVagones() {
        return vagones;
    }

    public void setVagones(Vagon[] vagones) {
        this.vagones = vagones;
    }
}
