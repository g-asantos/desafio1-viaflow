public class TesteFrota {
    public static void main(String[] args) {
        Frota frota = new Frota();
        Moto moto = new Moto("ABC-1234", "renault", 2007, "azul", 200);
        Onibus onibus = new Onibus("ABC-1234", "renault", 2007, "azul", 6);
        Carro carro = new Carro("ABC-1234", "renault", 2007, "azul", 4, true, Cambio.MANUAL, Direcao.HIDRAULICA);
        Caminhao caminhao = new Caminhao("ABC-1234", "renault", 2007, "azul", 200);



        frota.adicionarVeiculo(moto);
        frota.adicionarVeiculo(onibus);
        frota.adicionarVeiculo(carro);
        frota.adicionarVeiculo(caminhao);


        frota.listarVeiculos();
    }
}
