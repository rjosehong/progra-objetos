import java.util.List;
public class Tablero {
    private Carta[][] tablero = new Carta[4][4];
    Casillas ca = new Casillas();
    
    public void tableroMemoria(List<String> cartas){
        int index = 0;
        for (int i=0; i<4; i++){
                for (int j=0; j<4; j++){
                    tablero[i][j] = new Carta(cartas.get(index++), false, false);               
                }
        }
    }
    public void tableroMostrar(){
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                Carta c = tablero[i][j];
                if(c.getIsR() || c.getIsM()){
                    System.out.print(c.getSimbolo()+ " ");
                }
                else {
                    System.out.print("[] ");
                }
            }
            System.out.println();
        }
    }

    public void voltearCarta(int fila, int col) {
        if (fila >= 0 && fila < 4 && col >= 0 && col < 4) {
            tablero[fila][col].setIsRevealed(true);
        } else {
            System.out.println("Coordenadas invalidas");
        }
    }

    public void ocultarCarta(int fila, int col) {
        if (fila >= 0 && fila < 4 && col >= 0 && col < 4) {
            Carta c = tablero[fila][col];
            if (!c.getIsM()) {
                c.setIsRevealed(false);
            }
        }
    }
    
    public void matchCarta(int fila, int col) {
        if(fila >= 0 && fila < 4 && col >= 0 && col < 4) {
            Carta c = tablero[fila][col];
            c.setIsMatched(true);
        }
    }

    public Carta getCarta(int fila, int col) {
        return tablero[fila][col];
    }

    public boolean todoPareja(){
        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                if (!tablero[i][j].getIsM()){
                    return false;
                }
            }
        }
        return true;
    }
}
