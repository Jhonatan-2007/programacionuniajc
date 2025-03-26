import java.util.Stack;

public class Ejercicio1Pilas {
    public static void main(String[] args) {
        
        Stack<Integer> p = new Stack<>();
        int x = 4, y;

        p.push(x);
        System.out.println("\n" + p.peek());
        y = p.pop();
        p.push(32);
        p.push(p.pop());
        do {
            System.out.println("\n"+p.pop());
        }while (!p.isEmpty());

    }
}
