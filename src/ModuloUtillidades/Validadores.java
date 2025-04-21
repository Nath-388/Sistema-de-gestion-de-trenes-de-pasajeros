package ModuloUtillidades;
import ModuloModelos.Ruta;
public class Validadores {
    public static String validarCategoria(String categoria) {
        if (!categoria.equals("Premium") && !categoria.equals("Ejecutivo") && !categoria.equals("Estandar")) {
            return "La categoría debe ser: Premium, Ejecutivo o Estandar.";
        }
        return null;
    }
    
    public static String validarPeso(double peso) {
        if (peso <= 1 || peso > 80) {
            return "El peso del equipaje debe estar entre 1 y 80 kg de lo contrario no sera permitido";
        }
        return null;
    }
    
    public static String validarCantidadMaletas(int cantidadMaletas) {
        if (cantidadMaletas > 2) {
            return "El pasajero solo puede llevar maximo 2 maletas.";
        }
        return null;
    }
    
    public static String validarCantidadVagones(String tipoTren, int cantidadVagones) {
        if (tipoTren.equals("Mercedes-Benz")) {
            if (cantidadVagones < 1 || cantidadVagones > 28) {
                return "Los trenes Mercedes-Benz deben tener entre 1 y 28 vagones.";
            }
        } else if (tipoTren.equals("Arnold")) {
            if (cantidadVagones < 1 || cantidadVagones > 32) {
                return "Los trenes Arnold deben tener entre 1 y 32 vagones.";
            }
        } else {
            return "Tipo de tren no reconocido.";
        }
        return null;
    }
    public static String validarDistribucionPasajeros(int premium, int ejecutivo, int estandar) {
        if (premium > 4 || ejecutivo > 8 || estandar > 22) {
            return "Se ha superado el limite por categoría (Premium: 4, Ejecutivo: 8, Estándar: 22 por vagón).";
        }
        return null;
    }
    public static String validarCantidadVagonesCarga(int vagonesPasajeros, int vagonesCarga) {
        if (vagonesCarga < (vagonesPasajeros / 2)) {
            return "Debe haber al menos un vagon de carga por cada 2 de pasajeros.";
        }
        return null;
    }
    
    public static boolean validarRutaNoEnUso(Ruta ruta) {
        if (ruta != null && ruta.estaEnUso()) {
            System.out.println("La ruta se encuentra en uso y no puede ser modificada");
            return false;
        }
        return true;
    }
    
}
