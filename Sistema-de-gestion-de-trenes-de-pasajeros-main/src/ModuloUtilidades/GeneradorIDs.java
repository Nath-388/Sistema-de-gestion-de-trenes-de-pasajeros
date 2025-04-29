package ModuloUtilidades;

import ModuloModelos.Boleto;
import ModuloModelos.Tren;
import ModuloModelos.Equipaje;
import ModuloModelos.Estacion;
import ModuloModelos.Horario;
import ModuloModelos.Ruta;
import ModuloModelos.Vagon;

public class GeneradorIDs {

    private static int contadorTrenes = 1001;
    private static int contadorBoletos = 2001;
    private static int contadorEquipaje = 3001;
    private static int contadorEstacion = 4001;
    private static int contadorHorario = 5001;
    private static int contadorRuta = 6001;
    private static int contadorVagon = 7001;

    public static int generarID(Object objeto) {
        if (objeto instanceof Tren) {
            return contadorTrenes < 2000 ? contadorTrenes++ : error("trenes");
        } else if (objeto instanceof Boleto) {
            return contadorBoletos < 3000 ? contadorBoletos++ : error("boletos");
        } else if (objeto instanceof Equipaje) {
            return contadorEquipaje < 4000 ? contadorEquipaje++ : error("equipajes");
        } else if (objeto instanceof Estacion) {
            return contadorEstacion < 5000 ? contadorEstacion++ : error("estaciones");
        } else if (objeto instanceof Horario) {
            return contadorHorario < 6000 ? contadorHorario++ : error("horarios");
        } else if (objeto instanceof Ruta) {
            return contadorRuta < 7000 ? contadorRuta++ : error("rutas");
        } else if (objeto instanceof Vagon) {
            return contadorVagon < 8000 ? contadorVagon++ : error("vagones");
        } else {
            System.out.println("Tipo de objeto no reconocido.");
            return 0;
        }
    }

    private static int error(String tipo) {
        System.out.println("Límite de " + tipo + " alcanzado.");
        return 0;
    }
}
