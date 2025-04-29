package ModuloModelos.TipoTren;
import ModuloModelos.Tren;
import ModuloUtilidades.Constantes;

public class TrenArnold extends Tren {
    private static final int VagonesMaximos = Constantes.VAGONES_MAXIMOS_ARNOLD;

    public TrenArnold(String nombre, double capacidadCarga, double kilometraje) {
        super(nombre, capacidadCarga, kilometraje, VagonesMaximos);
    }
}