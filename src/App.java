
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Deposito deposito = new Deposito();

        Scanner in = new Scanner(System.in);


        boolean estaRodando = true;

        while(estaRodando){
            System.out.println("(C) Cadastrar veiculo\n(L) Realizar locação\n(X) Encerrar");

            String escolha = in.next().toUpperCase();

            if(escolha.equals("C")){

                System.out.println("Informe a placa do veículo:\n");
                String placa = in.next();

                System.out.println("Informe a marca do veículo:\n");
                String marca = in.next();

                System.out.println("Informe o ano do veículo:\n");
                int ano = in.nextInt();

                System.out.println("Informe a cor do veículo:\n");
                String cor = in.next();


                System.out.println("Escolha o tipo do veículo");
                System.out.println("1 - Moto");
                System.out.println("2 - Onibus");
                System.out.println("3 - Carro");
                System.out.println("4 - Caminhão");

                int tipo = in.nextInt();

                switch(tipo){
                    case 1:

                    System.out.println("Informe as cilindradas da moto");
                    int cilindradas = in.nextInt();
                    Moto moto = new Moto(placa, marca, ano, cor, cilindradas);
                    deposito.adicionarVeiculo(moto);
                    break;
                    case 2:

                    System.out.println("Informe o número de assentos do Onibus");
                    int assentos = in.nextInt();
                    Onibus onibus = new Onibus(placa,marca,ano,cor, assentos);
                    deposito.adicionarVeiculo(onibus);
                    break;
                    case 3:

                    System.out.println("Informe o número de portas do Carro");
                    int portas = in.nextInt();
                    System.out.println("Informe se o Carro possuí ar-condicionado");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");

                    boolean arcondicionado = in.nextInt() == 1 ? true : false;

                    System.out.println("Informe se o câmbio do carro é manual ou automático");
                    System.out.println("1 - Manual");
                    System.out.println("2 - Automático");

                    Cambio cambio = in.nextInt() == 1 ? Cambio.MANUAL : Cambio.AUTOMATICO;

                    System.out.println("Informe o tipo de direção do carro");
                    System.out.println("1 - Mecânica");
                    System.out.println("2 - Hidráulica");
                    System.out.println("3 - Elétrica");

                    Direcao direcao;

                    switch(in.nextInt()){
                        case 1:
                        direcao = Direcao.MECANICA;
                        break;
                        case 2:
                        direcao = Direcao.HIDRAULICA;
                        break;
                        case 3:
                        direcao = Direcao.ELETRICA;
                        break;
                        default:
                        direcao = Direcao.MECANICA;
                        break;
                    }

                    Carro carro = new Carro(placa,marca,ano,cor,portas, arcondicionado, cambio, direcao);
                    deposito.adicionarVeiculo(carro);
                 
                    break;
                    case 4:
                    System.out.println("Informe a capacidade em toneladas do Caminhão");
                    int capacidade = in.nextInt();
                    Caminhao caminhao = new Caminhao(placa, marca, ano, cor, capacidade);
                    deposito.adicionarVeiculo(caminhao);
                    break;
                    default:
                    break;
                }


            } else if(escolha.equals("L")){
                Locacao locacao = new Locacao();
                int whatsApp;

                System.out.println("Informe a categoria da sua CNH");
                System.out.println("1 - A");
                System.out.println("2 - B");
                System.out.println("3 - C");
                System.out.println("4 - D");



                switch(in.nextInt()){
                    case 1:
                    System.out.println("Estas são as motos disponiveis para locação.");
                    ArrayList<Veiculo> motos = deposito.apenasMotos();
                    deposito.listarArray(motos);
                    System.out.println("Digite o número da moto que deseja");
                    int motoIndex = in.nextInt();
                    System.out.println("Digite seu número do whatsapp");
                    whatsApp = in.nextInt();

                    locacao.adicionarVeiculoLocado(motos.get(motoIndex).getPlaca(), whatsApp);

                    locacao.listarVeiculosLocados();
                    break;
                    case 2:
                    System.out.println("Estes são os carros disponiveis para locação.");
                    ArrayList<Veiculo> carros = deposito.apenasCarros();
                    deposito.listarArray(carros);
                    System.out.println("Digite o número do carro que deseja");
                    int carroIndex = in.nextInt();
                    System.out.println("Digite o seu número do whatsapp");
                    whatsApp = in.nextInt();

                    locacao.adicionarVeiculoLocado(carros.get(carroIndex).getPlaca(), whatsApp);

                    locacao.listarVeiculosLocados();

                    case 3:

                    System.out.println("Estes são os caminhoes e carros disponiveis para locação");
                    ArrayList<Veiculo> carrosOuCaminhoes = deposito.carrosOuCaminhoes();
                    deposito.listarArray(carrosOuCaminhoes);
                    System.out.println("Digite o número do veículo que deseja");
                    int carrosOuCaminhoesIndex = in.nextInt();
                    System.out.println("Digite seu número do whatsapp");
                    whatsApp = in.nextInt();

                    locacao.adicionarVeiculoLocado(carrosOuCaminhoes.get(carrosOuCaminhoesIndex).getPlaca(), whatsApp);

                    locacao.listarVeiculosLocados();

                    case 4:

                    System.out.println("Estes são os veiculos disponiveis para locação");
                    ArrayList<Veiculo> todosMenosMotos = deposito.todosMenosMotos();
                    deposito.listarArray(todosMenosMotos);
                    System.out.println("Digite o número do veículo que deseja");
                    int todosMenosMotosIndex = in.nextInt();
                    System.out.println("Digite seu número do whatsapp");
                    whatsApp = in.nextInt();

                    locacao.adicionarVeiculoLocado(todosMenosMotos.get(todosMenosMotosIndex).getPlaca(), whatsApp);

                    locacao.listarVeiculosLocados();

                    default:
                    break;
                }


            } else {
                estaRodando = false;
                in.close();
            }
        }
    }
}
