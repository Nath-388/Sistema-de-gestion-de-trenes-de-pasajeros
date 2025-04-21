package ModuloServicios;

import ModuloEstructuras.NodoLista;
import ModuloModelos.Ruta;
import ModuloUtillidades.Validadores;
    
    public class GestionRutas{
    private NodoLista<Ruta> cabeza;  
    private int tamano;  
        
         public GestionRutas() {
             cabeza = null;  
             tamano = 0;
            }
            public void agregarRuta(Ruta ruta) {
                NodoLista<Ruta> nuevo = new NodoLista<Ruta>(ruta);
                if (cabeza == null) {
                    cabeza = nuevo;  
                } else {
                    NodoLista<Ruta> actual = cabeza;
                    while (actual.siguiente != null) {
                        actual = actual.siguiente; 
                    }
                    actual.siguiente = nuevo;  
                }
                tamano++; 
            }

            public Ruta buscarRuta(String id) {
                NodoLista<Ruta> actual = cabeza;
                while (actual != null) {
                    if (actual.dato.getId().equals(id)) {
                        return actual.dato; 
                    }
                    actual = actual.siguiente;
                }
                return null; 
            }

            public boolean eliminarRuta(String id) {
              if (cabeza.getDato().getId().equals(id)) {
            if (!Validadores.validarRutaNoEnUso(cabeza.getDato())) return false;
              cabeza = cabeza.getSiguiente();
              tamano--;
               return true;

    }

       NodoLista<Ruta> actual = cabeza;
       while (actual.getSiguiente() != null && !actual.getSiguiente().getDato().getId().equals(id)) {
        actual = actual.getSiguiente();
    }

      if (actual.getSiguiente() != null) {
        Ruta rutaAEliminar = actual.getSiguiente().getDato();
        if (!Validadores.validarRutaNoEnUso(rutaAEliminar)) return false;
        actual.setSiguiente(actual.getSiguiente().getSiguiente());
        tamano--;
        return true;
    }
    return false;
}
            public boolean editarRuta(String id, Ruta nuevaRuta) {
                NodoLista<Ruta> actual = cabeza;
                  while (actual != null) {
                 if (actual.getDato().getId().equals(id)) {
                   if (!Validadores.validarRutaNoEnUso(actual.getDato())) return false;
              actual.setDato(nuevaRuta);
               return true;
        }
            actual = actual.getSiguiente();
    }
            return false;
}

            public void imprimirRutas() {
                NodoLista<Ruta> actual = cabeza;
                while (actual != null) {
                    System.out.println("ID: " + actual.dato.getId() + ", Nombre: " + actual.dato.getNombre());
                    actual = actual.siguiente;
                }
            }

            public int tamano() {
                return tamano;
            }
            
            public boolean estaVacia() {
                return tamano == 0;
            }

}
