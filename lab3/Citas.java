public class Citas extends PersonalMedico{
    private String id_cita;
    private String nombre_paciente;
    private int fecha;
    private int hora;
    private String tipo_cita;
    private String estado_actual;


    public Citas(String nombre, String id_cita, String nombre_paciente, int fecha, int hora, String tipo_cita, String estado_actual) {
        super("", nombre, "", 0, 0);
        this.id_cita=id_cita;
        this.nombre_paciente=nombre_paciente;
        this.fecha=fecha;
        this.hora=hora;
        this.tipo_cita=tipo_cita;
        this.estado_actual=estado_actual;
    }

    public String getId_cita() {
        return id_cita;
    }

    public String getNombre_paciente() {
        return nombre_paciente;
    }

    public int getFecha() {
        return fecha;
    }

    public int getHora() {
        return hora;
    }

    public String getTipo_cita() {
        return tipo_cita;
    }

    public String getEstado_actual() {
        return estado_actual;
    }
}