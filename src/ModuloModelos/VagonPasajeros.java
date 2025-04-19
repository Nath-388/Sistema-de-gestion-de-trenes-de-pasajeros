package ModuloModelos;

public class VagonPasajeros extends Vagon{
    private Pasajero[] pasajeros;

    public VagonPasajeros(String id, double cargaMax, Pasajero[] pasajeros) {
        super(id, cargaMax);
        this.pasajeros = pasajeros;
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajero[] pasajeros) {
        this.pasajeros = pasajeros;
    }
}
