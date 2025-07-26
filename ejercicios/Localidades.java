import java.util.Random;
public class Localidades {
    private int uno = 100;
    private int cinco = 500;
    private int diez = 1000;
    private int unoEspacio;
    private int cincoEspacio;
    private int diezEspacio;

    public Localidades(){
        Random random = new Random();
        unoEspacio = random.nextInt(20) + 1;
        cincoEspacio = random.nextInt(20) + 1;
        diezEspacio = random.nextInt(20) + 1;
    }

    public int getUnoespacio(){
        return unoEspacio;
    }
    public int getCincoespacio(){
        return cincoEspacio;
    }
    public int getDiezespacio(){
        return diezEspacio;
    }

    public int getLocalidad1(){
        return uno;
    }
    public int getLocalidad5(){
        return cinco;
    }
    public int getLocalidad10(){
        return diez;
    }
}
