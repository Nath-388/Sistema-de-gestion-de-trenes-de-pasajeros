package ModuloEstructuras;

public class Grafo {
    private TablaHash<T, ListaEnlazada<Arista>> adyacencias = new TablaHash<>();

    public void agregarVertice(T dato) {
        if (!vertices.contieneClave(dato)) {
            vertices.insertar(dato, new Vertice<>(dato));
        }
    }

    public void agregarArista(T origen, T destino, int peso) {
        agregarVertice(origen);
        agregarVertice(destino);

        Vertice<T> vOrigen = vertices.obtener(origen);
        Vertice<T> vDestino = vertices.obtener(destino);

        vOrigen.adyacentes.agregarAlFinal(new Arista<>(vDestino, peso));
        vDestino.adyacentes.agregarAlFinal(new Arista<>(vOrigen, peso)); // no dirigido
    }

    public ListaEnlazada<T> obtenerVecinos(T vertice) {
        ListaEnlazada<Arista> lista = adyacencias.obtener(vertice);
        ListaEnlazada<T> vecinos = new ListaEnlazada<>();
        if (lista != null) {
            for (int i = 0; i < lista.tamaño(); i++) {
                vecinos.agregarAlFinal(lista.obtener(i).destino);
            }
        }
        return vecinos;
    }

    public void imprimir() {
        ListaEnlazada<T> vertices = adyacencias.claves();
        for (int i = 0; i < vertices.tamaño(); i++) {
            T vertice = vertices.obtener(i);
            System.out.print(vertice + " -> ");
            ListaEnlazada<Arista> vecinos = adyacencias.obtener(vertice);
            for (int j = 0; j < vecinos.tamaño(); j++) {
                Arista arista = vecinos.obtener(j);
                System.out.print("(" + arista.destino + ", " + arista.peso + ") ");
            }
            System.out.println();
        }
    }
}
