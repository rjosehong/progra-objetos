public class Procesocpu extends Proceso {
    public Procesocpu(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public void ejecutar() {
        System.out.println(getNombre() + " está haciendo procesos de la cpu");
    }
}