class Enemigos {
    String nombre;
    int vida, ataque;

    Enemigos(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }
}

class Enemigo1 extends Enemigos {
    Enemigo1() { super("Draugr", 25, 4); }
}

class Enemigo2 extends Enemigos {
    Enemigo2() { super("Troll", 45, 6); }
}