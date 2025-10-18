public class Terapeuta extends PersonalMedico {
    private String tipo_terapia;
    private int duracion_sesion;
    private int no_sesiones;
    private int precio_sesion;

    public Terapeuta(String id, String nombre, String departamento, int años_exp, int salario_base, 
    String tipo_terapia, int duracion_sesion, int no_sesiones, int precio_sesion) {
        super(id, nombre, departamento, años_exp, salario_base);
        this.tipo_terapia=tipo_terapia;
        this.duracion_sesion=duracion_sesion;
        this.no_sesiones=no_sesiones;
        this.precio_sesion=precio_sesion;
    }

    public String getTipo_terapia() {
        return tipo_terapia;
    }

    public int getDuracion_sesion() {
        return duracion_sesion;
    }

    public int getPrecio_sesion() {
        return precio_sesion;
    }

    public int getNo_sesiones() {
        return no_sesiones;
    }
}
