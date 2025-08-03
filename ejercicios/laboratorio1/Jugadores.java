public class Jugadores {
    private String jugador;
    private Pokemon pokemon;
    
    public Jugadores(String jugador, Pokemon pokemon){
        this.jugador = jugador;
        this.pokemon = pokemon;
    }

    public void setJugador(String var1){
        this.jugador = var1;
    }
    
    public String getJugador(){
        return jugador;
    }

}
