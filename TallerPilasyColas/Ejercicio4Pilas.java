import java.util.Stack;

public class Ejercicio4Pilas {
    
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};// Array de numeros
        Stack<Integer> pila = new Stack<>();// creaacion de pila

        // Mostrar arreglo original horizontalmente
        System.out.print("Arreglo original: [ ");
        for (int n : numeros) {
            System.out.print(n + " ");
            pila.push(n);
        }
        System.out.println("]");

        // Mostrar extracción de la pila paso a paso
        System.out.println("\nProceso de extracción:");
        System.out.println("Contenido: " + pila);

        while (!pila.isEmpty()) {
            // Extrae el elemento de la pila y muestra el resultado:
            System.out.println("Extraído: " + pila.pop() + " = " + pila);
        }
        // Cuando la pila está vacía, muestra este mensaje final
        System.out.println("La pila está vacía");
    }
}