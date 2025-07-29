import java.util.Random;
public class Numeros {
    private int numero1;
    private int numero2;
    private int numero3;

    public Numeros(){
        Random random = new Random();
        int max=1000, min=100;
        this.numero1 = random.nextInt((max-min+1)+min);
        this.numero2 = random.nextInt((max-min+1)+min);
        this.numero3 = random.nextInt((max-min+1)+min);
    }

    public int getNumero1(){
        return numero1;
    }
    public int getNumero2(){
        return numero2;
    }
    public int getNumero3(){
        return numero3;
    }
}
