import java.util.Date;

public class Credito {
    private int numeroDeCredito;
    private String tipo;
    private Date fechaDeExp;
    private String nombre;
    
    public Credito(int numeroDeCredito, String tipo, Date fechaDeExp, String nombre) {
        this.numeroDeCredito = numeroDeCredito;
        this.tipo = tipo;
        this.fechaDeExp = fechaDeExp;
        this.nombre = nombre;
    }
    
    public int getNumeroDeCredito() {
        return numeroDeCredito;
    }
    
    public void setNumeroDeCredito(int numeroDeCredito) {
        this.numeroDeCredito = numeroDeCredito;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public Date getFechaDeExp() {
        return fechaDeExp;
    }
    
    public void setFechaDeExp(Date fechaDeExp) {
        this.fechaDeExp = fechaDeExp;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean hacerCargo(double total) {
        System.out.println("Procesando cargo de $" + total + " en tarjeta " + tipo + 
                           " de " + nombre);
        return true;
    }
}