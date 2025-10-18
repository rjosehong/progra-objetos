import java.util.*;
public class Controlador {
    List<PersonalMedico> Directorio = new ArrayList<>();
    ArrayList<String> equipo = new ArrayList<>();
    List<Citas> CitasMedicas = new ArrayList<>();

    int totalDM=0;
    int totalEnf=0;
    int totalDP=0;
    
    public Controlador() {
        equipo.add("RayosX");
        equipo.add("Tomografía");
        equipo.add("Ultrasonido");
        
        Directorio.add(new DoctorGeneral("001", "Sofía Hernández López", "Dirección Médica", 4, 1000, "Pediatría", 1, 100, 2));
        Directorio.add(new DoctorGeneral("002", "Mateo García Torres", "Dirección Médica", 20, 1000, "Ginecología", 1, 200, 2));
        Directorio.add(new DoctorGeneral("003", "Valentina Morales Díaz", "Dirección Médica", 17, 1000, "Oncología", 1, 150, 2));
        Directorio.add(new Cirujano("004", "Santiago Pérez Castillo", "Dirección Médica", 33, 2000, "Apendicectomía", 3, 100, 50));
        Directorio.add(new Cirujano("005", "Isabella Ramírez Soto", "Dirección Médica", 17, 1000, "Hernioplastía", 3, 100, 50));
        Directorio.add(new Cirujano("006", "Leonardo Vargas Herrera", "Dirección Médica", 5, 1000, "Colecistectomía", 3, 100, 50));
        Directorio.add(new Enfermero("007", "Camila Cruz Mendoza", "Enfermeria", 7, 3000, "Diurno", "MSN"));
        Directorio.add(new Enfermero("008", "Emiliano Rojas Martínez", "Enfermeria", 9, 3000, "Nocturno", "MSN"));
        Directorio.add(new Enfermero("009", "Mariana Flores Gutiérrez", "Enfermeria", 11, 3000, "Diurno", "MSN"));
        Directorio.add(new Radiologo("010", "Alejandro Ortiz Navarro", "Dirección Médica", 13, 1500, equipo, 100));
        Directorio.add(new Radiologo("011", "Renata Castillo Jiménez", "Dirección Médica", 15, 1500, equipo, 100));
        Directorio.add(new Radiologo("012", "Nicolás Reyes Salazar", "Dirección Médica", 17, 1600, equipo, 100));
        Directorio.add(new Terapeuta("013", "Lucía Romero Aguilar", "Dirección Psicologica", 20, 1000, "Psicoanalítica", 1, 2, 75));
        Directorio.add(new Terapeuta("014", "Diego Fernández Pineda", "Dirección Psicologica", 25, 1000, "Humanista", 1, 2, 100));
        Directorio.add(new Terapeuta("015", "Victoria Herrera Domínguez", "Dirección Psicologica", 27, 1000, "Gestalt", 1, 3, 75));

        CitasMedicas.add(new Citas("Sofía Hernández López", "0001", "Maria Marta", 17, 1600, "Consulta General", "PROGRAMADA"));
        CitasMedicas.add(new Citas("Sofía Hernández López", "0002", "Carlos Juárez", 17, 1000, "Consulta General", "PROGRAMADA"));
        CitasMedicas.add(new Citas("Mateo García Torres", "0003", "Ana López", 17, 1100, "Consulta General", "EN PROGRESO"));
        CitasMedicas.add(new Citas("Mateo García Torres", "0004", "Luis Fernández", 18, 930, "Consulta General", "PROGRAMADA"));
        CitasMedicas.add(new Citas("Valentina Morales Díaz", "0005", "Sergio Herrera", 18, 1030, "Consulta General", "PROGRAMADA"));
        CitasMedicas.add(new Citas("Valentina Morales Díaz", "0006", "Laura Gómez", 19, 1500, "Consulta General", "PROGRAMADA"));
        CitasMedicas.add(new Citas("Santiago Pérez Castillo", "0007", "Jorge Ramírez", 17, 800, "Cirugía", "PROGRAMADA"));
        CitasMedicas.add(new Citas("Isabella Ramírez Soto", "0008", "Lucía Pérez", 18, 700, "Cirugía", "CONFIRMADA"));
        CitasMedicas.add(new Citas("Leonardo Vargas Herrera", "0009", "Pedro Castillo", 18, 1200, "Cirugía", "EN_PROGRESO"));
        CitasMedicas.add(new Citas("Camila Cruz Mendoza", "0010", "Marta Hernández", 17, 1300, "Diagnóstico", "PROGRAMADA"));
        CitasMedicas.add(new Citas("Emiliano Rojas Martínez", "0011", "Ricardo Soto", 17, 1400, "Diagnóstico", "PROGRAMADA"));
        CitasMedicas.add(new Citas("Mariana Flores Gutiérrez", "0012", "Andrea Morales", 19, 1000, "Diagnóstico", "PROGRAMADA"));
        CitasMedicas.add(new Citas("Alejandro Ortiz Navarro", "0013", "Gabriela Ruiz", 17, 900, "Diagnóstico", "PROGRAMADA"));
        CitasMedicas.add(new Citas("Renata Castillo Jiménez", "0014", "David Cabrera", 17, 1030, "Diagnóstico", "EN PROGRESO"));
        CitasMedicas.add(new Citas("Nicolás Reyes Salazar", "0015", "Patricia Díaz", 18, 1100, "Diagnóstico", "PROGRAMADA"));
        CitasMedicas.add(new Citas("Lucía Romero Aguilar", "0016", "Camilo Vargas", 17, 1500, "Terapia", "PROGRAMADA"));
        CitasMedicas.add(new Citas("Diego Fernández Pineda", "0017", "Daniela Soto", 18, 1600, "Terapia", "PROGRAMADA"));
        CitasMedicas.add(new Citas("Victoria Herrera Domínguez", "0018", "José Pérez", 19, 900, "Terapia", "EN PROGRESO"));
        CitasMedicas.add(new Citas("Victoria Herrera Domínguez", "0019", "Rosa Castillo", 19, 1100, "Terapia", "PROGRAMADA"));
    }
    
