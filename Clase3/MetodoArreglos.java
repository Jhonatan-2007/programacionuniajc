public class MetodoArreglos {

    public String nombreSueldos(String[]n, int[]s){
        int suma = 0;
        for(int i = 0; i <s.length; i++){
              suma +=s[i];
        }
        double promedio = suma/s.length;
        String cad = ""; int contador = 0;
        for(int i = 0; i < s.length; i++){
            if(s[i] >= promedio){
                cad += n[i] + " \n";
                 contador++;
            }
        }
        cad += "Fueron " + contador + " los empleados que tienen sueldo por encima del promedio: " + promedio;
        return cad;
    }

    /*Ejercicio 17*/
    public void sumarFilasColumnas(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        System.out.println("\nMatriz y suma de filas:");
        for (int i = 0; i < filas; i++) {
            int sumaFila = 0;
            for (int j = 0; j < columnas; j++) {
                sumaFila += matriz[i][j];
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println(" | Suma = " + sumaFila);
        }
        System.out.println("\nSuma de columnas:");
        for (int j = 0; j < columnas; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < filas; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.printf("%4d", sumaColumna);
        }
        System.out.println();
    }

    /*Ejercicio 18 */
    public void generarTablaMultiplicar() {
        int[][] tabla = new int[10][10];
        
        // Generar tabla
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tabla[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.println("\nTabla de multiplicar del 1 al 10:");
        System.out.print("   ");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println("\n ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("%2d |", (i + 1));
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d", tabla[i][j]);
            }
            System.out.println();
        }
    }
    
}
