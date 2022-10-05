public class Service {

    private ProdutoRepository pr = new ProdutoRepository();
    private LoteRepository lr = new LoteRepository();
    
    public Produto criaProduto(String nome, String fabricante, double preco){
        Produto p = new Produto(nome, fabricante, preco);
        pr.addProduto(p);
        return p;
    }

    public void criaLote(int quantidade, String data, Produto produto){
        Lote lote = new Lote(quantidade, data, produto);
        lr.addLote(lote);
    }

    public String listaProdutos(){
        String listagem = "";
        for (Produto produto : pr.getProdutos()) {
            listagem += produto.getNome() + "\n";
        }
        return listagem;
    }

    public String listaLotes(){
        String listagem = "";
        for (Lote lote : lr.getLotes()) {
            listagem += lote.getQuantidade() + ", " + lote.getProdutos().getNome() + "\n";
        }
        return listagem;
    }

}