    public int DoctoresGenerales(){

        for(PersonalMedico pm : Directorio) {
            if(pm instanceof DoctorGeneral) {
                DoctorGeneral dg = (DoctorGeneral) pm;
                PersonalMedico personalM = (PersonalMedico) pm;
                int salarioDG = personalM.getSalarioBase()+(dg.getNoConsultas()*dg.getTarifa_consulta());
                System.out.println("ID: " + personalM.getID() +" // Nombre: " + personalM.getNombre() + " // Departamento: " + personalM.getDepart() + 
                " // Años de experiencia: " + personalM.getAñosExp() + " // Salario Base ($): " + personalM.getSalarioBase() + " // Especiaización: " + dg.getEspecializacion() + 
                " // Capacidad de pacientes: " + dg.getCapacidad_pacientes() + "\n// Tarifa por consulta: " + dg.getTarifa_consulta() + " // No. Consultas: " + dg.getNoConsultas() +
                " // Salario Total($): " + salarioDG);
                totalDM += salarioDG;
            }
            
        }
        return totalDM;
    }

    public int Cirujano(){
        for(PersonalMedico pm : Directorio) {
            if(pm instanceof Cirujano) {
                Cirujano cj = (Cirujano) pm;
                PersonalMedico personalM = (PersonalMedico) pm;
                int SalarioCJ=personalM.getSalarioBase() + (cj.getHoras_cirugia()*cj.getTarifa_hora()) + cj.getBono_riesgo();
                System.out.println("ID: " + personalM.getID() +" // Nombre: " + personalM.getNombre() + " // Departamento: " + personalM.getDepart() + 
                " // Años de experiencia: " + personalM.getAñosExp() + " // Salario Base ($): " + personalM.getSalarioBase() + " // Operaciones: " + cj.getOperaciones() + 
                "\n// Horas de cirugía: " + cj.getHoras_cirugia() + " // Bono de riesgo: " + cj.getBono_riesgo() + " // Tarifa por hora: " + cj.getTarifa_hora() +
                " // Salario Total($): " + SalarioCJ);
                totalDM += SalarioCJ;
            }
        }
        return totalDM;
    }

