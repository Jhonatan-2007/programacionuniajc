package Clase14;

import java.util.*;

class GrafoConPesos {
    private Map<String, List<Conexion>> adyacencia = new HashMap<>();

    static class Conexion {
        String destino;
        int peso;

        Conexion(String destino, int peso) {
            this.destino = destino;
            this.peso = peso;
        }
    }

    public void agregarLugar(String lugar) {
        adyacencia.putIfAbsent(lugar, new ArrayList<>());
    }

    public void conectar(String origen, String destino, int peso) {
        adyacencia.get(origen).add(new Conexion(destino, peso));
        adyacencia.get(destino).add(new Conexion(origen, peso)); // bidireccional
    }

    public void dijkstra(String inicio, String fin) {
        Map<String, Integer> distancias = new HashMap<>();
        Map<String, String> anteriores = new HashMap<>();
        PriorityQueue<Conexion> cola = new PriorityQueue<>(Comparator.comparingInt(c -> c.peso));

        for (String lugar : adyacencia.keySet()) {
            distancias.put(lugar, Integer.MAX_VALUE);
        }
        distancias.put(inicio, 0);
        cola.add(new Conexion(inicio, 0));

        while (!cola.isEmpty()) {
            Conexion actual = cola.poll();
            for (Conexion vecino : adyacencia.get(actual.destino)) {
                int nuevaDist = distancias.get(actual.destino) + vecino.peso;
                if (nuevaDist < distancias.get(vecino.destino)) {
                    distancias.put(vecino.destino, nuevaDist);
                    anteriores.put(vecino.destino, actual.destino);
                    cola.add(new Conexion(vecino.destino, nuevaDist));
                }
            }
        }

        // Mostrar el camino más corto
        List<String> camino = new ArrayList<>();
        String actual = fin;
        while (actual != null) {
            camino.add(actual);
            actual = anteriores.get(actual);
        }
        Collections.reverse(camino);

        System.out.println("\nMejor camino de " + inicio + " a " + fin + ": " + camino);
        System.out.println("Distancia total: " + distancias.get(fin));
    }

    public static void main(String[] args) {
        GrafoConPesos grafo = new GrafoConPesos();

        // Agregar lugares
        grafo.agregarLugar("Uniajc Sur");
        grafo.agregarLugar("Uniajc Norte");
        grafo.agregarLugar("La Simón Bolívar");
        grafo.agregarLugar("Calle 5");
        grafo.agregarLugar("Sur Oriental");

        // Conectar lugares con distancias estimadas
        grafo.conectar("Uniajc Sur", "La Simón Bolívar", 5);
        grafo.conectar("Uniajc Sur", "Calle 5", 6);
        grafo.conectar("Uniajc Sur", "Sur Oriental", 4);
        grafo.conectar("La Simón Bolívar", "Uniajc Norte", 10); // camino alterno directo
        grafo.conectar("Sur Oriental", "Uniajc Norte", 14);
        grafo.conectar("Calle 5", "Uniajc Norte", 12);

        // Calcular el mejor camino
        grafo.dijkstra("Uniajc Sur", "Uniajc Norte");
    }
}