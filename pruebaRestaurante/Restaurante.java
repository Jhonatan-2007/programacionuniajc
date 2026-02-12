import java.util.Date;
import java.util.Scanner;

public class Restaurante {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\nRESTAURANTE \n");

        System.out.print("Mesa: "); 
        int mesa = sc.nextInt();

        System.out.print("Comensales: "); 
        int comensales = sc.nextInt();
        
        Cliente cliente = new Cliente(mesa, comensales);
        System.out.println("Cliente registrado "+"MESA: "+mesa+" y COMENSALES: "+comensales+"\n");


        System.out.print("Hora: "); 
        int hora = sc.nextInt(); 
        sc.nextLine();

        System.out.print("Mesero: "); 
        String mesero = sc.nextLine();

        Orden orden = new Orden(hora, mesero);
        System.out.println("Orden creada "+"HORA: "+hora+" MESERO: "+mesero+"\n");

        
        System.out.print("Bebida (cantidad): ");
        int cantBeb = sc.nextInt(); sc.nextLine();
        System.out.print("Tipo (Agua, Gaseosa, Jugos): ");
        String tipoBeb = sc.nextLine();
        Bebida bebida = new Bebida(cantBeb, tipoBeb);

        System.out.print("\nPlatillo (cantidad): ");
        int cantPla = sc.nextInt(); sc.nextLine();
        System.out.print("Tipo(Entradas, plato fuerte, postres): ");
        String tipoPla = sc.nextLine();
        Platillo platillo = new Platillo(cantPla, tipoPla);

        double subtotal = (cantBeb * 2.0) + (cantPla * 10.0); 

        
        System.out.print("\nPropina: $");
        double propina = sc.nextDouble();
        System.out.print("Impuestos: $");
        double impuestos = sc.nextDouble();
        Pago pago = new Pago(subtotal, propina, impuestos);
        double total = pago.calculoTotal(subtotal, propina, impuestos);
        
        System.out.println("\nTOTAL: $" + total);
        
        System.out.println("\n1. Crédito  2. Efectivo");
        if(sc.nextInt() == 1) {
            sc.nextLine();
            System.out.print("Número: ");
            int num = sc.nextInt(); sc.nextLine();
            System.out.print("Tipo: ");
            String tipo = sc.nextLine();
            System.out.print("Nombre: ");
            String nombre = sc.nextLine();
            
            Credito credito = new Credito(num, tipo, new Date(), nombre);
            credito.hacerCargo(total);
        } else {
            System.out.print("Efectivo: $");
            double efectivo = sc.nextDouble();
            Efectivo ef = new Efectivo();
            ef.setCantidad(efectivo);
            System.out.println("Cambio: $" + (ef.getCantidad() - total));
        }
        
        sc.close();
        System.out.println("\n¡Gracias!");
    }
}