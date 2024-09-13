package SistemaPedidos;

public class Main {
    public static void main(String[] args) {
        Endereco end1 =  new Endereco("Prudente", "Frankfurt", "Marechal", "1020");
        Cliente c1 = new Cliente("José", "01234567890", "1193849287", end1);
        Funcionario f1 = new Funcionario("Jorge", 1245.97, "812731");
        Pedido pedido1 = new Pedido(c1, 1, MetodosPagamento.PIX);
        Produto produto1 = new Produto("Pao", 2.5, 5);
        Produto produto2 = new Produto("Café", 3.0, 10);
        Produto produto3 = new Produto("Água", 1.4, 20);
        pedido1.adicionarItem(new Item(4, produto1));
        pedido1.adicionarItem(new Item(2, produto2));
        pedido1.adicionarItem(new Item(5, produto3));
        pedido1.setEntrega(f1, 10.50);
        System.out.println(pedido1);
    }
}
