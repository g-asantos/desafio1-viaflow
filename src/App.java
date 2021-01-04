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
                    System.out.println("2 - Hidráulico");

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

            } else {
                estaRodando = false;
                in.close();
            }
        }
    }
}
