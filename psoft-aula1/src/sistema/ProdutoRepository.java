import java.util.HashSet;

public class ProdutoRepository {

    private HashSet<Produto> setProdutos;

    public ProdutoRepository(){
        this.setProdutos = new HashSet<>();
    }
    
    public void addProduto(Produto produto) {
        setProdutos.add(produto);
    }

    public HashSet<Produto> getProdutos(){
        return setProdutos;
    }

}
