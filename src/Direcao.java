public enum Direcao {
    MECANICA("mecânica"),
    HIDRAULICA("hidráulica"),
    ELETRICA("elétrica");

    private String descricao;

    Direcao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
