package ModuloModelos;

public class VagonPasajeros extends Vagon {
    private Pasajero[] pasajeros;


    public VagonPasajeros() {
        super(id, CargaMaxima);
        this.pasajeros = new Pasajero[ModuloUtilidades.Constantes.];
    }

    public boolean agregarPasajero(Pasajero pasajero) {
        for (int i = 0; i < pasajeros.length; i++) {
            if (pasajeros[i] == null) {
                pasajeros[i] = pasajero;
                return true;
            }
        }
        return false;
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

}