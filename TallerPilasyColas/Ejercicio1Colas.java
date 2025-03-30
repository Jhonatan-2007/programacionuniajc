import java.util.ArrayDeque;
import java.util.Queue;

public class Ejercicio1Colas {

    public static void main(String[] args) {
        
    Queue<Integer> elementos1 = new ArrayDeque<>();
    Queue<Integer> elementos2 = new ArrayDeque<>();

    elementos1.add(1);
    elementos1.add(2);
    elementos1.add(3);

    elementos2.add(1);
    elementos2.add(2);
    elementos2.add(3);

    System.out.println(elementos1);
    System.out.println(elementos2);

    if (elementos1.size() == elementos2.size() && elementos1.toString().equals(elementos2.toString())) {
        System.out.println("Cierto las Colas son identicas");
        } else{
        System.out.println("Falso las colas son diferentes");
        }
    }
}

