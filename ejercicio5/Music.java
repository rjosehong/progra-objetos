public class Music extends Proceso {
    public Music(int pid, String nombre) {
        super(pid, nombre);
    }

    @Override
    public void ejecutar() {
        System.out.println(getNombre() + " está escuchando música");
    }
}