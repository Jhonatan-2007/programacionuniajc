import java.util.Scanner;
public class EjemploMatrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MetodoArreglos ma = new MetodoArreglos();

        //Declaracion de matriz 3x3
        int[][] m = {  { 9, 3, 5 },
                        { 1, 4, 2 },
                        { 8, 7, 5 } };
        
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < m[0].length; j++) {
                System.out.println("m[" + i + "][" + j + "]=" + m[i][j]);
            }
        }

        /*Ejercicio 17 */
        System.out.println("\nEJERCICIO 17");
        
        // Matriz predefinida
        int[][] matriz = {
            {5, 3, 2},
            {8, 1, 7},
            {4, 9, 6}
        };
        
        System.out.println("Matriz predefinida:");
        ma.sumarFilasColumnas(matriz);
        

        /*Ejercicio 18 */
        System.out.println("\n EJERCICIO 18");
        ma.generarTablaMultiplicar();

        /*Ejercicio 19 */
        System.out.println("\n EJERCICIO 19");
        int tamano = 5;
        System.out.println("Tamaño de matriz diagonal: " + tamano + "x" + tamano);
        ma.generarMatrizDiagonal(tamano);
    }
    
}
