package ModuloModelos;

public class VagonPasajeros extends Vagon{
    private Pasajeros[] pasajeros;

    public VagonPasajeros(Pasajeros[] pasajeros) {
        this.pasajeros = pasajeros;
    }

    public Pasajeros[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajeros[] pasajeros) {
        this.pasajeros = pasajeros;
    }
}
