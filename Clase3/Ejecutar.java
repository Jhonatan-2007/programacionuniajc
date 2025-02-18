public class Ejecutar {
    public static void main(String[] args) {
        //crear el objeto para acceder a la clase MetodoAreglo

        MetodoArreglos obj = new MetodoArreglos();

        String[] nombres = { "Alan", "Devora", "Miguel", "Sandra", "Diego" };
        int[] sueldos = { 100, 200, 150, 300, 100 };

        System.out.println(obj.nombreSueldos(nombres, sueldos));
    }
}