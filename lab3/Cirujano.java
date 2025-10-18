public class Cirujano extends PersonalMedico {
    private String operaciones;
    private int horas_cirugia;
    private int bono_riesgo;
    private int tarifa_hora;

    public Cirujano(String id, String nombre, String departamento, int años_exp, int salario_base, 
    String operaciones, int horas_cirugia, int bono_riesgo, int tarifa_hora){
        super(id, nombre, departamento, años_exp, salario_base);
        this.operaciones=operaciones;
        this.horas_cirugia=horas_cirugia;
        this.bono_riesgo=bono_riesgo;
        this.tarifa_hora=tarifa_hora;
    }

    public String getOperaciones() {
        return operaciones;
    }

    public int getHoras_cirugia() {
        return horas_cirugia;
    }

    public int getBono_riesgo() {
        return bono_riesgo;
    }

    public int getTarifa_hora() {
        return tarifa_hora;
    }
    
}
