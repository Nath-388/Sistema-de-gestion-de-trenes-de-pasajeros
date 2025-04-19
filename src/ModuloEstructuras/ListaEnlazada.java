package ModuloEstructuras;

public class ListaEnlazada<T> {


    private NodoLista<T> cabeza;
    private int tamaño;


    public void agregarAlFinal(T dato) {
        NodoLista<T> nuevo = new NodoLista<>(dato);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoLista<T> actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            actual.siguiente = nuevo;
        }
        tamaño++;
    }

    public void agregarAlInicio(T dato) {
        NodoLista<T> nuevo = new NodoLista<>(dato);
        nuevo.siguiente = cabeza;
        cabeza = nuevo;
        tamaño++;
    }

    public boolean eliminar(T dato) {
        if (cabeza == null) {
            return false;
        }
        if (cabeza.dato.equals(dato)) {
            cabeza = cabeza.siguiente;
            tamaño--;
            return true;
        }
        NodoLista<T> actual = cabeza;
        while (actual.siguiente != null && !actual.siguiente.dato.equals(dato)) {
            actual = actual.siguiente;
        }
        if (actual.siguiente != null) {
            actual.siguiente = actual.siguiente.siguiente;
            tamaño--;
            return true;
        }
        return false;
    }

    public T obtener(int indice) {
        if (indice < 0 || indice >= tamaño){
            return null;
        }
        NodoLista<T> actual = cabeza;
        for (int i = 0; i < indice; i++) {
            actual = actual.siguiente;
        }
        return actual.dato;
    }

    public boolean contiene(T dato) {
        NodoLista<T> actual = cabeza;
        while (actual != null) {
            if (actual.dato.equals(dato)) return true;
            actual = actual.siguiente;
        }
        return false;
    }

    public int tamaño() {
        return tamaño;
    }

    public boolean estaVacia() {
        return tamaño == 0;
    }

    public void imprimir() {
        NodoLista<T> actual = cabeza;
        while (actual != null) {
            System.out.print(actual.dato + " -> ");
            actual = actual.siguiente;
        }
        System.out.println("null");
    }
    public NodoLista<T> getCabeza() {
        return cabeza;
    }

}
