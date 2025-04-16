package ModuloEstructuras;

public class ColaPrioridad <T extends Comparable<T>> {
    private ListaEnlazada<T> elementos = new ListaEnlazada<>();

    public void encolar(T dato) {
        if (elementos.estaVacia()) {
            elementos.agregarAlFinal(dato);
            return;
        }

        for (int i = 0; i < elementos.tamaño(); i++) {
            if (dato.compareTo(elementos.obtener(i)) < 0) {
                insertarEnPosicion(i, dato);
                return;
            }
        }
        elementos.agregarAlFinal(dato);
    }

    private void insertarEnPosicion(int posicion, T dato) {
        ListaEnlazada<T> nueva = new ListaEnlazada<>();
        for (int i = 0; i < elementos.tamaño(); i++) {
            if (i == posicion) nueva.agregarAlFinal(dato);
            nueva.agregarAlFinal(elementos.obtener(i));
        }
        elementos = nueva;
    }

    public T desencolar() {
        if (elementos.estaVacia()) return null;
        T dato = elementos.obtener(0);
        elementos.eliminar(dato);
        return dato;
    }

    public T frente() {
        return elementos.obtener(0);
    }

    public boolean estaVacia() {
        return elementos.estaVacia();
    }

    public int tamaño() {
        return elementos.tamaño();
    }

    public void imprimir() {
        elementos.imprimir();
    }
}
