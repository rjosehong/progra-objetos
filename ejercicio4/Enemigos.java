class Enemigos {
    String nombre;
    int vida;
    int ataque;

    Enemigos(String nombre, int vida, int ataque) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
    }
}

class Enemigo1 extends Enemigos {
    Enemigo1() { 
        super("Draugr", 25, 4); 
    }
}

class Enemigo2 extends Enemigos {
    Enemigo2() { 
        super("Troll", 45, 6); 
    }
}

class Jefe1 extends Enemigos {
    Jefe1() { 
        super("Hræzlyr (Jefe Draugr)", 80, 13); 
    }
}

class Jefe2 extends Enemigos {
    Jefe2() { 
        super("Berserker (Jefe Troll)", 50, 17); 
    }
}