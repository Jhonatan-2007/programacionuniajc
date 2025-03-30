import java.util.Stack;

public class Ejercicio2Pilas {
    
    public static void main(String[] args) {
        
        Stack<Integer> pila = new Stack<>();

        pila.push(1);
        pila.push(2);
        pila.push(3);

        System.out.println(pila);

        System.out.println("\n La pila tiene " + pila.size()+ " elementos");

    }
}
