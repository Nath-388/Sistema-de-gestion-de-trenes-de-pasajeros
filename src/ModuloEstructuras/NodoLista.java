package ModuloEstructuras;

public class NodoLista<T> {
    public T dato;
    public NodoLista<T> siguiente;

    public NodoLista(T dato) {
        this.dato = dato;
    }
     public T getDato() {
        return dato;
    }
    public void setDato(T dato) {
        this.dato = dato;
    }
    public NodoLista<T> getSiguiente() {
        return siguiente;
    }
    public void setSiguiente(NodoLista<T> siguiente) {
        this.siguiente = siguiente;
    }
}
