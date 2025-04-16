package ModuloModelos;

public class Horario {
    private String id;
    private DateTime horaSalida;
    private DateTime horallegada;

    public Horario(String id, DateTime horaSalida, DateTime horallegada) {
        this.id = id;
        this.horaSalida = horaSalida;
        this.horallegada = horallegada;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(DateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public DateTime getHorallegada() {
        return horallegada;
    }

    public void setHorallegada(DateTime horallegada) {
        this.horallegada = horallegada;
    }
}
