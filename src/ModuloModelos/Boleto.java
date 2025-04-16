package ModuloModelos;

public class Boleto {
    private String id;
    private DateTime fechaCompra;
    private DateTime fechaSalida;
    private DateTime fechaLlegada;
    private Pasajero pasajero;
    private Tren tren;
    private double precio

    public Boleto(DateTime fechaCompra, String id, DateTime fechaSalida, DateTime fechaLlegada, Pasajero pasajero, Tren tren, double precio) {
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

    public DateTime getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(DateTime fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public DateTime getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(DateTime fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }

    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    public DateTime getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(DateTime fechaLlegada) {
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
