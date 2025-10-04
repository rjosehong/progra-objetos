public class Daemon extends Proceso {
    public Daemon(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public void ejecutar() {
        System.out.println(getNombre() + " se está ejecutando en segundo plano");
    }
}