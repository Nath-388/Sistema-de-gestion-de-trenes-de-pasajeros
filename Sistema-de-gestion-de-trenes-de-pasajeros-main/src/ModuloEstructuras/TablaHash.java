package ModuloEstructuras;

public class TablaHash<K,V> {
    private class Entrada {
        K clave;
        V valor;

        Entrada(K clave, V valor) {
            this.clave = clave;
            this.valor = valor;
        }
    }

    private int capacidad = 16;
    private ListaEnlazada<Entrada>[] tabla;

    @SuppressWarnings("unchecked")
    public TablaHash() {
        tabla = new ListaEnlazada[capacidad];
        for (int i = 0; i < capacidad; i++) {
            tabla[i] = new ListaEnlazada<>();
        }
    }

    private int obtenerIndice(K clave) {
        return Math.abs(clave.hashCode() % capacidad);
    }

    public void insertar(K clave, V valor) {
        int indice = obtenerIndice(clave);
        ListaEnlazada<Entrada> lista = tabla[indice];
        for (int i = 0; i < lista.tamaño(); i++) {
            Entrada e = lista.obtener(i);
            if (e.clave.equals(clave)) {
                e.valor = valor;
                return;
            }
        }
        lista.agregarAlFinal(new Entrada(clave, valor));
    }

    public V obtener(K clave) {
        int indice = obtenerIndice(clave);
        ListaEnlazada<Entrada> lista = tabla[indice];
        for (int i = 0; i < lista.tamaño(); i++) {
            Entrada e = lista.obtener(i);
            if (e.clave.equals(clave)) return e.valor;
        }
        return null;
    }

    public boolean contieneClave(K clave) {
        return obtener(clave) != null;
    }

    public void eliminar(K clave) {
        int indice = obtenerIndice(clave);
        ListaEnlazada<Entrada> lista = tabla[indice];
        for (int i = 0; i < lista.tamaño(); i++) {
            Entrada e = lista.obtener(i);
            if (e.clave.equals(clave)) {
                lista.eliminar(e);
                return;
            }
        }
    }

    public ListaEnlazada<K> claves() {
        ListaEnlazada<K> resultado = new ListaEnlazada<>();
        for (int i = 0; i < capacidad; i++) {
            ListaEnlazada<Entrada> lista = tabla[i];
            for (int j = 0; j < lista.tamaño(); j++) {
                resultado.agregarAlFinal(lista.obtener(j).clave);
            }
        }
        return resultado;
    }
}
