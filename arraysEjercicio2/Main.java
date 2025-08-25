import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Centro_eventos c = new Centro_eventos();
        Controlador cc = new Controlador(c);

        boolean continuar = true;

        while (continuar) {
            System.out.println("\nMenú de reserva de salones");
            System.out.println("1. Crear un nuevo evento");
            System.out.println("2. Mostrar eventos asignados");
            System.out.println("3. Ver lista de espera");
            System.out.println("4. Salir del programa");
            System.out.print("Elige una opción: ");

            int opcion = 0;
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("Opción inválida.");
                scanner.nextLine();
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Encargado: ");
                    String encargado = scanner.nextLine();

                    System.out.print("Nombre del evento: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Tipo de evento (General / VIP): ");
                    String tipodeevento = scanner.nextLine();

                    System.out.print("Salón requerido (Pequeño / Mediano / Grande): ");
                    String salonrequerido = scanner.nextLine();

                    int dia = 0;
                    boolean diaValido = false;
                    do {
                        System.out.print("Día (1-31): ");
                        if (scanner.hasNextInt()) {
                            dia = scanner.nextInt();
                            scanner.nextLine();
                            if (dia >= 1 && dia <= 31) {
                                diaValido = true;
                            } else {
                                System.out.println("Día fuera de rango.");
                            }
                        } else {
                            System.out.println("Entrada inválida.");
                            scanner.nextLine();
                        }
                    } while (!diaValido);

                    int mes = 0;
                    boolean mesValido = false;
                    do {
                        System.out.print("Mes (1-12): ");
                        if (scanner.hasNextInt()) {
                            mes = scanner.nextInt();
                            scanner.nextLine();
                            if (mes >= 1 && mes <= 12) {
                                mesValido = true;
                            } else {
                                System.out.println("Mes fuera de rango.");
                            }
                        } else {
                            System.out.println("Entrada inválida.");
                            scanner.nextLine();
                        }
                    } while (!mesValido);

                    int horarioinicio = 0;
                    boolean inicioValido = false;
                    do {
                        System.out.print("Horario inicio (0-2400): ");
                        if (scanner.hasNextInt()) {
                            horarioinicio = scanner.nextInt();
                            scanner.nextLine();
                            if (horarioinicio >= 0 && horarioinicio <= 2400) {
                                inicioValido = true;
                            } else {
                                System.out.println("Horario fuera de rango.");
                            }
                        } else {
                            System.out.println("Entrada inválida.");
                            scanner.nextLine();
                        }
                    } while (!inicioValido);

                    int horariofinal = 0;
                    boolean finValido = false;
                    do {
                        System.out.print("Horario final (0-2400): ");
                        if (scanner.hasNextInt()) {
                            horariofinal = scanner.nextInt();
                            scanner.nextLine();
                            if (horariofinal >= 0 && horariofinal <= 2400) {
                                finValido = true;
                            } else {
                                System.out.println("Horario fuera de rango.");
                            }
                        } else {
                            System.out.println("Entrada inválida.");
                            scanner.nextLine();
                        }
                    } while (!finValido);

                    
                    cc.e = new Evento(encargado, nombre, tipodeevento, salonrequerido, dia, mes, horarioinicio, horariofinal);
                    cc.reservaAsignar();
                    break;

                case 2:
                    System.out.println("\nEventos de salón Pequeño(Salones: 10):");
                    System.out.println(Arrays.deepToString(c.getEventosPequenos()));

                    System.out.println("\nEventos de salón Mediano(Salones: 5):");
                    System.out.println(Arrays.deepToString(c.getEventosMedianos()));

                    System.out.println("\nEventos de salón Grande(Salones: 3):");
                    System.out.println(Arrays.deepToString(c.getEventosGrandes()));
                    break;

                case 3:
                    System.out.println("\nEventos en lista de espera:");
                    System.out.println(Arrays.deepToString(c.getListaEspera()));
                    break;

                case 4:
                    continuar = false;
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción no válida");
            }
        }

        scanner.close();
    }
}
