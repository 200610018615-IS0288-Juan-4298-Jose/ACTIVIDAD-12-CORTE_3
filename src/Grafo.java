import java.util.List;
import java.util.ArrayList;
import java.util.Map;


public class Grafo {
    private Map<Integer, List<Arista>> adjList;

    public Grafo() {
        this.adjList = new HashMap<>();
    }
    public void agregarVertice(int vertice) {
        adjList.putIfAbsent(vertice, new ArrayList<>());
    }
    public void agregarArista(int origen, int destino, int peso) {
        agregarVertice(origen);
        agregarVertice(destino);
        adjList.get(origen).add(new Arista(destino, peso));
        adjList.get(destino).add(new Arista(origen, peso));
    }
    public List<Arista> getVecinos(int vertice) {
        return adjList.getOrDefault(vertice, new ArrayList<>());
    }
}