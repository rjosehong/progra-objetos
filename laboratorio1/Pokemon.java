public class Pokemon {
    private String nombre;
    private String tipo;
    private int ataque;
    private int defensa;
    private Habilidades habilidad_especial;

    public Pokemon(String nombre, String tipo, int ataque, int defensa, Habilidades habilidad_especial){
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
        this.habilidad_especial = habilidad_especial;

    }
    public void setNombre(String var1){
        this.nombre = var1;
    }
    public void setTipo(String var1){
        this.tipo = var1;
    }
    public void setAtaque(int var1){
        this.ataque = var1;
    }
    public void setDefensa(int var1){
        this.defensa = var1;
    }
    public void setHE(Habilidades habilidades){
        this.habilidad_especial = habilidades;
    }

    public String getNombre(){
        return nombre;
    }
    public String getTipo(){
        return tipo;
    }
    public int getAtaque(){
        return ataque;
    }
    public int getDefensa(){
        return defensa;
    }
    public Habilidades getHE(){
        return habilidad_especial;
    }

    
}
