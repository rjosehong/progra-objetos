import java.util.Random;
public class Controlador {
    
    Random random = new Random();
    int max=100, min=0;
    Habilidades habilidad1 = new Habilidades("Llamarada", "Daña", "Fuego", random.nextInt((max-min+1)+min));
    Habilidades habilidad2 = new Habilidades("Hidrobomba", "Daña", "Agua", random.nextInt((max-min+1)+min));
    Habilidades habilidad3 = new Habilidades("Vides protectoras", "Defensa", "Planta", random.nextInt((max-min+1)+min));
    Habilidades habilidad4 = new Habilidades("Colmillo electrico", "Aumenta", "Electrico", random.nextInt((max-min+1)+min));
    
    Pokemon pokemon1 = new Pokemon("Charizard", "Fuego", 5, 10, habilidad1);
    Pokemon pokemon2 = new Pokemon("Blastoise", "Agua", 6, 9, habilidad2);
    Pokemon pokemon3 = new Pokemon("Venasaur", "Planta", 4, 11, habilidad3);
    Pokemon pokemon4 = new Pokemon("Manectric", "Electrico", 5, 10, habilidad4);
    Pokemon pokemon5 = new Pokemon("Incineroar", "Fuego", 7, 9, habilidad1);
    Pokemon pokemon6 = new Pokemon("Sceptile", "Planta", 8, 7, habilidad3);
    Pokemon pokemon7 = new Pokemon("Swampert", "Agua", 5, 10, habilidad2);
    Pokemon pokemon8 = new Pokemon("Luxray", "Electrico", 5, 10, habilidad4);

    public Pokemon getPokemon1() {return pokemon1;}
    public Pokemon getPokemon2() {return pokemon2;}
    public Pokemon getPokemon3() {return pokemon3;}
    public Pokemon getPokemon4() {return pokemon4;}
    public Pokemon getPokemon5() {return pokemon5;}
    public Pokemon getPokemon6() {return pokemon6;}
    public Pokemon getPokemon7() {return pokemon7;}
    public Pokemon getPokemon8() {return pokemon8;}

    public Habilidades getHabilidad1() {return habilidad1;}
    public Habilidades getHabilidad2() {return habilidad2;}
    public Habilidades getHabilidad3() {return habilidad3;}
    public Habilidades getHabilidad4() {return habilidad4;}
}
