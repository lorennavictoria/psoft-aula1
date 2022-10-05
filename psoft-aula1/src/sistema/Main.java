package sistema;

public class Main {

    public static void main(String args[]){
        public static Controller c;
        Produto prod = cadastraProduto("bike",  "lorenna's bikes ltda.", 999.99);
        cadastraLote(9, "12/10/2022", prod);   
    }
    
    public static void cadastraProduto(String nome, String fabricante, double preco){
        c.criaProduto(nome, fabricante, preco);
    }

    public static void cadastraLote(int quantidade, String data, Produto produto){
        c.criaProduto(nome, fabricante, preco);
    }

    public static void listaLotes(){
        system.out.println(c.listaLotes());
    }

    public static void listaProdutos(){
        system.out.println(c.listaProdutos());
    }
}