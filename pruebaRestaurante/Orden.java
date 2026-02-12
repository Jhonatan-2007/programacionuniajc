class Orden {
    private int hora;
    private String mesero;
    
    public Orden(int hora, String mesero) {
        this.hora = hora;
        this.mesero = mesero;
    }
    
    public int getHora() {
        return hora;
    }
    
    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public String getMesero() {
        return mesero;
    }
    
   public void setMesero(String mesero) {
        this.mesero = mesero;
    }
}