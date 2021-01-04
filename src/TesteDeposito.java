public class TesteDeposito {
    public static void main(String[] args) {
        Deposito deposito = new Deposito();
        Moto moto = new Moto("ABC-1234", "renault", 2007, "azul", 200);
        Onibus onibus = new Onibus("ABC-1234", "renault", 2007, "azul", 6);
        Carro carro = new Carro("ABC-1234", "renault", 2007, "azul", 4, true, Cambio.MANUAL, Direcao.HIDRAULICA);
        Caminhao caminhao = new Caminhao("ABC-1234", "renault", 2007, "azul", 200);



        deposito.adicionarVeiculo(moto);
        deposito.adicionarVeiculo(onibus);
        deposito.adicionarVeiculo(carro);
        deposito.adicionarVeiculo(caminhao);


        deposito.listarVeiculos();
    }
}
