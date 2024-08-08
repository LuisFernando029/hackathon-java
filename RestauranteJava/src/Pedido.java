import java.util.ArrayList;

public class Pedido {
    private final int numero;
    private ArrayList<ItemPedido> itens;
    private final double taxaEntrega;

    public Pedido(int numero) {
        this.numero = numero;
        this.itens = new ArrayList<>();
        this.taxaEntrega = 5.0;
    }

    public int getNumero() {
        return numero;
    }

    public double getTaxaEntrega() {
        return taxaEntrega;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public void calcularTotalPedido() {
        double total = 0.0;
        for (ItemPedido item : itens) {
            total += item.getPrecoUnitario();
        }
        double totalComTaxa = total + getTaxaEntrega();
        System.out.println("Valor do pedido: " + total + "\n" +
                            "Taxa de entrega: " + getTaxaEntrega() + "\n" +
                            "Total: " + totalComTaxa);
    }

    @Override
    public String toString() {
        return "Pedido: " + itens + "\n";
    }
}