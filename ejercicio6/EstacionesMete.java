public class EstacionesMete extends Info implements Reportaje{
    public EstacionesMete(String id, String tipo, String funcion){
        super(id, tipo, funcion);
    }
    
    public void Reportaje(){
        System.out.println("La estación es capaz de generar reportajes");
    }
}
