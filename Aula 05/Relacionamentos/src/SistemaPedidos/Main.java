package SistemaPedidos;

public class Main {
    public static void main(String[] args) {
        Endereco end1 =  new Endereco("Prudente", "Frankfurt", "Marechal", "1020");
        Cliente c1 = new Cliente("José", "01234567890", "1193849287", end1);
        Pedido p1 = new Pedido(c1);
        p1.adicionarItem(new Item(4, new Produto("Pao", 2.5)));
        p1.adicionarItem(new Item(2, new Produto("Café", 3.0)));
        p1.adicionarItem(new Item(5, new Produto("Água", 1.4)));
        System.out.println(p1);
    }
}
