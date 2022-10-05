package sistema;

public class Controller {

    private Service s;

    public Controller(){
        this.s = new Service();
    }

    public Produto criaProduto(String nome, String fabricante, double preco) {
        Produto p = s.criaProduto(nome, fabricante, preco);
        return p;
    }

    public void criaLote(int quantidade, String datav, Produto produto) {
        s.criaProduto(quantidade, datav, produto);
    }

    public String listaProdutos() {
        return s.listaProdutos();
    }

    public String listaLotes(){
        return s.listaLotes();
    }

}