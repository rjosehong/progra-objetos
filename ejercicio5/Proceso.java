public abstract class Proceso {
    private int id;
    private String nombre;

    public Proceso(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getPid() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract void ejecutar();

    @Override
    public String toString() {
        return "PID: " + id + " | Nombre: " + nombre;
    }
}


