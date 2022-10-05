import java.util.HashSet;

public class LoteRepository {

    private HashSet<Lote> setLotes = new HashSet<>();

    public LoteRepository(){
        this.setLotes = new HashSet<>();
    }

    public void addLote(Lote lote) {
        setLotes.add(lote);
    }

    public HashSet<Lote> getLote(){
        return setLotes;
    }

}