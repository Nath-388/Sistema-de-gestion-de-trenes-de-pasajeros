package ModuloModelos;
import java.time.LocalDateTime;

public class Boleto {
    private String id;
    private LocalDateTime fechaCompra;
    private LocalDateTime fechaSalida;
    private LocalDateTime fechaLlegada;
    private Pasajero pasajero;
    private Tren tren;
    private double precio;

    public Boleto(LocalDateTime fechaCompra, String id, LocalDateTime fechaSalida, LocalDateTime fechaLlegada, Pasajero pasajero, Tren tren, double precio) {
        this.fechaCompra = fechaCompra;
        this.id = id;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
        this.pasajero = pasajero;
        this.tren = tren;
        this.precio = precio;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public LocalDateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public LocalDateTime getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDateTime fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    public Tren getTren() {
        return tren;
    }

    public void setTren(Tren tren) {
        this.tren = tren;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    ;

}
