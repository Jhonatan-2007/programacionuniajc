import java.util.Queue;
import java.util.ArrayDeque;

public class Ejercicio2Colas {

    // Método que verifica si dos colas son iguales
    public static boolean sonColasIdenticas(Queue<Integer> cola1, Queue<Integer> cola2) {
        // Primero comparamos sus tamaños
        if (cola1.size() != cola2.size()) {
            return false;
        }

        // Hacemos copias para no alterar las colas originales
        Queue<Integer> copia1 = new ArrayDeque<>(cola1);
        Queue<Integer> copia2 = new ArrayDeque<>(cola2);

        // Comparamos elemento por elemento
        while (!copia1.isEmpty()) {
            // Sacamos el primer elemento de cada cola
            Integer elem1 = copia1.poll();
            Integer elem2 = copia2.poll();

            // Si encontramos elementos diferentes, las colas no son iguales
            if (!elem1.equals(elem2)) {
                return false;
            }
        }

        // Si llegamos aquí, todas las comparaciones fueron iguales
        return true;
    }

    public static void main(String[] args) {
        // Creamos tres colas para probar
        Queue<Integer> colaA = new ArrayDeque<>();
        colaA.add(1);
        colaA.add(2);
        colaA.add(3);
        colaA.add(4);
        
        Queue<Integer> colaB = new ArrayDeque<>();
        colaB.add(1);
        colaB.add(2);
        colaB.add(3);
        colaB.add(4);
        
        Queue<Integer> colaC = new ArrayDeque<>();
        colaC.add(1);
        colaC.add(2);
        colaC.add(3);
        colaC.add(5);  // Este elemento es diferente

        // Probamos el método
        System.out.println("¿Cola A y B son iguales? " + sonColasIdenticas(colaA, colaB));
        System.out.println("¿Cola A y C son iguales? " + sonColasIdenticas(colaA, colaC));
    }
}