public class Rutinas {
    private int id;
    private String nombre;
    private boolean activa;

    public Rutinas(int id, String nombre, boolean activa){
        this.id = id;
        this.nombre= nombre;
        this.activa = activa;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setActiva(boolean activa){
        this.activa = activa;
    }

    public String toString() {
        return "ID: " + id + " | Nombre de rutina: " + nombre + " | Activa: " + activa;
    }
}