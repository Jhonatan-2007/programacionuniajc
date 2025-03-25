import java.util.Stack;

public class EjecutarPila {

    public static void main(String[] args) {
        
        //Creacion de la estructura Stack (Pila)
        Stack<String> nombres = new Stack<>();

        System.out.println(nombres.empty()); //true

        //insertar elementos en la pila
        nombres.push("Pedro");
        nombres.push("Juan");
        nombres.push("Maria");
        nombres.push("Camila");
        nombres.push("Daniel");

        //Imprimir la pila
        System.out.println(nombres);

        //Mostar quien esta en el tope de la pila (sin removerlo) --> Consultar
        System.out.println(nombres.peek()); //Daniel

        //Buscar un elemento dentro de al pila
        System.out.println(nombres.search("Camila")); //2 --> 2-1 = 1

        //retirar un elemnto de la pila
        System.out.println(nombres.pop());

        System.out.println(nombres); //[Pedro, Juan, Maria, Camila]

        //Verificar el tamaño de la pila
        System.out.println(nombres.size()); //4


    }
}