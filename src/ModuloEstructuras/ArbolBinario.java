package ModuloEstructuras;

public class ArbolBinario<T extends Comparable<T>> {
    private Nodo<T> raiz;

    private static class Nodo<T> {
        T dato;
        Nodo<T> izquierdo;
        Nodo<T> derecho;

        Nodo(T dato) {
            this.dato = dato;
        }
    }

    public void insertar(T dato) {
        raiz = insertarRec(raiz, dato);
    }

    private Nodo<T> insertarRec(Nodo<T> actual, T dato) {
        if (actual == null) return new Nodo<>(dato);

        if (dato.compareTo(actual.dato) < 0) {
            actual.izquierdo = insertarRec(actual.izquierdo, dato);
        } else if (dato.compareTo(actual.dato) > 0) {
            actual.derecho = insertarRec(actual.derecho, dato);
        }

        return actual;
    }

    public boolean contiene(T dato) {
        return buscarRec(raiz, dato);
    }

    private boolean buscarRec(Nodo<T> actual, T dato) {
        if (actual == null) return false;
        if (dato.compareTo(actual.dato) == 0) return true;
        return dato.compareTo(actual.dato) < 0
                ? buscarRec(actual.izquierdo, dato)
                : buscarRec(actual.derecho, dato);
    }

    public void eliminar(T dato) {
        raiz = eliminarRec(raiz, dato);
    }

    private Nodo<T> eliminarRec(Nodo<T> actual, T dato) {
        if (actual == null) return null;

        if (dato.compareTo(actual.dato) < 0) {
            actual.izquierdo = eliminarRec(actual.izquierdo, dato);
        } else if (dato.compareTo(actual.dato) > 0) {
            actual.derecho = eliminarRec(actual.derecho, dato);
        } else {
            // Caso 1: sin hijos
            if (actual.izquierdo == null && actual.derecho == null) return null;
            // Caso 2: un solo hijo
            if (actual.izquierdo == null) return actual.derecho;
            if (actual.derecho == null) return actual.izquierdo;
            // Caso 3: dos hijos
            T menorValor = encontrarMin(actual.derecho);
            actual.dato = menorValor;
            actual.derecho = eliminarRec(actual.derecho, menorValor);
        }

        return actual;
    }

    private T encontrarMin(Nodo<T> actual) {
        while (actual.izquierdo != null) actual = actual.izquierdo;
        return actual.dato;
    }

    public void inOrden() {
        inOrdenRec(raiz);
        System.out.println();
    }

    private void inOrdenRec(Nodo<T> actual) {
        if (actual != null) {
            inOrdenRec(actual.izquierdo);
            System.out.print(actual.dato + " ");
            inOrdenRec(actual.derecho);
        }
    }

    public void preOrden() {
        preOrdenRec(raiz);
        System.out.println();
    }

    private void preOrdenRec(Nodo<T> actual) {
        if (actual != null) {
            System.out.print(actual.dato + " ");
            preOrdenRec(actual.izquierdo);
            preOrdenRec(actual.derecho);
        }
    }

    public void postOrden() {
        postOrdenRec(raiz);
        System.out.println();
    }

    private void postOrdenRec(Nodo<T> actual) {
        if (actual != null) {
            postOrdenRec(actual.izquierdo);
            postOrdenRec(actual.derecho);
            System.out.print(actual.dato + " ");
        }
    }
}
