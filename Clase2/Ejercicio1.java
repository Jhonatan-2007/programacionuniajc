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

        /*Ejercicio 2 
        System.out.println("Ingresar el numero de empleados: ");
        int e = scanner.nextInt();
        op.Ejercicio2(e);
        */

        /*Ejercicio 3 
        System.out.println("\n Suma de pares e impares");
        System.out.println("\nDijitar tamaño del arreglo");
        int s = scanner.nextInt();
        op.Ejercicio3(s);
        */

        /*Ejercicio 4 
        System.out.println("\n Edad mayor");
        System.out.println("\nDijitar tamaño del arreglo");
        int edad = scanner.nextInt();
        op.Ejercicio4(edad);
        */

        /*Ejercicio 5
        System.out.println("\n Calculo de gastos ");
        System.out.println("\nDijitar el tamaño del arreglo");
        int c = scanner.nextInt();
        op.Ejercicio5(c);
        */

        /*Ejercicio 6 
        System.out.println("\n Calculo de ganancia de alquiler");
        System.out.print("Ingrese el número de viviendas: ");
        int k = scanner.nextInt();
        op.Ejercicio6(k);
        */
        
        /*Ejercicio 7
        System.out.println("Ingrese 10 números:");
        int[] p = new int[10];
        for(int i = 0; i < 10; i++) {
            System.out.print("Número " + (i+1) + ": ");
            p[i] = scanner.nextInt();
        }
        op.Ejercicio7(p);
        */

        /*Ejercicio 8 */
        System.out.println("\n30 numeros");
        System.out.println("Dijitar los 30 numeros");
        int[] ys = op.llenarArregloAleatorios(30); 
        System.out.println("Números generados:");
        for(int num : ys) {
            System.out.println(num + " ");
        }
        System.out.println("\n");
        int[] y = new int[30];
        op.Ejercicio8(y);

    }
}