public class Pago {
    private double subTotal;
    private double propina;
    private double impuestos;
    
    public Pago(double subTotal, double propina, double impuestos) {
        this.subTotal = subTotal;
        this.propina = propina;
        this.impuestos = impuestos;
    }
    
    public double getSubTotal() {
        return subTotal;
    }
    
    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
    
    public double getPropina() {
        return propina;
    }
    
    public void setPropina(double propina) {
        this.propina = propina;
    }
    
    public double getImpuestos() {
        return impuestos;
    }
    
    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }
    
    public double calculoTotal(double subTotal, double propina, double impuestos) {
        return subTotal + propina + impuestos;
    }
}