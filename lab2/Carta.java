public class Carta {
    private String simbolo;
    private boolean isRevealed;
    private boolean isMatched;

    public Carta(String simbolo, boolean isRevealed, boolean isMatched){
        this.simbolo=simbolo;
        this.isRevealed=false;
        this.isMatched=false;
    }
    
    public String getSimbolo(){
        return simbolo;
    }
    public boolean getIsR(){
        return isRevealed;
    }
    public boolean getIsM(){
        return isMatched;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo=simbolo;
    }

    public void setIsRevealed(boolean isRevealed) {
        this.isRevealed = isRevealed;
    }

    public void setIsMatched(boolean isMatched) {
        this.isMatched = isMatched;
    }
}
