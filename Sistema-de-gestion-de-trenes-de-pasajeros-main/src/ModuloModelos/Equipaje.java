package ModuloModelos;

public class Equipaje {
    private String id;
    private double peso;
    private Vagon vagonAsignado;

    public Equipaje(double peso, Vagon vagonAsignado) {
        this.id = String.valueOf(ModuloUtilidades.GeneradorIDs.generarID(this)); // se anexa la función la cual generará el id correspondiente
        this.peso = peso;
        this.vagonAsignado = vagonAsignado;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Vagon getVagonAsignado() {
        return vagonAsignado;
    }

    public void setVagonAsignado(Vagon vagonAsignado) {
        this.vagonAsignado = vagonAsignado;
    }
}
