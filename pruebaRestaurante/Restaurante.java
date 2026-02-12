import java.util.Date;
import java.util.Scanner;

public class Restaurante {
    // Arrays con tamaño fijo y contadores
    private Cliente[] clientes = new Cliente[50];
    private Orden[] ordenes = new Orden[100];
    private Bebida[] bebidas = new Bebida[200];
    private Platillo[] platillos = new Platillo[200];
    private Pago[] pagos = new Pago[50];
    private int cCli=0, cOrd=0, cBeb=0, cPla=0, cPag=0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Restaurante r = new Restaurante();
        
        System.out.println("=== RESTAURANTE ===\n");
        
        // Registrar cliente
        System.out.print("Mesa: "); int mesa = sc.nextInt();
        System.out.print("Comensales: "); int com = sc.nextInt();
        r.clientes[r.cCli++] = new Cliente(mesa, com);
        System.out.println("Cliente registrado\n");
        
        // Crear orden
        System.out.print("Hora: "); int hora = sc.nextInt(); sc.nextLine();
        System.out.print("Mesero: "); String mesero = sc.nextLine();
        r.ordenes[r.cOrd++] = new Orden(hora, mesero);
        System.out.println("Orden creada\n");
        
        // Agregar bebidas
        System.out.print("¿Bebidas? "); int nBeb = sc.nextInt(); sc.nextLine();
        for(int i=0; i<nBeb; i++) {
            System.out.print("Cantidad: "); int cant = sc.nextInt(); sc.nextLine();
            System.out.print("Tipo: "); String tipo = sc.nextLine();
            r.bebidas[r.cBeb++] = new Bebida(cant, tipo);
        }
        
        // Agregar platillos
        System.out.print("\n¿Platillos? "); int nPla = sc.nextInt(); sc.nextLine();
        for(int i=0; i<nPla; i++) {
            System.out.print("Cantidad: "); int cant = sc.nextInt(); sc.nextLine();
            System.out.print("Tipo: "); String tipo = sc.nextLine();
            r.platillos[r.cPla++] = new Platillo(cant, tipo);
        }
        
        // Calcular subtotal
        double sub = 0;
        for(int i=0; i<r.cBeb; i++) sub += r.bebidas[i].getCantidad() * r.precioBebida(r.bebidas[i].getTipo());
        for(int i=0; i<r.cPla; i++) sub += r.platillos[i].getCantidad() * r.precioPlatillo(r.platillos[i].getTipo());
        
        // Pago
        System.out.print("\nPropina: $"); double pro = sc.nextDouble();
        System.out.print("Impuestos: $"); double imp = sc.nextDouble();
        Pago pago = new Pago(sub, pro, imp);
        r.pagos[r.cPag++] = pago;
        double total = pago.calculoTotal(sub, pro, imp);
        
        System.out.println("\n=== TOTAL ===");
        System.out.println("Subtotal: $" + sub + "\nPropina: $" + pro + "\nImpuestos: $" + imp + "\nTotal: $" + total);
        
        // Método de pago
        System.out.println("\n1.Crédito 2.Efectivo"); 
        if(sc.nextInt() == 1) {
            System.out.print("Número: "); int num = sc.nextInt(); sc.nextLine();
            System.out.print("Tipo: "); String tipo = sc.nextLine();
            System.out.print("Nombre: "); String nom = sc.nextLine();
            new Credito(num, tipo, new Date(), nom).hacerCargo(total);
        } else {
            System.out.print("Efectivo: $"); double efec = sc.nextDouble();
            Efectivo e = new Efectivo(); e.setCantidad(efec);
            System.out.println("Cambio: $" + (e.getCantidad() - total));
        }
        
        // Resumen
        System.out.println("\n=== RESUMEN ===");
        System.out.println("Clientes: " + r.cCli + "\nOrdenes: " + r.cOrd + 
                         "\nBebidas: " + r.cBeb + "\nPlatillos: " + r.cPla + "\nPagos: " + r.cPag);
        sc.close();
    }
    
    private double precioBebida(String t) {
        t = t.toLowerCase();
        if(t.equals("agua")) return 1.5;
        if(t.equals("refresco")) return 2.5;
        if(t.equals("cerveza")) return 3.5;
        if(t.equals("vino")) return 8.0;
        return 2.0;
    }
    
    private double precioPlatillo(String t) {
        t = t.toLowerCase();
        if(t.equals("ensalada")) return 8.5;
        if(t.equals("sopa")) return 6.5;
        if(t.equals("pasta")) return 12.5;
        if(t.equals("carne")) return 18.0;
        if(t.equals("pescado")) return 16.0;
        if(t.equals("postre")) return 5.5;
        return 10.0;
    }
}