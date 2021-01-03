public enum Direcao {
    MECANICA("mecânica"),
    HIDRAULICA("hidráulica"),
    ELETRICA("elétrica");

    private String descricao;

    private Direcao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
