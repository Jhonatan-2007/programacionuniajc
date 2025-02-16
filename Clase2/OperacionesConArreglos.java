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
            System.out.printf("Empleado %d: %.2f\n", i+1, pagoNeto[i]);
        }
    }

}

