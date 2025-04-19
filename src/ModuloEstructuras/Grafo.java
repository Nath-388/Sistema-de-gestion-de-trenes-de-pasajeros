package ModuloEstructuras;

public class Grafo<T> {

    private TablaHash<T, Vertice<T>> vertices = new TablaHash<>();

    public void agregarVertice(T dato) {
        if (!vertices.contieneClave(dato)) {
            vertices.insertar(dato, new Vertice<>(dato));
        }
    }

    public void agregarArista(T origen, T destino, int peso) {
        agregarVertice(origen);
        agregarVertice(destino);

        Vertice<T> Vorigen= vertices.obtener(origen);
        Vertice<T> Vdestino = vertices.obtener(destino);

        Vorigen.adyacentes.agregarAlFinal(new Arista<>(Vdestino, peso));
        Vdestino.adyacentes.agregarAlFinal(new Arista<>(Vorigen, peso));

    }

    public ListaEnlazada<T> obtenerVecinos(T dato) {
        ListaEnlazada<T> vecinos = new ListaEnlazada<>();
        if (!vertices.contieneClave(dato)) return vecinos;

        Vertice<T> v = vertices.obtener(dato);
        NodoLista<Arista<T>> actual = v.adyacentes.getCabeza();

        while (actual != null) {
            vecinos.agregarAlFinal(actual.dato.destino.dato);
            actual = actual.siguiente;
        }

        return vecinos;
    }

    public void imprimirGrafo() {
        ListaEnlazada<T> claves = vertices.claves();
        NodoLista<T> nodo = claves.getCabeza();

        while (nodo != null) {
            T clave = nodo.dato;
            Vertice<T> vertice = vertices.obtener(clave);
            System.out.print(clave + " -> ");

            NodoLista<Arista<T>> actual = vertice.adyacentes.getCabeza();
            while (actual != null) {
                System.out.print(actual.dato.destino.dato + "(" + actual.dato.peso + ") ");
                actual = actual.siguiente;
            }

            System.out.println();
            nodo = nodo.siguiente;
        }
    }
}
