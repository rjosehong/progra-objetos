import java.util.ArrayList;
public class Gimnasio {
    private ArrayList<Rutinas> rutinas = new ArrayList<>();
    public ArrayList<Rutinas> getRutinas(){
        return rutinas;
    }
    public void addRutinas(int id, String nombre, boolean activa){
        rutinas.add(new Rutinas(id, nombre, activa));
    }

    private ArrayList<Datos> datosG = new ArrayList<>();
    public ArrayList<Datos> getDatos(){
        return datosG;
    }
    public void addDatos(String nombre, String entrenadores, String tipo_membresia, Rutinas rutinass){
        datosG.add(new Datos(nombre, entrenadores, tipo_membresia, rutinass));
    }
}