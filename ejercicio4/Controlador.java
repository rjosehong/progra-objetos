import java.util.*;

class Controlador {
    Guerrero g = new Guerrero();
    Explorador e = new Explorador();
    Scanner sc = new Scanner(System.in);
    Random rnd = new Random();

    public void Juego() {
        System.out.print("¿Cuántos jugadores van a jugar (1 o 2)? ");
        int jugadores = sc.nextInt();
        if (jugadores < 1 || jugadores > 2) {
            System.out.println("Ingrese un número de jugadores válido");
            return;
        }

        ArrayList<Personajes> players = new ArrayList<>();
        if (jugadores == 1) players.add(g);
        else {
            players.add(g);
            players.add(e);
        }

        ArrayList<Items> pool = generarPoolItems();
        repartirItems(players, pool);

        ArrayList<Enemigos> enemigos = new ArrayList<>();
        enemigos.add(new Enemigo1());
        enemigos.add(new Enemigo2());
        enemigos.add(new Jefe1());
        enemigos.add(new Jefe2());

        System.out.println("\n=== Jugadores ===");
        for (Personajes p : players) {
            System.out.println(p.getClass().getSimpleName() + " HP:" + p.vida + " ATK:" + p.ataque);
        }

        System.out.println("\n=== Enemigos ===");
        for (Enemigos en : enemigos) {
            System.out.println(en.nombre + " HP:" + en.vida + " ATK:" + en.ataque);
        }

        batalla(players, enemigos);
    }

    void batalla(ArrayList<Personajes> players, ArrayList<Enemigos> enemigos) {
        System.out.println("\n=== COMIENZA LA BATALLA ===");

        while (hayVivos(players) && hayVivos(enemigos)) {
            System.out.println("\n--- Nuevo Turno ---");

            for (Personajes p : players) {
                if (p.vida > 0) {
                    turnoJugador(p, enemigos);
                }
            }

            if (hayVivos(enemigos)) {
                for (Enemigos e : enemigos) {
                    if (e.vida > 0) {
                        turnoEnemigo(e, players);
                    }
                }
            }

            System.out.println("\nEstado actual:");
            for (Personajes p : players) {
                System.out.println(p.getClass().getSimpleName() + " HP:" + p.vida);
            }
            for (Enemigos e : enemigos) {
                System.out.println(e.nombre + " HP:" + e.vida);
            }
        }

        if (hayVivos(players)) System.out.println("\nGanaste");
        else System.out.println("\nPerdiste");
    }

    void turnoJugador(Personajes p, ArrayList<Enemigos> enemigos) {
        System.out.println("\nTurno de " + p.getClass().getSimpleName() + " (HP:" + p.vida + ")");
        System.out.println("1) Atacar  2) Usar ítem  3) Pasar");
        int op = sc.nextInt();
        if (op == 1) {
            mostrarEnemigos(enemigos);
            System.out.print("Elige enemigo: ");
            int ene = sc.nextInt();
            if (ene >= 0 && ene < enemigos.size() && enemigos.get(ene).vida > 0) {
                Enemigos enemigo = enemigos.get(ene);
                int dmg = 1 + rnd.nextInt(p.ataque);
                enemigo.vida -= dmg;
                System.out.println(p.getClass().getSimpleName() + " ataca a " + enemigo.nombre + " causando " + dmg);
                if (enemigo.vida <= 0) System.out.println(enemigo.nombre + " ha muerto");
            }
        } else if (op == 2 && !p.inventario.isEmpty()) {
            for (int i = 0; i < p.inventario.size(); i++) {
                System.out.println(i + ") " + p.inventario.get(i).nombre + " - " + p.inventario.get(i).efecto);
            }
            System.out.print("Elige ítem: ");
            int it = sc.nextInt();
            if (it >= 0 && it < p.inventario.size()) {
                Items elegido = p.inventario.remove(it);
                elegido.usar(p);
            }
        } else {
            System.out.println(p.getClass().getSimpleName() + " pasa turno.");
        }
    }

    void turnoEnemigo(Enemigos e, ArrayList<Personajes> players) {
        Personajes objetivo = players.get(rnd.nextInt(players.size()));
        while (objetivo.vida <= 0) objetivo = players.get(rnd.nextInt(players.size()));
        int dmg = 1 + rnd.nextInt(e.ataque);

        if (e instanceof Enemigo1) {
            if (rnd.nextInt(100) < 20) {
                System.out.println(e.nombre + " envenena a " + objetivo.getClass().getSimpleName());
                objetivo.vida -= 2;
            } else {
                atacar(e, objetivo, dmg);
            }
        } else if (e instanceof Enemigo2) {
            if (rnd.nextInt(100) < 20) {
                System.out.println(e.nombre + " aturde a " + objetivo.getClass().getSimpleName() + "!");
            } else {
                atacar(e, objetivo, dmg);
            }
        } else if (e instanceof Jefe1) {
            if (rnd.nextInt(100) < 30) {
                System.out.println(e.nombre + " lanza veneno poderoso a " + objetivo.getClass().getSimpleName());
                objetivo.vida -= 5;
            } else {
                e.vida += 5;
                System.out.println(e.nombre + " se cura 5 de vida!");
            }
        } else if (e instanceof Jefe2) {
            if (rnd.nextInt(100) < 30) {
                dmg += 5;
                atacar(e, objetivo, dmg);
            } else {
                atacar(e, objetivo, dmg);
            }
        }
    }

    void atacar(Enemigos e, Personajes objetivo, int dmg) {
        objetivo.vida -= dmg;
        System.out.println(e.nombre + " ataca a " + objetivo.getClass().getSimpleName() + " causando " + dmg);
        if (objetivo.vida <= 0) System.out.println(objetivo.getClass().getSimpleName() + " ha muerto");
    }

    boolean hayVivos(ArrayList<?> lista) {
        for (Object o : lista) {
            if (o instanceof Personajes) {
                if (((Personajes) o).vida > 0) return true;
            } else if (o instanceof Enemigos) {
                if (((Enemigos) o).vida > 0) return true;
            }
        }
        return false;
    }

    void mostrarEnemigos(ArrayList<Enemigos> enemigos) {
        for (int i = 0; i < enemigos.size(); i++) {
            Enemigos e = enemigos.get(i);
            System.out.println(i + ") " + e.nombre + " HP:" + e.vida);
        }
    }

    ArrayList<Items> generarPoolItems() {
        ArrayList<Items> pool = new ArrayList<>();
        pool.add(new Item1());
        pool.add(new Item2());
        pool.add(new Item3());
        pool.add(new Item4());
        return pool;
    }

    void repartirItems(ArrayList<Personajes> players, ArrayList<Items> pool) {
        Collections.shuffle(pool);
        for (Personajes p : players) {
            for (int i = 0; i < p.capacidad_items && !pool.isEmpty(); i++) {
                p.inventario.add(pool.remove(0));
            }
        }
    }
}