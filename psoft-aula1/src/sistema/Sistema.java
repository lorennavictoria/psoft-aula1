package sistema;

public class Sistema {

    public static void main(String args[]){
        Produto p = new Produto("Bike Lorenna", "Lorenna bike's ltda", 999.99);
        Lote l = new Lote(9, "12/12/2023", p);
    }
    
}