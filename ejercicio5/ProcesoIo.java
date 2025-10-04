public class ProcesoIo extends Proceso {
    public ProcesoIo(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public void ejecutar() {
        System.out.println(getNombre() + " está esperando entrada y/o salida de dispositivos");
    }
}