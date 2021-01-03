public enum Cambio {
    MANUAL("manual"),
    AUTOMATICO("automático");

    private String descricao;

    private Cambio(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    
}
