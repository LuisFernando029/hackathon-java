public class ItemPedido {
    private final String nomeDoPrato;
    private final int quantidade;
    private final double precoUnitario;

    public ItemPedido(String nomeDoPrato, int quantidade, double precoUnitario) {
        this.nomeDoPrato = nomeDoPrato;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getNomeDoPrato() {
        return nomeDoPrato;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public double getPrecoTotal() {
        return precoUnitario * quantidade;
    }

    @Override
    public String toString() {
        return "Item Pedido{ " +
                "Nome Do Prato: " + getNomeDoPrato() + " | " +
                "Quantidade: " + getQuantidade() + " | " +
                "Preço Unitário: " + getPrecoUnitario() +
                "Total item: " + getPrecoTotal() +
                "}";
    }
}




