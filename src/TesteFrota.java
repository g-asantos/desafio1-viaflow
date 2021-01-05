import java.util.ArrayList;

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



        ArrayList<Veiculo> motosArrayList = frota.apenasMotos();
        ArrayList<Veiculo> onibusArrayList = frota.todosMenosMotos();
        ArrayList<Veiculo> carrosArrayList = frota.apenasCarros();
        ArrayList<Veiculo> caminhaoArrayList = frota.carrosOuCaminhoes();

        frota.listarVeiculos();
        frota.listarArray(motosArrayList);
        frota.listarArray(onibusArrayList);
        frota.listarArray(carrosArrayList);
        frota.listarArray(caminhaoArrayList);

        System.out.println(frota.verificarSeJáCadastrado(moto.getPlaca()));
        
    }
}
