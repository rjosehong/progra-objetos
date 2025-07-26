public class Boleto {
    private String nombre;
    private String email;
    private int cantidad_boletos;
    private int presupuesto;
    
    public Boleto(String nombre, String email, int cantidad_boletos, int presupuesto){
        this.nombre = nombre;
        this.email = email;
        this.cantidad_boletos = cantidad_boletos;
        this.presupuesto = presupuesto;
    }
    
    public String getNombre(){
        return nombre;
    }

    public String getEmail(){
        return email;
    }

    public int getCantidad(){
        return cantidad_boletos;
    }

    public int getPresupuesto(){
        return presupuesto;
    }
}
