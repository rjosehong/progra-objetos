import java.util.*;

public class Radiologo extends PersonalMedico {
    private ArrayList<String> equipo_usado;
    private int tarifa_estudio;
    
    public Radiologo(String id, String nombre, String departamento, int años_exp, int salario_base,
    ArrayList<String> equipo_usado, int tarifa_estudio) {
        super(id, nombre, departamento, años_exp, salario_base);
        this.equipo_usado=equipo_usado;
        this.tarifa_estudio=tarifa_estudio;
    }

    public ArrayList<String> getEquipo_usado() {
        return equipo_usado;
    }

    public int getTarifa_estudio() {
        return tarifa_estudio;
    }
}
