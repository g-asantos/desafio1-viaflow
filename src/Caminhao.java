public class Caminhao extends Veiculo{
    private int capacidade;


    public Caminhao(String placa, String marca, int ano, String cor, int capacidade) {
        super(placa, marca, ano, cor);
        this.capacidade = capacidade;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
}
