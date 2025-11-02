import java.util.*;
public class Main {
    public static void main(String[] args) {
        Controlador c = new Controlador();
        Scanner sc = new Scanner(System.in);
        int uno = 1;
        while(uno==1){
            System.out.println("Menú\n1. Mostrar Unidades\n2. Agregar Unidades\n3. Salir del programa");
            System.out.print("Elija una opción: ");
            int opcion = sc.nextInt();
            switch(opcion){
                case 1:
                c.Mostrar();
                break;
                case 2:
                c.Agregar();
                break;
                case 3:
                System.exit(0);
            }
        }
    }
}
