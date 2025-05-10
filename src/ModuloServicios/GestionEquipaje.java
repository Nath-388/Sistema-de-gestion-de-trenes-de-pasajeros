package ModuloServicios;
import ModuloEstructuras.NodoLista;
import ModuloModelos.VagonEquipaje;
import ModuloUtillidades.Validadores;
import ModuloModelos.Equipaje;

public class GestionEquipaje {

    private NodoLista<VagonEquipaje> cabeza;

    public GestionEquipaje() {
        cabeza = null;
    }
    public void agregarVagon(VagonEquipaje vagon) {
        NodoLista<VagonEquipaje> nuevo = new NodoLista<>(vagon);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoLista<VagonEquipaje> actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }
    public boolean agregarEquipaje(Equipaje equipaje) {
        String errorPeso = Validadores.validarPeso(equipaje.getPeso());
        if (errorPeso != null) {
            imprimirError(errorPeso);
            return false;
        }
        String idPasajero = equipaje.getId();
        int contadorMaletas = contarMaletas(idPasajero);
        String errorCantidad = Validadores.validarCantidadMaletas(contadorMaletas + 1);
        if (errorCantidad != null) {
            imprimirError(errorCantidad);
            return false;
        }

        if (intentarAgregarEquipaje(equipaje)) {
            return true;
        }

        imprimirError("No hay espacio disponible en ningún vagón.");
        return false;
    }
    private int contarMaletas(String idPasajero) {
        int contador = 0;
        NodoLista<VagonEquipaje> actual = cabeza;
        while (actual != null) {
            Equipaje[] equipajes = actual.getDato().getEquipaje();
            int i = 0;
            while (i < equipajes.length) {
                Equipaje equipaje = equipajes[i];
                if (equipaje != null && equipaje.getId().equals(idPasajero)) {
                    contador++;
                }
                i++;
            }
            actual = actual.getSiguiente();
        }

        return contador;
    }

    private boolean intentarAgregarEquipaje(Equipaje equipaje) {
        NodoLista<VagonEquipaje> actual = cabeza;
        int numeroVagon = 0;
        while (actual != null) {
            Equipaje[] equipajes = actual.getDato().getEquipaje();
            int contador = 0;
            while (contador < equipajes.length) {
                if (equipajes[contador] == null) {
                    equipajes[contador] = equipaje;
                    equipaje.setVagonAsignado(actual.getDato());
                    System.out.println("Equipaje agregado al vagon " + numeroVagon + ", posicion " + contador);
                    return true;
                }
                contador++;
            }
            actual = actual.getSiguiente();
            numeroVagon++;
        }

        return false;
    }
    public boolean eliminarEquipaje(String id) {
        NodoLista<VagonEquipaje> actual = cabeza;
        int numeroVagon = 0;
        while (actual != null) {
            Equipaje[] equipajes = actual.getDato().getEquipaje();
            int contador = 0;
            while (contador < equipajes.length) {
                if (equipajes[contador] != null && equipajes[contador].getId().equals(id)) {
                    equipajes[contador] = null;
                    System.out.println("Equipaje con ID " + id + " eliminado del vagon " + numeroVagon);
                    return true;
                }
                contador++;
            }
            actual = actual.getSiguiente();
            numeroVagon++;
        }
        imprimirError("Equipaje con ID " + id + " no encontrado.");
        return false;
    }
    public void mostrarEquipaje() {
        NodoLista<VagonEquipaje> actual = cabeza;
        int numeroVagon = 0;
        while (actual != null) {
            Equipaje[] equipajes = actual.getDato().getEquipaje();
            System.out.println("Vagon " + numeroVagon + ":");

            int contador = 0;
            while (contador < equipajes.length) {
                Equipaje equipaje = equipajes[contador];
                if (equipaje != null) {
                    System.out.println("  ID: " + equipaje.getId() + ", Peso: " + equipaje.getPeso() + "kg");
                }
                contador++;
            }
            actual = actual.getSiguiente();
            numeroVagon++;
        }
    }
    public int obtenerTotalEquipajes() {
        int totalEquipaje = 0;
        NodoLista<VagonEquipaje> actual = cabeza;

        while (actual != null) {
            Equipaje[] equipajes = actual.getDato().getEquipaje();
            int contador = 0;
            while (contador < equipajes.length) {
                if (equipajes[contador] != null) {
                    totalEquipaje++;
                }
                contador++;
            }
            actual = actual.getSiguiente();
        }

        return totalEquipaje;
    }
    private void imprimirError(String mensaje) {
        System.out.println(mensaje);
    }

}
