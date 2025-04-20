package ModuloEstructuras;

public class Pila<T> {

    private ListaEnlazada<T> lista = new ListaEnlazada<>();

    public void apilar(T dato) {
        lista.agregarAlInicio(dato);
    }

    public T desapilar() {
        if (estaVacia()) return null;
        T dato = lista.obtener(0);
        lista.eliminar(dato);
        return dato;
    }

    public T peak() {
        return lista.obtener(0);
    }

    public boolean estaVacia() {
        return lista.estaVacia();
    }

    public int tamaño() {
        return lista.tamaño();
    }

    public void imprimir() {
        lista.imprimir();
    }
}
