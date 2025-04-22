package ModuloModelos;
import java.time.LocalDate;
import java.time.LocalTime;

public class Boleto {
    private String id;
    private LocalDate fechaCompra;
    private LocalTime fechaSalida;
    private LocalTime fechaLlegada;
    private Pasajero pasajero;
    private Tren tren;
    private double precio;

    public Boleto(LocalDate fechaCompra, String id, LocalTime fechaSalida, LocalTime fechaLlegada, Pasajero pasajero, Tren tren, double precio) {
        this.fechaCompra = fechaCompra;
        this.id = String.valueOf(ModuloUtilidades.GeneradorIDs.generarID(this));//se anexa la funcion la cual generara el id correspondiente
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

    public LocalDate getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(LocalDate fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public LocalTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public LocalTime getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalTime fechaLlegada) {
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


}
