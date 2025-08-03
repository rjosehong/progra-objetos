public class Habilidades {
    private String HNombre;
    private String HEfecto;
    private String HTipo;
    private int probabilidad;

    public Habilidades(String nombre, String efecto, String tipo, int probabilidad){
        this.probabilidad = probabilidad;
        this.HNombre = nombre;
        this.HEfecto = efecto;
        this.HTipo = tipo;
    }

    public void setHNombre(String var1){
        this.HNombre = var1;
    }
    public void setHEfecto(String var1){
        this.HEfecto = var1;
    }
    public void setHTipo(String var1){
        this.HTipo = var1;
    }
    public void setProbabilidad(int var1){
        this.probabilidad = var1;
    }

    public String getHNombre(){
        return HNombre;
    }
    public String getHEfecto(){
        return HEfecto;
    }
    public String getHTipo(){
        return HTipo;
    }
    public int getProbabilidad(){
        return probabilidad;
    }
}
