import java.time.LocalDate;

public class TesteLocacao {
    public static void main(String[] args) {
        Frota frota = new Frota();
        Locacao locacao = new Locacao();

        Moto moto = new Moto("4312-asda", "bmw", 1993, "azul", 4);
        frota.adicionarVeiculo(moto);

        VeiculoLocado motoLocada = new VeiculoLocado(moto.getPlaca(), 30298386);

        locacao.adicionarVeiculoLocado(motoLocada);
        locacao.listarVeiculosLocados();

        System.out.println(locacao.verificarSeJáLocado(motoLocada));

        System.out.println(locacao.terminarLocacao(motoLocada.getPlaca()));
        locacao.listarVeiculosLocados();


        VeiculoLocado motoLocadaTwo = new VeiculoLocado(moto.getPlaca(), 30298386);
        motoLocadaTwo.setLocation_expiration(LocalDate.of(1993, 1, 8));
        locacao.adicionarVeiculoLocado(motoLocadaTwo);
        locacao.checarLocacoesQueTerminaram();
        locacao.listarVeiculosLocados();
    }
}
