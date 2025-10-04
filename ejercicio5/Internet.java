public class Internet extends Proceso {
    public Internet(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public void ejecutar() {
        System.out.println(getNombre() + " está buscando algo en internet");
    }
}