import java.util.*;
public class Controlador {
    private List<Info> unidades = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public Controlador(){
        unidades.add(new Drones("001", "Riego", "Regar campo 1"));
        unidades.add(new Drones("002", "Riego", "Regar campo 2"));
        unidades.add(new Drones("003", "Captura de imágenes", "Tomar imágenes campo 1"));
        unidades.add(new Drones("004", "Captura de imágenes", "Tomar imágenes campo 2"));
        unidades.add(new Drones("005", "Medir", "Medir campo 1"));
        unidades.add(new Drones("006", "Medir", "Medir campo 2"));
        unidades.add(new SensoresSuelo("007", "Multifuncional", "Abrir válvulas", "Regar parcelas"));
        unidades.add(new SensoresSuelo("008", "Multifuncional", "Abrir válvulas", "Regar parcelas"));
        unidades.add(new SensoresSuelo("009", "Multifuncional", "Abrir válvulas", "Regar parcelas"));
        unidades.add(new EstacionesMete("010", "Reportaje", "Crear reportes"));
    }

    public void Mostrar(){
        for (Info info : unidades){
            if(info instanceof Drones){
                Drones d = (Drones) info;
                if(d.getTipo().equalsIgnoreCase("Riego")){
                    System.out.print("ID: " + d.getID() + ", Tipo: " + d.getTipo() + ", Función: " + d.getFuncion() + ". ");
                    d.Riego();
                }
                else if(d.getTipo().equalsIgnoreCase("Captura de imagenes")){
                    System.out.print("ID: " + d.getID() + ", Tipo: " + d.getTipo() + ", Función: " + d.getFuncion() + ". ");
                    d.Captura();
                }
                else if(d.getTipo().equalsIgnoreCase("Medir")){
                    System.out.print("ID: " + d.getID() + ", Tipo: " + d.getTipo() + ", Función: " + d.getFuncion() + ". ");
                    d.Medir();
                }
            }
            else if(info instanceof SensoresSuelo){
                SensoresSuelo ss = (SensoresSuelo) info;
                System.out.print("ID: " + ss.getID() + ", Tipo: " + ss.getTipo() + ", Función 1: " + ss.getFuncion() + ", Función 2: " + ss.getFuncion2() + ". ");
                ss.Abrir();
                System.out.print(" y ");
                ss.Riego();
            }
            else if(info instanceof EstacionesMete){
                EstacionesMete em = (EstacionesMete) info;
                System.out.print("ID: " + em.getID() + ", Tipo: " + em.getTipo() + ", Función: " + em.getFuncion() + ". ");
                em.Reportaje();
            }

        }
    }

    public void Agregar(){
        System.out.println("Agregar nuevo dron");
    
        System.out.print("Ingrese ID del dron: ");
        String id = sc.nextLine();

        System.out.print("Ingrese tipo del dron(Riego/Captura/Medición): ");
        String tipo = sc.nextLine();

        System.out.print("Ingrese función del dron: ");
        String funcion = sc.nextLine();

        Drones nuevoDron = new Drones(id, tipo, funcion);
        unidades.add(nuevoDron);
        System.out.println("Dron agregado");
        }
}
