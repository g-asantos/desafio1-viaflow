public class TesteLocacao {
    public static void main(String[] args) {
        Frota frota = new Frota();
        Locacao locacao = new Locacao();

        Moto moto = new Moto("4312-asda", "bmw", 1993, "azul", 4);
        frota.adicionarVeiculo(moto);

        VeiculoLocado motoLocada = new VeiculoLocado(moto.getPlaca(), 30298386);

        locacao.adicionarVeiculoLocado(motoLocada);
        locacao.listarVeiculosLocados();
        System.out.println(locacao.terminarLocacao(motoLocada.getPlaca()));
        locacao.listarVeiculosLocados();
    }
}
