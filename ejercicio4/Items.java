class Items {
    String nombre, efecto;
    Items(String nombre, String efecto) { this.nombre = nombre; this.efecto = efecto; }
    void usar(Personajes p) {
        if (this instanceof Item1) {
            p.vida += 25;
            System.out.println(p.getClass().getSimpleName() + " usa poción y cura 25 HP");
        } else if (this instanceof Item2) {
            System.out.println(p.getClass().getSimpleName() + " usa Clones (chance de esquivar)");
        } else if (this instanceof Item3) {
            System.out.println(p.getClass().getSimpleName() + " activa Escudo fantasma");
        } else if (this instanceof Item4) {
            p.ataque += 7;
            System.out.println(p.getClass().getSimpleName() + " toca la Lira y gana +7 de ataque por este turno");
        }
    }
}

class Item1 extends Items { 
    Item1() {
        super("Poción de Vida", "Cura 25 HP"); 
    } 
}
class Item2 extends Items { 
    Item2() { 
        super("Clones", "Chance de esquivar"); 
    } 
}
class Item3 extends Items { 
    Item3() { 
        super("Escudo fantasma", "Bloquea siguiente golpe"); 
    } 
}
class Item4 extends Items { 
    Item4() { 
        super("Lira", "Aumenta ataque por 7 un turno"); 
    } 
}
