import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        OperacionesConArreglos op = new OperacionesConArreglos();

        /* 
        // Crear un arreglo de enteros
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(op.mostrarElementos(a));
        System.out.println("La suma de los elementos del arreglo es: "+op.sumarElementos(a));
        System.out.println("El promedio de los elementosdel arreglo es: "+op.promedioElementos(a));
        */

        /* 
        int n = 5;
        int[] a = op.llenarArregloAleatorios(n);
        System.out.println(op.mostrarElementos(a));
        */

        /*Ejercicio 1 
        System.out.println("Ingrese el tamaño del arreglo (n): ");
        int n = scanner.nextInt();
        int[] a = op.llenarArregloAleatorios(n);
        System.out.println(op.mostrarElementos(a));
        */

        /*Ejercicio 2 */
        System.out.println("Ingresar el numero de empleados: ");
        int e = scanner.nextInt();
        op.Ejercicio2(e);
        

        
    }
}