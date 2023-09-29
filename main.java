import java.util.HashMap;
import java.util.Map;

public class BarComandaSystem {
    private Map<Integer, Double> comandas;

    public BarComandaSystem() {
        comandas = new HashMap<>();
    }

    public void adicionarComanda(int numeroComanda, double total) {
        comandas.put(numeroComanda, total);
        System.out.println("Comanda " + numeroComanda + " adicionada com sucesso!");
    }

    public void removerComanda(int numeroComanda) {
        if (comandas.containsKey(numeroComanda)) {
            comandas.remove(numeroComanda);
            System.out.println("Comanda " + numeroComanda + " removida com sucesso!");
        } else {
            System.out.println("Comanda " + numeroComanda + " não encontrada.");
        }
    }

    public void listarComandas() {
        System.out.println("Lista de comandas:");
        for (Map.Entry<Integer, Double> entry : comandas.entrySet()) {
            System.out.println("Comanda " + entry.getKey() + ": R$" + entry.getValue());
        }
    }

    public static void main(String[] args) {
        BarComandaSystem sistema = new BarComandaSystem();

        // Exemplo de utilização do sistema
        sistema.adicionarComanda(1, 50.0);
        sistema.adicionarComanda(2, 75.5);
        sistema.listarComandas();
        sistema.removerComanda(1);
        sistema.listarComandas();
    }
}