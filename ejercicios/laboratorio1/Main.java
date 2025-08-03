import java.util.Random;
import java.util.Scanner;

public class Main {
    static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Controlador controlador = new Controlador();
        boolean[] usados = new boolean[8];


        Pokemon[] pokemonsJugador1 = new Pokemon[4];
        Pokemon[] pokemonsJugador2 = new Pokemon[4];

        System.out.println("selecciona un Pokemon");
        for (int i = 0; i < 4; i++) {
            pokemonsJugador1[i] = seleccionarPokemon(scanner, controlador, usados, "Jugador 1");
            pokemonsJugador2[i] = seleccionarPokemon(scanner, controlador, usados, "Jugador 2");
        }

        System.out.println("\nRonda");
        int puntosJ1 = 0, puntosJ2 = 0;

        for (int i = 0; i < 4; i++) {
            System.out.println("\nRonda " + (i + 1));
            int resultado = pelear(pokemonsJugador1[i], pokemonsJugador2[i]);
            if (resultado == 1) puntosJ1++;
            else if (resultado == 2) puntosJ2++;
        }

        System.out.println("\nResultados");
        if (puntosJ1 > puntosJ2) System.out.println("jugador 1 gana");
        else if (puntosJ2 > puntosJ1) System.out.println("jugador 2 gana");
        else System.out.println("empate");
    }

    public static Pokemon seleccionarPokemon(Scanner scanner, Controlador controlador, boolean[] usados, String jugador) {
        while (true) {
            System.out.print(jugador + ", elige un Pokémon (1-8): ");
            int seleccion = Integer.parseInt(scanner.nextLine());
            if (seleccion < 1 || seleccion > 8 || usados[seleccion - 1]) {
                System.out.println("elige otro pokemon");
            } else {
                usados[seleccion - 1] = true;
                return obtenerPokemonPorNumero(seleccion, controlador);
            }
        }
    }

    public static Pokemon obtenerPokemonPorNumero(int num, Controlador c) {
        switch (num) {
            case 1: return c.getPokemon1();
            case 2: return c.getPokemon2();
            case 3: return c.getPokemon3();
            case 4: return c.getPokemon4();
            case 5: return c.getPokemon5();
            case 6: return c.getPokemon6();
            case 7: return c.getPokemon7();
            case 8: return c.getPokemon8();
            default: return null;
        }
    }

    public static int pelear(Pokemon p1, Pokemon p2) {
        int ataque1 = p1.getAtaque();
        int ataque2 = p2.getAtaque();

        int defensa1 = p1.getDefensa();
        int defensa2 = p2.getDefensa();

        ataque1 += aplicarHabilidad(p1.getHE(), true);
        ataque2 += aplicarHabilidad(p2.getHE(), true);

        ataque2 -= aplicarHabilidad(p1.getHE(), false);
        ataque1 -= aplicarHabilidad(p2.getHE(), false);

        ataque1 += tipoModificador(p1.getTipo(), p2.getTipo());
        ataque2 += tipoModificador(p2.getTipo(), p1.getTipo());

        System.out.println(p1.getNombre() + " (ataque: " + ataque1 + ")");
        System.out.println(p2.getNombre() + " (ataque: " + ataque2 + ")");

        if (ataque1 > ataque2) {
            System.out.println(p1.getNombre() + " gana la ronda");
            return 1;
        } else if (ataque2 > ataque1) {
            System.out.println(p2.getNombre() + " gana la ronda");
            return 2;
        } else {
            System.out.println("empate");
            return 0;
        }
    }

    public static int aplicarHabilidad(Habilidades h, boolean esPropio) {
        int chance = random.nextInt(101);
        if (chance <= h.getProbabilidad()) {
            switch (h.getHEfecto()) {
                case "Daña": return esPropio ? 15 : 0;
                case "Defensa": return 0;
                case "Aumenta": return esPropio ? 0 : 10;
            }
        }
        return 0;
    }

    public static int tipoModificador(String atacante, String defensor) {
        if ((atacante.equals("Fuego") && defensor.equals("Planta")) ||
            (atacante.equals("Planta") && defensor.equals("Agua")) ||
            (atacante.equals("Agua") && defensor.equals("Fuego")) ||
            (atacante.equals("Eléctrico") && defensor.equals("Agua"))) return 20;

        if ((atacante.equals("Fuego") && defensor.equals("Agua")) ||
            (atacante.equals("Agua") && defensor.equals("Planta")) ||
            (atacante.equals("Planta") && defensor.equals("Fuego"))) return -10;

        return 0;
    }
}
