package ModuloModelos;

public class Vagon {
    private String id;
    private double cargaMaxima;

    public Vagon(String id, double cargaMaxima) {
        this.id = id;
        this.cargaMaxima = cargaMaxima;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }
}
