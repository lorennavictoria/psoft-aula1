import java.util.HashSet;

public class LoteRepository {

    private HashSet<Lote> setLotes = new HashSet<>();

    public void addLote(Lote lote) {
        setLotes.add(lote);
    }

    public HashSet getLote(){
        return setLotes;
    }

}