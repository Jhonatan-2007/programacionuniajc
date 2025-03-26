import java.util.Stack;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Stack<Integer> Pila = new Stack<>();
        Pila p = new Pila();
        int x = 4, y;
        
        p.insertar(x);
        System.out.println("/n" + p.cimaPila());
        y = p.quitar();
        p.insertar(p.quitar());
        do{
            System.out.println("/n" + p.quitar());
        }while(!p.pilaVacia());
    }
}


