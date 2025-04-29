package ModuloModelos;
import java.time.LocalTime;

public class Horario {
    private String id;
    private LocalTime horaSalida;
    private LocalTime horallegada;

    public Horario( LocalTime horaSalida, LocalTime horallegada) {
        this.id = String.valueOf(ModuloUtilidades.GeneradorIDs.generarID(this));//se anexa la funcion la cual generara el id correspondiente
        this.horaSalida = horaSalida;
        this.horallegada = horallegada;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalTime getHorallegada() {
        return horallegada;
    }

    public void setHorallegada(LocalTime horallegada) {
        this.horallegada = horallegada;
    }
}
