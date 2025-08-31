public class Datos {
    private String nombre;
    private String entrenadores;
    private String tipo_membresia;
    private Rutinas rutinass;

    public Datos(String nombre, String entrenadores, String tipo_membresia, Rutinas rutinass){
        this.nombre=nombre;
        this.entrenadores=entrenadores;
        this.tipo_membresia=tipo_membresia;
        this.rutinass=rutinass;
    }
    
    public String getNombre() {
        return nombre;
    }
    public String getEntrenadores() {
        return entrenadores;
    }
    public String getTipoMembresia() {
        return tipo_membresia;
    }
    public Rutinas getRutinass(){
        return rutinass;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEntrenadores(String entrenadores) {
        this.entrenadores = entrenadores;
    }
    public void setTipo_membresia(String tipo_membresia) {
        this.tipo_membresia = tipo_membresia;
    }
    public void setRutinass(Rutinas rutinass){
        this.rutinass = rutinass;
    }

    public String toString(){
         return "Nombre: "+nombre+" | Entrenador: "+entrenadores+" | Membresía: "+tipo_membresia+" | "+ rutinass.toString();
    }
}