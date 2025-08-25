import java.util.Random;
public class Centro_eventos {
    private int Salones_pequenos = 10;
    private int Salones_medianos = 5;
    private int Salones_grandes = 3;

    Random random = new Random();
    private int id_salon = random.nextInt(50);
    private int capacidad_pequenos = 50;
    private int capacidad_mediano = 100;
    private int capacidad_grande = 250;

    private int costo_pequeno = 499;
    private int costo_mediano = 1199;
    private int costo_grande = 2499;

    private Object[][] eventosPequenos = new Object[Salones_pequenos][];
    private Object[][] eventosMedianos = new Object[Salones_medianos][];
    private Object[][] eventosGrandes = new Object[Salones_grandes][];
    private Object[][] listaEspera = new Object[10][];

    public int getID() {
        return id_salon;
    }
    public int getCapP() {
        return capacidad_pequenos;
    }
    public int getCapM() {
        return capacidad_mediano;
    }
    public int getCapG() {
        return capacidad_grande;
    }
    public int getCosP() {
        return costo_pequeno;
    }
    public int getCosM() {
        return costo_mediano;
    }
    public int getCosG() {
        return costo_grande;
    }

    public int getSalonP() {
        return Salones_pequenos;
    }
    public int getSalonM() {
        return Salones_medianos;
    }
    public int getSalonG() {
        return Salones_grandes;
    }

    public boolean reservarEvento(Object[] evento) {
        String salon = (String) evento[3];
        if (salon.equals("Pequeño")) {
            for (int i = 0; i < eventosPequenos.length; i++) {
                if (eventosPequenos[i] == null) {
                    eventosPequenos[i] = evento;
                    return true;
                }
            }
        } else if (salon.equals("Mediano")) {
            for (int i = 0; i < eventosMedianos.length; i++) {
                if (eventosMedianos[i] == null) {
                    eventosMedianos[i] = evento;
                    return true;
                }
            }
        } else if (salon.equals("Grande")) {
            for (int i = 0; i < eventosGrandes.length; i++) {
                if (eventosGrandes[i] == null) {
                    eventosGrandes[i] = evento;
                    return true;
                }
            }
        }

        for (int i = 0; i < listaEspera.length; i++) {
            if (listaEspera[i] == null) {
                listaEspera[i] = evento;
                return false;
            }
        }

        return false;
    }

    public Object[][] getEventosPequenos() {
        return eventosPequenos; }
    public Object[][] getEventosMedianos() { return eventosMedianos;
    }
    public Object[][] getEventosGrandes() {
        return eventosGrandes;
    }
    public Object[][] getListaEspera() {
        return listaEspera;
    }
}