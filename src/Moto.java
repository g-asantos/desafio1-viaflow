public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String placa, String marca, int ano, String cor, int cilindradas) {
        super(placa, marca, ano, cor);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }


}
