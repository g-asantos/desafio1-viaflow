public class Carro extends Veiculo{
    private int portas;
    private boolean arcondicionado;
    private Cambio cambio;
    private Direcao direcao;


    public Carro(String placa, String marca, int ano, String cor, int portas, boolean arcondicionado, Cambio cambio, Direcao direcao) {
        super(placa, marca, ano, cor);
        this.portas = portas;
        this.arcondicionado = arcondicionado;
        this.cambio = cambio;
        this.direcao = direcao;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    public boolean isArcondicionado() {
        return arcondicionado;
    }

    public void setArcondicionado(boolean arcondicionado) {
        this.arcondicionado = arcondicionado;
    }

    public String getCambio() {
        return cambio.getDescricao();
    }

    public void setCambio(Cambio cambio) {
        this.cambio = cambio;
    }

    public String getDirecao() {
        return direcao.getDescricao();
    }

    public void setDirecao(Direcao direcao) {
        this.direcao = direcao;
    }

    
    
}
