//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante();

        Pedido ped1 = new Pedido(1);
        Pedido ped2 = new Pedido(2);

        ItemPedido pizza = new ItemPedido("Pizza", 2, 60.0);
        ItemPedido hotDog = new ItemPedido("Hot Dog", 1, 30.0);
        ItemPedido xSalada = new ItemPedido("X-Salada", 1, 35.0);
        ItemPedido cocaCola = new ItemPedido("Coca-Cola", 1, 5.0);

        ped1.adicionarItem(pizza);
        ped1.adicionarItem(cocaCola);
        ped1.calcularTotalPedido();

        ped2.adicionarItem(hotDog);
        ped2.adicionarItem(cocaCola);
        ped2.adicionarItem(pizza);
        ped2.calcularTotalPedido();
        ped2.removerItem(pizza);
        ped2.calcularTotalPedido();

        restaurante.addPedido(ped1);
        restaurante.addPedido(ped2);
        restaurante.exibirPedidos();
        restaurante.removePedido(ped1);
        restaurante.exibirPedidos();
        restaurante.addPedido(ped1);
        restaurante.buscaPedido(ped2);
        restaurante.reservarMesa(1);

    }
}