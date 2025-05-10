package ModuloServicios;

import ModuloEstructuras.ListaEnlazada;
import ModuloModelos.Pasajero;
import ModuloModelos.VagonPasajeros;

public class ControlAbordaje {
      private ListaEnlazada<VagonPasajeros> vagonesPasajeros;

    public ControlAbordaje(ListaEnlazada<VagonPasajeros> vagonesPasajeros) {
        this.vagonesPasajeros = vagonesPasajeros;
    }

    public void mostrarOrdenAbordaje() {
        System.out.println(" ORDEN DE ABORDAJE ");
        for (int i = vagonesPasajeros.tamaño() - 1; i >= 0; i--) {
            VagonPasajeros vagon = vagonesPasajeros.obtener(i);
            Pasajero[] pasajeros = vagon.getPasajeros(); 
            Pasajero[] Premium = new Pasajero[pasajeros.length];
            Pasajero[] Ejecutivo = new Pasajero[pasajeros.length];
            Pasajero[] Estandar = new Pasajero[pasajeros.length];

            int PremiumContador = 0, EjecutivoContador = 0, EstadandarContador = 0;

            for (Pasajero pasajero : pasajeros) {
                if (pasajero != null) {
                    String categoria = pasajero.getCategoria();
                    if (categoria.equals("Premium")) {
                        Premium[PremiumContador++] = pasajero;
                    } else if (categoria.equals ("Ejecutivo")) {
                        Ejecutivo[EjecutivoContador++] = pasajero;
                    } else if (categoria.equals("Estandar")) {
                        Estandar[EstadandarContador++] = pasajero;
                    }
                }
            }

            System.out.println("Vagon " + i + ":");
            mostrarPasajeros(Premium, PremiumContador, "PREMIUM");
            mostrarPasajeros(Ejecutivo, EjecutivoContador, "EJECUTIVO");
            mostrarPasajeros(Estandar, EstadandarContador, "ESTANDAR");
        }
    }
    private void mostrarPasajeros(Pasajero[] pasajeros, int cantidad, String categoria) {
        for (int i = 0; i < cantidad; i++) {
            System.out.println("  [" + categoria + "] " + pasajeros[i].getNombres() + "" + pasajeros[i].getApellidos());
        }
    }

}
