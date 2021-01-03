public class Onibus extends Veiculo {
    private int assentos;


    public Onibus(String placa, String marca, int ano, String cor, int assentos) {
        super(placa, marca, ano, cor);
        this.assentos = assentos;
    }

    public int getAssentos() {
        return assentos;
    }

    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    
    
}
