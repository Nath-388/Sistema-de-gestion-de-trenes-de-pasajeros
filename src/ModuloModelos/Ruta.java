package ModuloModelos;

public class Ruta {
    private String nombre;
    private String id;
    private Tren tren;
    private Horario horario;
    private Estacion[] estaciones;
    private boolean estaEnUso;

    public Ruta(String nombre, String id, Tren tren, Horario horario, Estacion[] estaciones) {
        this.nombre = nombre;
        this.id = id;
        this.tren = tren;
        this.horario = horario;
        this.estaciones = estaciones;
        this.estaEnUso = false;
    }

    public boolean estaEnUso() {
        return estaEnUso;  
    }

    public void setEnUso(boolean estaEnUso) {
        this.estaEnUso = estaEnUso;  
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

    public Tren getTren() {
        return tren;
    }

    public void setTren(Tren tren) {
        this.tren = tren;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }

    public Estacion[] getEstaciones() {
        return estaciones;
    }

    public void setEstaciones(Estacion[] estaciones) {
        this.estaciones = estaciones;
    }
}
