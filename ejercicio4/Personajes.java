import java.util.ArrayList;
class Personajes {
    int vida, ataque, capacidad_items;
    ArrayList<Items> inventario = new ArrayList<>();

    Personajes(int vida, int ataque, int capacidad_items) {
        this.vida = vida;
        this.ataque = ataque;
        this.capacidad_items = capacidad_items;
    }
}

class Guerrero extends Personajes {
    Guerrero() { 
        super(50, 9, 3); 
    }
}

class Explorador extends Personajes {
    Explorador() {
        super(35, 5, 6);
    }
}