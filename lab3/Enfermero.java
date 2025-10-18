public class Enfermero extends PersonalMedico {
    private String tipo_turno;
    private String nivel_certificacion;

    public Enfermero(String id, String nombre, String departamento, int años_exp, int salario_base, 
    String tipo_turno, String nivel_certificacion) {
        super(id, nombre, departamento, años_exp, salario_base);
        this.tipo_turno=tipo_turno;
        this.nivel_certificacion=nivel_certificacion;
    }

    public String getTipo_turno() {
        return tipo_turno;
    }

    public String getNivel_certificacion() {
        return nivel_certificacion;
    }
}
