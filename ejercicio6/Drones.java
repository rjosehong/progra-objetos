public class Drones extends Info implements Captura, Medible, Riego{
    public Drones(String id, String tipo, String funcion){
        super(id, tipo, funcion);
    }

    public void Captura(){
        System.out.println("Este dron es capaz de capturar imágenes multiespectrales");
    }
    public void Medir(){
        System.out.println("Este dron es capaz medir un terreno");
    }
    public void Riego(){
        System.out.println("Este dron es capaz de regar un terreno");
    }
}
