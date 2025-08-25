public class Controlador {
    public Centro_eventos c;
    public Evento e;

    public Controlador(Centro_eventos centro) {
        this.c = centro;
    }

    public Object[] asignarSalonP() {
        Object[] salonPequeno = new Object[]{c.getID(), c.getCapP(), c.getCosP(), "General", e.getEP()};
        return salonPequeno;
    }

    public Object[] asignarSalonM() {
        Object[] salonMediano = new Object[]{c.getID(), c.getCapM(), c.getCosM(), "General", e.getEM()};
        return salonMediano;
    }

    public Object[] asignarSalonG() {
        Object[] salonGrande = new Object[]{c.getID(), c.getCapG(), c.getCosG(), "VIP", e.getEG()};
        return salonGrande;
    }

    public Object[] asignarAReserva() {
        if (e.getSalonrequerido().contains("Pequeño")) {
            return new Object[]{e.getEP()};
        } else if (e.getSalonrequerido().contains("Mediano")) {
            return new Object[]{e.getEM()};
        } else if (e.getSalonrequerido().contains("Grande")) {
            return new Object[]{e.getEG()};
        } else {
            return null;
        }
    }

    public void reservaAsignar() {
    Object[] eventoArray = e.asignarSalon();
    boolean asignado = c.reservarEvento(eventoArray);

    if (asignado) {
        System.out.println("Tu evento ha sido asignado a un salón.");
    } 
    else {
        System.out.println("No hay salones disponibles, tu evento ha sido puesto en la lista de espera.");
    }
}
}
