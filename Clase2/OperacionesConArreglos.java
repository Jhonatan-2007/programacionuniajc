import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OperacionesConArreglos {
    private Scanner scanner = new Scanner(System.in);
    
    public String mostrarElementos(int[] a) {
        String cad = "";
        for (int i = 0; i < a.length; i++) {
            cad += "a[ "+i+" ] =" + a[i]+ " \n ";
        }
    return cad;
    }

    public int sumarElementos(int[] a) {
        int suma = 0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        return suma;
    }

    public double promedioElementos(int[] a) {
        double suma = 0.0, promedio = 0.0;
        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }
        promedio = suma / a.length;
        return promedio;
    }

    public int[] llenarArregloAleatorios(int tam) {
        int[] a = new int[tam];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
        }
        return a;
    }

    /*Ejercicio 2*/
    public void Ejercicio2(int e){
    double[] sueldos = new double[e];
    double[] asignaciones = new double[e];
    double[] deducciones = new double[e];
    double[] pagoNeto = new double[e];

    for (int i = 0; i < e; i++) {
        System.out.println("\n Empleado "+ (i+1));
        System.out.println("Sueldo: ");
        sueldos[i] = scanner.nextDouble();
        System.out.println("Asignaciones: ");
        asignaciones[i] = scanner.nextDouble();
        System.out.println("Deducciones: ");
        deducciones[i] = scanner.nextDouble();

        pagoNeto[i] = sueldos[i] + asignaciones[i] - deducciones[i];
        }
        System.out.println("\nPago neto por empleado: ");
        for(int i = 0; i < e; i++) {
            System.out.println("Empleado " +(i + 1)+": " + String.format("%.2f", pagoNeto[i]));
        }
    }

    public void Ejercicio3(int s){
        int[] numeros = llenarArregloAleatorios(s);
        int sumaPares = 0, sumaImpares = 0;
        for(int i = 0; i < s; i++) {
            System.out.println(numeros[i] + " ");
            if(numeros[i] % 2 == 0) {
                sumaPares += numeros[i];
            } else {
                sumaImpares += numeros[i];
            }
        }
        System.out.println("\nLa suma de numeros pares: " + sumaPares);
        System.out.println("\nLa suma de numeros impares: " + sumaImpares);
    }

    public void Ejercicio4(int edad){
        int[] edades1 = llenarArregloAleatorios(edad);
        int[] edades2 = llenarArregloAleatorios(edad);
        int mayor1 = edades1[0];
        int mayor2 = edades2[0];
        for (int i = 1; i < edad; i++) {
            if (edades1[i] > mayor1) mayor1 = edades1[i];
            if (edades2[i] > mayor2) mayor2 = edades2[i];
        }
        System.out.println("\nEdades del grupo 1 " + "\n" +mostrarElementos(edades1));
        System.out.println("\nEdades del grupo 2 " + "\n" +mostrarElementos(edades2));
        System.out.println("\nLa edad mayor en general es: " + "\n" + Math.max(mayor1, mayor2));
    }

    public void Ejercicio5(int c){
        double[] PU = new double[c];
        int[] CC = new int[c];
        String[] descripciones = new String[c];
        double[] totalGastos = new double[c];

        for (int i = 0; i < c; i++) {
            System.out.println("\nProducto " + (i+1));
            System.out.print("Descripción: ");
            descripciones[i] = scanner.nextLine();
            System.out.print("Precio unitario: ");
            PU[i] = scanner.nextDouble();
            System.out.print("Cantidad comprada: ");
            CC[i] = scanner.nextInt();
            totalGastos[i] = PU[i] * CC[i];
        }

        System.out.println("\nResumen de gastos:");
            for (int i = 0; i < c; i++) {
                System.out.printf(descripciones[i] + totalGastos[i]);
        }     
    }

    public void Ejercicio6(int k){
        double[] alquiler = new double[k];
        double[] porcentajes = new double[k];
        double[] ganancias = new double[k];

        for(int i = 0; i < k; i++) {
            System.out.println("\nvivienda " + (i+1));
            System.out.println("Alquiler mensual: ");
            alquiler[i] = scanner.nextDouble();
            System.out.println("porcentaje de ganacia (%): ");
            porcentajes[i] = scanner.nextDouble();
            ganancias[i] = alquiler[i] *(porcentajes[i]/100);
        }
        System.out.println("\nGanacia por vivienda:");
        for (int i = 0; i < k; i++) {
            System.out.println("Vivienda " + (i + 1) + ": $" + String.format("%.2f", ganancias[i]));
        }
    }

    public void Ejercicio7(int[] p) {
        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int num : p) {
            if (num % 2 == 0) {
                pares.add(num);
            } else {
                impares.add(num);
            }
        }
    System.out.println("\nArreglo de números pares:");
    System.out.println(pares);
    System.out.println("Arreglo de números impares:");
    System.out.println(impares);
    }

    public void Ejercicio8(int[] y) {
        int mayor = y[0];
        int menor = y[0];
        int contarMayor = 1;
        int contarMenor = 1;

        for(int i = 1; i < y.length; i++) {
            if(y[i] > mayor) {
                mayor = y[i];
                contarMayor = 1;
            }else if (y[i] == mayor){
                contarMayor++;
            }
            if(y[i] < menor) {
                menor = y[i];
                contarMenor = 1;
            }else if (y[i] == menor){
                contarMenor++;
            }
        }
        System.out.println("\n Resultados: ");
        System.out.println("Número mayor: " + mayor + " (se repite " + contarMayor + " veces)");
        System.out.println("Número menor: " + menor + " (se repite " + contarMenor + " veces)");
    
    }

    public void ejercicio9(int[] arreglo, int numBuscar) {
        int repetido = 0;
        for(int num : arreglo) {
            if(num == numBuscar) repetido++;
        }
        System.out.println("\nEl número " + numBuscar + " aparece " + repetido + " veces en el arreglo");
    }

}


