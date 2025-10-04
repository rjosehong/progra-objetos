public class Main {
    public static void main(String[] args) {
        Controlador c = new Controlador();

        c.registrarProceso(new Procesocpu(1, "Compilador"));
        c.registrarProceso(new ProcesoIo(2, "Lector Disco"));
        c.registrarProceso(new Daemon(3, "Monitor del sistema"));

        c.registrarProceso(new Calcu(4, "Calculadora"));
        c.registrarProceso(new Internet(5, "Navegador Web"));
        c.registrarProceso(new Music(6, "Reproductor de Música"));

        c.ejecutarProcesos();

        // Ejemplo de overloading en la calculadora
        Calcu calc = new Calcu(7, "MiniCalc");
        System.out.println("Resultado int: " + calc.calcular(5, 3));
        System.out.println("Resultado double: " + calc.calcular(2.5, 4.3));
    }
}