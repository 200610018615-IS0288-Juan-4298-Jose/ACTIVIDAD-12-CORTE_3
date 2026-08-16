import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Grafo {
    private Map<Integer, List<Aristas>> adjList;

    public Grafo() {
        this.adjList = new HashMap<>();
    }
    public void agregarVertice(int vertice) {
        adjList.putIfAbsent(vertice, new ArrayList<>());
    }
    public void agregarArista(int origen, int destino, int peso) {
        agregarVertice(origen);
        agregarVertice(destino);
        adjList.get(origen).add(new Aristas(destino, peso));
        adjList.get(destino).add(new Aristas(origen, peso));
    }
    public List<Aristas> getVecinos(int vertice) {
        return adjList.getOrDefault(vertice, new ArrayList<>());
    }
}