public class Calcu extends Proceso {
    public Calcu(int id, String nombre) {
        super(id, nombre);
    }

    @Override
    public void ejecutar() {
        System.out.println(getNombre() + " está sumando números xd");
    }

    public int calcular(int a, int b) {
        return a + b;
    }

    public double calcular(double a, double b) {
        return a + b;
    }
}