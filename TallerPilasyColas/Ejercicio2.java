import java.util.Stack;
public class Ejercicio2 {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<>();

        System.out.println(pila.empty());

        pila.push(1);
        pila.push(2);
        pila.push(3);

        System.out.println(pila);
    }
}
