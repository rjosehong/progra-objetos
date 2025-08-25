public class Evento {
    private String encargado;
    private String nombre;
    private String tipodeevento;
    private String salonrequerido;
    private int dia;
    private int mes;
    private int horarioinicio;
    private int horariofinal;

    public Evento(){

    }

    public Evento(String encargado, String nombre, String tipodeevento, String salonrequerido, int dia, int mes, int horarioinicio, int horariofinal) {
        this.encargado = encargado;
        this.nombre = nombre;
        this.tipodeevento = tipodeevento;
        this.salonrequerido = salonrequerido;
        this.dia = dia;
        this.mes = mes;
        this.horarioinicio = horarioinicio;
        this.horariofinal = horariofinal;
}

    public String getEncargado(){
        return encargado;
    }
    public String getNombre(){
        return nombre;
    }
    public String getTipodeevento(){
        return tipodeevento;
    }
    public String getSalonrequerido(){
        return salonrequerido;
    }
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getHorarioinicio(){
        return horarioinicio;
    }
    public int getHorariofinal(){
        return horariofinal;
    }
    
    private Object[] eventoPequeño;
    private Object[] eventoMediano;
    private Object[] eventoGrande;

    public Object[] asignarSalon(){
        if (salonrequerido.contains("Pequeño")){
        Object[] eventoPequeño = new Object[]{encargado, nombre, tipodeevento, salonrequerido, dia, mes, horarioinicio, horariofinal};
        return eventoPequeño;
        }
        else if(salonrequerido.contains("Mediano")){
        Object[] eventoMediano = new Object[]{encargado, nombre, tipodeevento, salonrequerido, dia, mes, horarioinicio, horariofinal};
        return eventoMediano;
        }
        else if(salonrequerido.contains("Grande")){
        Object[] eventoGrande = new Object[]{encargado, nombre, tipodeevento, salonrequerido, dia, mes, horarioinicio, horariofinal};
        return eventoGrande;  
        }
        else{
        return null;
        }   
    }
    public Object[] getEP(){
        return eventoPequeño;
    }
    public Object[] getEM(){
        return eventoMediano;
    }
    public Object[] getEG(){
        return eventoGrande;
    }
}