    public int Enfermero(){
        for(PersonalMedico pm : Directorio) {
            if(pm instanceof Enfermero) {
                Enfermero ef = (Enfermero) pm;
                PersonalMedico personalM = (PersonalMedico) pm;
                int salarioEF;
                if (ef.getTipo_turno().equalsIgnoreCase("diurno")){
                    salarioEF = personalM.getSalarioBase() + 1000;
                }
                else {
                    salarioEF = personalM.getSalarioBase();
                }
                System.out.println("ID: " + personalM.getID() +" // Nombre: " + personalM.getNombre() + " // Departamento: " + personalM.getDepart() + 
                " // Años de experiencia: " + personalM.getAñosExp() + " // Salario Base ($): " + personalM.getSalarioBase() + "\n// Turno: " + ef.getTipo_turno() + 
                " // Nivel de certificación: " + ef.getNivel_certificacion() + " // Salario Total($): " + salarioEF);
                totalEnf += salarioEF;
            }
        }
        return totalEnf;
    }

    public int Radiologo(){
        for(PersonalMedico pm : Directorio) {
            if(pm instanceof Radiologo) {
                Radiologo rd = (Radiologo) pm;
                PersonalMedico personalM = (PersonalMedico) pm;
                int salarioRD = personalM.getSalarioBase() + rd.getTarifa_estudio();
                System.out.println("ID: " + personalM.getID() +" // Nombre: " + personalM.getNombre() + " // Departamento: " + personalM.getDepart() + 
                " // Años de experiencia: " + personalM.getAñosExp() + " // Salario Base ($): " + personalM.getSalarioBase() + " // Equipo usado: " + rd.getEquipo_usado() + 
                "\n// Tarifa por estudio: " + rd.getTarifa_estudio() + " // Salario Total($): " + salarioRD);
                totalDM += salarioRD;
            }
        }
        return totalDM;
    }

    public int Terapeuta(){
        for(PersonalMedico pm : Directorio) {
            if(pm instanceof Terapeuta) {
                Terapeuta tp = (Terapeuta) pm;
                PersonalMedico personalM = (PersonalMedico) pm;
                int salarioTP = personalM.getSalarioBase() + (tp.getNo_sesiones() * tp.getPrecio_sesion());
                System.out.println("ID: " + personalM.getID() +" // Nombre: " + personalM.getNombre() + " // Departamento: " + personalM.getDepart() + 
                " // Años de experiencia: " + personalM.getAñosExp() + " // Salario Base ($): " + personalM.getSalarioBase() + " // Tipo de terapia: " + tp.getTipo_terapia()
                + " // Duracion de una sesión: " + tp.getDuracion_sesion() + " // No. de sesiones: " + tp.getNo_sesiones() + " // Precio por sesión: " + tp.getPrecio_sesion()
                + " // Salario total($): " + salarioTP);
                totalDP += salarioTP;
            }
        }
        return totalDP;
    }

    public void Analisis_Financiero(){
        DoctoresGenerales();
        Cirujano();
        Enfermero();
        Radiologo();
        Terapeuta();
        System.out.println("La nómina total para el departamento de dirección médica es de: $" + totalDM);
        System.out.println("La nómina total para el departamento de enfermeria es de: $" + totalEnf);
        System.out.println("La nómina total para el departamento de dirección psicologica es de : $" + totalDP);
    }

    public void Analisis_Utilización(){
        System.out.println("Hay un total de 15 empleados");
    }
    
    public void Reporte_Citas(){
        boolean encontrado = false;
        for(Citas ct : CitasMedicas) {
            Scanner sc = new Scanner(System.in);
            System.out.println("¿Por que tipo de cita quiere buscar?(PROGRAMADA, CONFIRMADA, EN_PROGRESO, COMPLETADA, CANCELADA, REAGENDADA");
            String tipo_citaopcion = sc.nextLine();
            if(ct.getEstado_actual().equalsIgnoreCase(tipo_citaopcion)){
                System.out.println("Nombre de Doc.: " + ct.getNombre() + " // ID Cita: " + ct.getId_cita() + " // Nombre de paciente: " + ct.getNombre_paciente() + " // Fecha: " + ct.getFecha() + 
                " // Hora: " + ct.getHora() + "\n// Tipo de cita: " + ct.getTipo_cita() + " // Estado actual: " + ct.getEstado_actual());
                encontrado = true;
            }
            else {
                System.out.println("No hay citas con esos parametros");
            }
            
        }
    }
}