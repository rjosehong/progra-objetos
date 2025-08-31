import java.util.Scanner;
public class Controlador {
    Scanner sc = new Scanner(System.in);
    Gimnasio gym = new Gimnasio();
    public void arrayRutina(){
        System.out.print("Ingrese el id de su rutina: ");
        int idrutina = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese el nombre de su rutina (Cardio/Piernas/Brazo/Espalda): ");
        String nombrerutina = sc.nextLine();
        System.out.print("Ingrese si su rutina es activa o no (true/false): ");
        boolean activarutina = sc.nextBoolean();
        sc.nextLine();
        gym.addRutinas(idrutina, nombrerutina, activarutina);
        System.out.println("Rutina agregada correctamente");
    }
    public void arrayDatos(){
        System.out.print("Ingresa tu nombre: ");
        String nombredatos = sc.nextLine();
        System.out.print("Ingrese el nombre de su entrenador(Tito/Paula/Joaquin/Abril): ");
        String entrenadordatos = sc.nextLine();
        System.out.print("Ingrese su tipo de membresia (General/Plus):");
        String tipomembresiadatos = sc.nextLine();
        Rutinas rutinass = gym.getRutinas().get(gym.getRutinas().size() - 1);
        gym.addDatos(nombredatos, entrenadordatos, tipomembresiadatos, rutinass);
        System.out.println("Datos agregados correctamente");
    }
    
    public void mostrarDataGeneral(){
        if (gym.getDatos().isEmpty()) {
            
        } else {
            for(Datos r : gym.getDatos()){
                System.out.println(r);
            }

        }
    }

    public void rutinasActivas(){
        int activas = 0;

        for (Datos d : gym.getDatos()) {
        if (d.getRutinass().isActiva()) {
            activas++;
            }
        }

        System.out.println("Número de rutinas activas: " + activas);
    }

    public void numEntrenadores(){
        int entrenadorTito = 0;
        int entrenadorPaula = 0;
        int entrenadorJoaquin = 0;
        int entrenadorAbril = 0;
        for (Datos d : gym.getDatos()){
            if (d.getEntrenadores().equalsIgnoreCase("Tito")){
                entrenadorTito++;
            }
            else if (d.getEntrenadores().equalsIgnoreCase("Paula")) {
                entrenadorPaula++;
            }
            else if (d.getEntrenadores().equalsIgnoreCase("Joaquin")) {
                entrenadorJoaquin++;
            }
            else if (d.getEntrenadores().equalsIgnoreCase("Abril")){
                entrenadorAbril++;
            }
            else {

            }
        }
        if (entrenadorTito>entrenadorPaula && entrenadorTito>entrenadorJoaquin && entrenadorTito>entrenadorAbril) {
            System.out.println("El entrenador con mayor número de alumnos es Tito con " + entrenadorTito + " alumnos");
        }
        else if (entrenadorPaula>entrenadorTito && entrenadorPaula>entrenadorJoaquin && entrenadorPaula>entrenadorAbril) {
            System.out.println("El entrenador con mayor número de alumnos es Paula con " + entrenadorPaula + " alumnos");
        }
        else if (entrenadorJoaquin>entrenadorTito && entrenadorJoaquin>entrenadorPaula && entrenadorJoaquin>entrenadorAbril){
            System.out.println("El entrenador con mayor número de alumnos es Joaquín con " + entrenadorJoaquin + " alumnos");
        }
        else if (entrenadorAbril>entrenadorTito && entrenadorAbril>entrenadorPaula && entrenadorAbril>entrenadorJoaquin) {
            System.out.println("El entrenador con mayor número de alumnos es Abril con " + entrenadorAbril + " alumnos");
        }
        else {
            System.out.println("Varios entrenadores tienen el mayor número de alumnos");
        }
    }

    public void numRutinas(){
        int cardiocount = 0;
        int piernacount = 0;
        int brazocount = 0;
        int espaldacount = 0;
        for (Rutinas rr : gym.getRutinas()) {
            if (rr.getNombre().equalsIgnoreCase("Cardio")) {
                cardiocount++;
            }
            else if (rr.getNombre().equalsIgnoreCase("Pierna")) {
                piernacount++;
            }
            else if (rr.getNombre().equalsIgnoreCase("Brazo")) {
                brazocount++;
            }
            else if (rr.getNombre().equalsIgnoreCase("Espalda")) {
                espaldacount++;
            }
            else {
                
            }
        }
        if (cardiocount>piernacount && cardiocount>brazocount && cardiocount>espaldacount) {
            System.out.println("La rutina que más se práctica es Cardio con " + cardiocount + " que la práctican");
        }
        else if (piernacount>cardiocount && piernacount>brazocount && piernacount>espaldacount) {
            System.out.println("La rutina que más se práctica es Pierna con " + piernacount + " que la práctican");
        }
        else if (brazocount>cardiocount && brazocount>piernacount && brazocount>espaldacount){
            System.out.println("La rutina que más se práctica es Brazo con " + brazocount + " que la práctican");
        }
        else if (espaldacount>cardiocount && espaldacount>piernacount && espaldacount>brazocount) {
            System.out.println("La rutina que más se práctica es Espalda con " + espaldacount + " que la práctican");
        }
        else {
            System.out.println("Hay varias rutinas con mismo mayor número de prácticantes");
        }
    }

}