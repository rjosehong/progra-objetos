import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su email: ");
        String email = scanner.nextLine();
        while (!email.endsWith("@gmail.com")){
        if (email.endsWith("@gmail.com")) {
            email = scanner.nextLine();
        }
        else {
            System.out.print("El correo no es válido, debe de ser gmail");
            System.exit(0);
        }
        }
        
        System.out.print("Cuantos boletos quiere?: ");
        int cantidad_boletos = scanner.nextInt();

        System.out.print("Cual es su presupuesto?: ");
        int presupuesto = scanner.nextInt();

        Random random = new Random();
        
        int ticket = random.nextInt(15000)+1;

        int a = random.nextInt(15000)+1;
        int b = random.nextInt(15000)+1;
        System.out.println("Su ticket es: " + ticket);

        Localidades localidades = new Localidades();
        int espacioDisponible = 20 - localidades.getUnoespacio();
        int entradas_vendidas = cantidad_boletos - espacioDisponible;

        String [] localidadess = {"Localidad 1", "Localidad 5", "Localidad 10"};
        if (ticket > a && ticket < b){
            System.out.println("Su ticket es apto para comprar un boleto");
            int asignado = random.nextInt(localidadess.length);
            String Localidad_Asignada = localidadess[asignado];
            System.out.println("Se le asigno a " + Localidad_Asignada);
            switch (asignado){
            case 0:
                if(localidades.getUnoespacio() == 20){
                    System.out.println("No hay espacio suficiente para la localidad uno");
                }
                else {
                    if(localidades.getUnoespacio() + cantidad_boletos <= 20){
                        if(presupuesto >= localidades.getLocalidad1() * cantidad_boletos){
                            System.out.println("Se te vendió " + cantidad_boletos + " boletos");
                        }
                        else{
                            System.out.print("No tienes suficiente dinero, no se te vendió las entradas");
                        }
                    } else if (entradas_vendidas > 0){
                        if (presupuesto >= localidades.getLocalidad1() * entradas_vendidas){
                            System.out.print("Se te vendió " + entradas_vendidas + "de las " + cantidad_boletos + " debido a corta disponibilidad de boletos");
                        }
                        else {
                            System.out.print("No tienes suficiente dinero, no se te vendió las entradas");
                        }
                    }
                    else {
                        System.out.println("No hay espacios suficientes para venderte las entradas");
                    }
                }
            case 1: 
                if(localidades.getCincoespacio() == 20){
                    System.out.println("No hay espacio suficiente para la localidad cinco");
                }
                else {
                    if(localidades.getCincoespacio() + cantidad_boletos <= 20){
                        if(presupuesto >= localidades.getLocalidad5() * cantidad_boletos){
                            System.out.println("Se te vendió " + cantidad_boletos + " boletos");
                        }
                        else{
                            System.out.print("No tienes suficiente dinero, no se te vendió las entradas");
                        }
                    } else if (entradas_vendidas > 0){
                        if (presupuesto >= localidades.getLocalidad5() * entradas_vendidas){
                            System.out.print("Se te vendió " + entradas_vendidas + "de las " + cantidad_boletos + " debido a corta disponibilidad de boletos");
                        }
                        else {
                            System.out.print("No tienes suficiente dinero, no se te vendió las entradas");
                        }
                    }
                    else {
                        System.out.println("No hay espacios suficientes para venderte las entradas");
                    }
                }
            case 2:
                if(localidades.getDiezespacio() == 20){
                    System.out.println("No hay espacio suficiente para la localidad diez");
                }
                else {
                    if(localidades.getDiezespacio() + cantidad_boletos <= 20){
                        if(presupuesto >= localidades.getLocalidad10() * cantidad_boletos){
                            System.out.println("Se te vendió " + cantidad_boletos + " boletos");
                        }
                        else{
                            System.out.print("No tienes suficiente dinero, no se te vendió las entradas");
                        }
                    } else if (entradas_vendidas > 0){
                        if (presupuesto >= localidades.getLocalidad10() * entradas_vendidas){
                            System.out.print("Se te vendió " + entradas_vendidas + "de las " + cantidad_boletos + " debido a corta disponibilidad de boletos");
                        }
                        else {
                            System.out.println("No tienes suficiente dinero, no se te vendió las entradas");
                        }
                    }
                    else {
                        System.out.println("No hay espacios suficientes para venderte las entradas");
                    }
                }
            }
        }
        else {
            System.out.println("Su ticket no es apto para comprar un boleto");
        }
    }
}
