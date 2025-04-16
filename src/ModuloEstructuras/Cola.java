package ModuloEstructuras;

public class Cola<T> {
    private ListaEnlazada<T> lista = new ListaEnlazada<>();

    public void encolar(T dato) {
        lista.agregarAlFinal(dato);
    }

    public T desencolar() {
        if (estaVacia()) return null;
        T dato = lista.obtener(0);
        lista.eliminar(dato);
        return dato;
    }

    public T frente() {
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

