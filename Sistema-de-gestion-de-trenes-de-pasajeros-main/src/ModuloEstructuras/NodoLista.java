package ModuloEstructuras;

public class NodoLista<T> {
    T dato;
    NodoLista<T> siguiente;

    NodoLista(T dato) {
        this.dato = dato;
    }
}
