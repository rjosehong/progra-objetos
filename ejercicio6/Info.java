public class Info{
    private String id;
    private String tipo;
    private String funcion;

    public Info(String id, String tipo, String funcion) {
        this.id = id;
        this.tipo = tipo;
        this.funcion = funcion;
    }

    public String getID() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }
    
    public String getFuncion(){
        return funcion;
    }
}
