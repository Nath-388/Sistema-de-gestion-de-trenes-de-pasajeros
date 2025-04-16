package ModuloModelos;

public class Pasajero {
    private String nombres;
    private String apellidos;
    private int teléfono;
    private Equipaje equipaje;
    private String identificacion;
    private String dirección;
    private String categoria;

    public Pasajero(String nombres, String apellidos, int teléfono, Equipaje equipaje, String identificacion, String dirección, String categoria) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.teléfono = teléfono;
        this.equipaje = equipaje;
        this.identificacion = identificacion;
        this.dirección = dirección;
        this.categoria = categoria;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getTeléfono() {
        return teléfono;
    }

    public void setTeléfono(int teléfono) {
        this.teléfono = teléfono;
    }

    public Equipaje getEquipaje() {
        return equipaje;
    }

    public void setEquipaje(Equipaje equipaje) {
        this.equipaje = equipaje;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}