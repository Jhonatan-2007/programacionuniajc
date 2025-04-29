import java.util.ArrayList;

public class ActividadArraylist {

     private static final double EMISION_GASOLINA = 2500;
     private static final double EMISION_DIESEL = 3000;
     private static final double EMISION_GAS = 1800;
 
     static class CategoriaVehiculo {
         String nombre;
         int cantidad;
         double porcentajeGasolina;
         double porcentajeDiesel;
         double porcentajeGas;
 
         public CategoriaVehiculo(String nombre, int cantidad, double porcentajeGasolina, 
                                 double porcentajeDiesel, double porcentajeGas) {
             this.nombre = nombre;
             this.cantidad = cantidad;
             this.porcentajeGasolina = porcentajeGasolina;
             this.porcentajeDiesel = porcentajeDiesel;
             this.porcentajeGas = porcentajeGas;
         }
     }
 
     public static void main(String[] args) {
        
         ArrayList<CategoriaVehiculo> categorias = new ArrayList<>();
         categorias.add(new CategoriaVehiculo("Camiones Livianos", 400000, 0.30, 0.40, 0.25));
         categorias.add(new CategoriaVehiculo("Camiones Medianos", 280000, 0.25, 0.50, 0.25));
         categorias.add(new CategoriaVehiculo("Camiones Pesados", 380000, 0.10, 0.80, 0.10));
         categorias.add(new CategoriaVehiculo("Tractocamiones", 1150000, 0.05, 0.90, 0.05));
         categorias.add(new CategoriaVehiculo("Volquetas", 936000, 0.40, 0.40, 0.20));
 
         System.out.println(" \n*CÁLCULO DE EMISIONES DE CO2*");
 
         double totalGeneral = 0;
 
         for (CategoriaVehiculo categoria : categorias) {
             System.out.println("-CATEGORÍA: " + categoria.nombre);
             System.out.println("-Total vehículos: " + String.format("%,d", categoria.cantidad));

             double vehiculosGasolina = categoria.cantidad * categoria.porcentajeGasolina;
             double vehiculosDiesel = categoria.cantidad * categoria.porcentajeDiesel;
             double vehiculosGas = categoria.cantidad * categoria.porcentajeGas;
             
             System.out.println("\n*Distribución por combustible:*");
             System.out.printf("Gasolina: %,.0f veh × %.2f = %,.0f veh\n", 
                             (double)categoria.cantidad, categoria.porcentajeGasolina, vehiculosGasolina);
             System.out.printf("Diesel:   %,.0f veh × %.2f = %,.0f veh\n", 
                             (double)categoria.cantidad, categoria.porcentajeDiesel, vehiculosDiesel);
             System.out.printf("Gas:      %,.0f veh × %.2f = %,.0f veh\n", 
                             (double)categoria.cantidad, categoria.porcentajeGas, vehiculosGas);
             
             double emisionesGasolina = vehiculosGasolina * EMISION_GASOLINA;
             double emisionesDiesel = vehiculosDiesel * EMISION_DIESEL;
             double emisionesGas = vehiculosGas * EMISION_GAS;
             double totalCategoria = emisionesGasolina + emisionesDiesel + emisionesGas;
             totalGeneral += totalCategoria;
             
             System.out.println("\n*Emisiones de CO2:*");
             System.out.printf("Gasolina: %,.0f veh × %,d kg = %,d kg\n", 
                             vehiculosGasolina, (int)EMISION_GASOLINA, (long)emisionesGasolina);
             System.out.printf("Diesel:   %,.0f veh × %,d kg = %,d kg\n", 
                             vehiculosDiesel, (int)EMISION_DIESEL, (long)emisionesDiesel);
             System.out.printf("Gas:      %,.0f veh × %,d kg = %,d kg\n", 
                             vehiculosGas, (int)EMISION_GAS, (long)emisionesGas);
             
             System.out.printf("\n*TOTAL %s: %,d kg CO2*\n", 
                             categoria.nombre, (long)totalCategoria);
         }
 
         System.out.println("========================================");
         System.out.printf("TOTAL GENERAL DE EMISIONES: %,d kg CO2\n", (long)totalGeneral);
     }
}