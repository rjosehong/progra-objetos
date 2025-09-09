import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Casillas {
    public List<String> CartasCasillas(){

    List<String> lista = new ArrayList<>();
    String[] cartas = {"A", "B", "C", "D", "1", "2", "3", "4"};
    for(String carta : cartas){
        lista.add(carta);
        lista.add(carta);
    }
    Collections.shuffle(lista);
    
    return lista;
    }
}
