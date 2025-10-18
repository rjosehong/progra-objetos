import java.util.*;

public class Main {
    public static void main(String[] args) {
        Controlador c = new Controlador();
        Scanner sc = new Scanner(System.in);
        boolean muejeje=true;
        while(muejeje){
            System.out.println("Menú:\n1. Asignación Inteligente\n2. Reportes por Nómina\n3. Gestión de Conflictos\n4. Análisis de Utilización\n5. Reporte Personal"+
            "\n6. Reporte de Citas\n7. Análisis Financerio\n8. Salir del programa");
            int opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    c.Analisis_Utilización();
                    break;
                case 5:
                    System.out.println("Reporte personal\n");
                    System.out.println("Doctores Generales:");
                    c.DoctoresGenerales();
                    System.out.println("");
                    System.out.println("Cirujanos:");
                    c.Cirujano();
                    System.out.println("");
                    System.out.println("Enfermeros:");
                    c.Enfermero();
                    System.out.println("");
                    System.out.println("Radiologos:");
                    c.Radiologo();
                    System.out.println("");
                    System.out.println("Terapeutas:");
                    c.Terapeuta(); 
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Reporte de citas:");
                    c.Reporte_Citas();
                    break;
                case 7:
                    System.out.println("\nAnálisis Financiero:");
                    c.Analisis_Financiero();
                    break;
                case 8:
                    System.out.println("Adiós");
                    System.exit(0);
            }
        }
    }
}
