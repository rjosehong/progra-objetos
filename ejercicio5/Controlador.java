import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private List<Proceso> procesos;

    public Controlador() {
        procesos = new ArrayList<>();
    }

    public void registrarProceso(Proceso p) {
        procesos.add(p);
    }

    public void ejecutarProcesos() {
        for (Proceso p : procesos) {
            p.ejecutar();
        }
    }
}