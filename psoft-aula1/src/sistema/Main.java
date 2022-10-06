import java.text.spi.DateFormatProvider;

public class Main {

    public static void main(String args[]){
        Controller c =  new Controller();
        Produto prod = cadastraProduto(c, "bike", "lorenna's bikes ltda.", 999.99);
        cadastraLote(c, 9, "12/10/2022", prod);   
    }
    
    public static Produto cadastraProduto(Controller c, String nome, String fabricante, double preco){
        return c.criaProduto(nome, fabricante, preco);
    }

    public static void cadastraLote(Controller c, int quantidade, String data, Produto produto){
        c.criaLote(quantidade, data, produto);
    }

    public static void listaLotes(Controller c){
        System.out.println(c.listaLotes());
    }

    public static void listaProdutos(Controller c){
        System.out.println(c.listaProdutos());
    }
    
}