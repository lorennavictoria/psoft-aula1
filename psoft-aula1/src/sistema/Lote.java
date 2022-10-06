public class Lote{

    private int quantidade;
    private String datav;
    private Produto produto;

    public Lote(int quantidade, String datav, Produto produto){
        this.quantidade = quantidade;
        this.datav = datav;
        this.produto = produto;
    }
    
    public int getQuantidade(){
        return this.quantidade;
    }

    public String getData(){
        return this.datav;
    }

    public Produto getProdutos(){
        return this.produto;
    }
    
}