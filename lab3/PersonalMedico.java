public abstract class PersonalMedico {
    private String id;
    private String nombre;
    private String departamento;
    private int años_exp;
    protected int salario_base;

    public PersonalMedico(String id, String nombre, String departamento, int años_exp, int salario_base) {
        this.id=id;
        this.nombre=nombre;
        this.departamento=departamento;
        this.años_exp=años_exp;
        this.salario_base=salario_base;
    }
    
    public String getID(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDepart(){
        return departamento;
    }
    public int getAñosExp(){
        return años_exp;
    }
    public int getSalarioBase(){
        return salario_base;
    }
}