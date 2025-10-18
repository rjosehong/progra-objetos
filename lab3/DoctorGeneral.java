public class DoctorGeneral extends PersonalMedico {
    private String especializacion;
    private int capacidad_pacientes;
    private int tarifa_consulta;
    private int no_consultas;
    private int salarioDG;
    

    public DoctorGeneral(String id, String nombre, String departamento, int años_exp, int salario_base, String especializacion,
    int capacidad_pacientes, int tarifa_consulta, int no_consultas){
        super(id, nombre, departamento, años_exp, salario_base);
        this.especializacion=especializacion;
        this.capacidad_pacientes=capacidad_pacientes;
        this.tarifa_consulta=tarifa_consulta;
        this.no_consultas=no_consultas;
    }

    public int getSalarioDG(){
        return salarioDG;
    }
    public String getEspecializacion() {
        return especializacion;
    }

    public int getCapacidad_pacientes() {
        return capacidad_pacientes;
    }

    public int getTarifa_consulta() {
        return tarifa_consulta;
    }
    
    public int getNoConsultas(){
        return no_consultas;
    }

    public void setEspecializacion(String especializacion) {
        this.especializacion = especializacion;
    }

    public void setCapacidad_pacientes(int capacidad_pacientes) {
        this.capacidad_pacientes = capacidad_pacientes;
    }

    public void setTarifa_consulta(int tarifa_consulta) {
        this.tarifa_consulta = tarifa_consulta;
    }
}
