package ModuloModelos.TipoTren;
import ModuloModelos.Tren;
import ModuloUtilidades.Constantes;

public class TrenMercedes_Benz extends Tren {

    private static final int VagonesMaximos = Constantes.VAGONES_MAXIMOS_MERCEDES;

    public TrenMercedes_Benz(String nombre, double capacidadCarga, double kilometraje) {
        super(nombre, capacidadCarga, kilometraje, VagonesMaximos);
    }
}