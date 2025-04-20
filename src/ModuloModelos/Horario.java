package ModuloModelos;

import java.time.LocalDateTime;

public class Horario {
    private String id;
    private LocalDateTime horaSalida;
    private LocalDateTime horallegada;

    public Horario(String id, LocalDateTime horaSalida, LocalDateTime horallegada) {
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

    public LocalDateTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalDateTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public LocalDateTime getHorallegada() {
        return horallegada;
    }

    public void setHorallegada(LocalDateTime horallegada) {
        this.horallegada = horallegada;
    }
}
