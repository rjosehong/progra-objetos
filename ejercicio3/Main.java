import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Controlador cc = new Controlador();
        Gimnasio gym = new Gimnasio();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.print("¿Quiere ingresar nuevos datos? (si/no): ");
            String opcion = sc.nextLine();
            if(opcion.equals("si")){
                cc.arrayRutina();
                cc.arrayDatos();
            }
            else {
                break;
            }
        }
        cc.mostrarDataGeneral();
        cc.rutinasActivas();
        cc.numEntrenadores();
        cc.numRutinas();

    }
}
