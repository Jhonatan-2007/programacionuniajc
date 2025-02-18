import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

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

    public void ejercicio10(int[] arregloA) {
        int[] arregloB = new int[arregloA.length/2 + arregloA.length%2];
        
        for(int i = 0; i < arregloB.length; i++) {
            if(i == arregloB.length-1 && arregloA.length%2 != 0) {
                arregloB[i] = arregloA[i];
            } else {
                arregloB[i] = arregloA[i] + arregloA[arregloA.length-1-i];
            }
        }
        System.out.println("\nArreglo original:");
        System.out.println(mostrarElementos(arregloA));
        System.out.println("Arreglo resultante (suma de opuestos):");
        System.out.println(mostrarElementos(arregloB));
    }

    public void Ejercicio11(int[] arreglo) {
        List<Integer> negativos = new ArrayList<>();
        List<Integer> ceros = new ArrayList<>();
        List<Integer> positivos = new ArrayList<>();
        for (int num : arreglo) {
            if (num < 0) negativos.add(num);
            else if (num == 0) ceros.add(num);
            else positivos.add(num);
        }
        System.out.println("\nNegativos:\n" + negativos);
        System.out.println("Ceros:\n" + ceros);
        System.out.println("Positivos:\n" + positivos);
    }

    public void Ejercicio12(int[] arreglo, int valor) {
        int[] posiciones = encontrarPosiciones(arreglo, valor);
        System.out.println("\nPosiciones encontradas:");
        System.out.println(mostrarElementos(posiciones));
        }
        public int[] encontrarPosiciones(int[] arreglo, int valor) {
        int contador = 0;
        for (int num : arreglo) {
            if (num == valor) {
                contador++;
            }
        }
        int[] posiciones = new int[contador];
        int index = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                posiciones[index++] = i;
            }
        }
        return posiciones;
    }

    public void Ejercicio13(double[] secuencia) {
        double suma = 0;
        for (double num : secuencia) {
            suma += num;
        }
        double media = suma / secuencia.length;
        System.out.println("\nMedia: " + media);
        System.out.println("Mayores que la media:");
        for (double num : secuencia) {
            if (num > media) {
                System.out.print(num + " ");
            }
        }
        System.out.println("\nMenores que la media:");
        for (double num : secuencia) {
            if (num < media) {
                System.out.print(num + " ");
            }
        }
    }

    public void Ejercicio14(int[] vector) {
        int[] diferencias = diferenciaSucesiva(vector);
        System.out.println("\nDiferencias sucesivas:");
        System.out.println(mostrarElementos(diferencias));
    }
    int[] diferenciaSucesiva(int[] vector) {
        int[] diferencias = new int[vector.length - 1];
        for (int i = 0; i < vector.length - 1; i++) {
            diferencias[i] = vector[i + 1] - vector[i];
        }
        return diferencias;
    }

    /* que yo hice
    public void Ejercicio15(int ts) {
        String[] nombres = new String[ts];
        double[] sueldos = new double[ts];
        for (int i = 0; i < ts; i++) {
            System.out.print("Nombre del trabajador " + (i + 1) + ": ");
            nombres[i] = scanner.nextLine();
            System.out.print("Sueldo de " + nombres[i] + ": ");
            sueldos[i] = scanner.nextDouble();
            scanner.nextLine(); 
        }
        String[] resultado = encontrarSueldosPromedio(nombres, sueldos);
        System.out.println("\nTrabajadores con sueldo promedio:");
        for (String nombre : resultado) {
            System.out.println(nombre);
        }
    }
        String[] encontrarSueldosPromedio(String[] nombres, double[] sueldos) {
        double suma = 0;
        for (double sueldo : sueldos) {
            suma += sueldo;
        }
        double promedio = suma / sueldos.length;
        int count = 0;
        for (double sueldo : sueldos) {
            if (sueldo == promedio) {
                count++;
            }
        }
        String[] resultado = new String[count];
        int index = 0;
        for (int i = 0; i < sueldos.length; i++) {
            if (sueldos[i] == promedio) {
                resultado[index] = nombres[i];
                index++;
            }
        }
        return resultado;
    }
    */
    

   /*En clase  ejercicio 15
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
    return cad += "fueron "+ contador +" los empleados";
   }
   */
   

    /* 
    public void Ejercicio16(int ap) {
        String[] nombres = new String[ap];
        int[] edades = new int[ap];
        String[] sexos = new String[ap];
        for (int i = 0; i < ap; i++) {
            System.out.print("Nombre del profesor " + (i+1) + ": ");
            nombres[i] = scanner.nextLine();
            System.out.print("Edad de " + nombres[i] + ": ");
            edades[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Sexo de " + nombres[i] + " (F/M): ");
            sexos[i] = scanner.nextLine();
        }
        double sumaEdades = 0;
        for (int edad : edades) {
            sumaEdades += edad;
        }
        double edadPromedio = sumaEdades / ap;
        int edadMinima = edades[0];
        String profesorJoven = nombres[0];
        for (int i = 1; i < ap; i++) {
            if (edades[i] < edadMinima) {
                edadMinima = edades[i];
                profesorJoven = nombres[i];
            }
        }
        int edadMaxima = edades[0];
        String profesorMayor = nombres[0];
        for (int i = 1; i < ap; i++) {
            if (edades[i] > edadMaxima) {
                edadMaxima = edades[i];
                profesorMayor = nombres[i];
            }
        }
        int profesorasMayorPromedio = 0;
        for (int i = 0; i < ap; i++) {
            if (sexos[i].equalsIgnoreCase("F") && edades[i] > edadPromedio) {
                profesorasMayorPromedio++;
            }
        }
        int profesoresMenorPromedio = 0;
        for (int i = 0; i < ap; i++) {
            if (sexos[i].equalsIgnoreCase("M") && edades[i] < edadPromedio) {
                profesoresMenorPromedio++;
            }
        }
        System.out.println("\nRESULTADOS DEL ANÁLISIS:");
        System.out.printf("Edad promedio: %.1f años\n", edadPromedio);
        System.out.println("Profesor más joven: " + profesorJoven + " (" + edadMinima + " años)");
        System.out.println("Profesor con mayor edad: " + profesorMayor + " (" + edadMaxima + " años)");
        System.out.println("Profesoras con edad mayor al promedio: " + profesorasMayorPromedio);
        System.out.println("Profesores con edad menor al promedio: " + profesoresMenorPromedio);
    }
    */
    
}


