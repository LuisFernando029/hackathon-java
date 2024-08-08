import java.util.ArrayList;

public class Restaurante {
    private ArrayList<Pedido> pedidos;

    public Restaurante() {
        this.pedidos = new ArrayList<>();
    }

    public void addPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void removePedido(Pedido pedido) {
        pedidos.remove(pedido);
    }

    public void buscaPedido(Pedido pedido) {
        boolean encontrado = false;
        for (Pedido p : pedidos) {
            if (p.getNumero() == pedido.getNumero()) {
                System.out.println("Encontrado! " + p);
                encontrado = true;
                break;
            }
        }
        if(!encontrado) {
            System.out.println("Pedido não encontrado!");
        }
    }

    public void reservarMesa(int numeroMesa) {
        System.out.println("Sua mesa foi reservada! Numero: " + numeroMesa);
    }

    public void exibirPedidos() {
        for (Pedido p : pedidos) {
            System.out.println(p);
        }
    }
}
