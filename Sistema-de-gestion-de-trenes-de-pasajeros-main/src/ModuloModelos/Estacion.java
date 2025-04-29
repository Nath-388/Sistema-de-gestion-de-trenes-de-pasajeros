package ModuloModelos;
public class Estacion {
    private String id;
    private String nombre;

    public Estacion(String nombre) {
        this.id = String.valueOf(ModuloUtilidades.GeneradorIDs.generarID(this));//se anexa la funcion la cual generara el id correspondiente
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
