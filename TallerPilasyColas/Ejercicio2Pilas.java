import java.util.Stack;

public class Ejercicio2Pilas {
    
    public static void main(String[] args) {
        
        Stack<String> pila = new Stack<>();

        pila.push("uno");
        pila.push("dos");
        pila.push("tre");

        System.out.println(pila);

        System.out.println("\n La pila tiene " + pila.size()+ " elementos");

        mostrarPila(pila);
    }

    public static void mostrarPila(Stack<String> pila) {
        Stack<String> pilaAuxiliar = new Stack<>();
        pilaAuxiliar.addAll(pila);

        System.out.println("pila auxilar :");
        while (!pilaAuxiliar.isEmpty()) {
            System.out.println("-" + pilaAuxiliar.pop());
        }
    }
}    