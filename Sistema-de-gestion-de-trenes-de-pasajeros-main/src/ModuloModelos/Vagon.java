package ModuloModelos;

public class Vagon {
    private String id;
    //la carga maxima aplica para lo que es el de equipaje solamente

    public Vagon(String id, double cargaMaxima) {
        this.id = String.valueOf(ModuloUtilidades.GeneradorIDs.generarID(this));//se anexa la funcion la cual generara el id correspondiente
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
