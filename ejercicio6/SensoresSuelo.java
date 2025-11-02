public class SensoresSuelo extends Info implements Abrir, Riego{
    private String funcion2;
    public SensoresSuelo(String id, String tipo, String funcion, String funcion2){
        super(id, tipo, funcion);
        this.funcion2 = funcion2;
    }

    public String getFuncion2(){
        return funcion2;
    }
    
    public void Abrir(){
        System.out.println("Es capaz de abrir valvulas");
    }
    public void Riego(){
        System.out.println("Es capaz de regar un terreno");
    }
}
