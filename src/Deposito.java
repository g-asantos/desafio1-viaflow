import java.util.ArrayList;

public class Deposito {
    public ArrayList<Veiculo> veiculos = new ArrayList<>();


    public void adicionarVeiculo(Veiculo v){
        veiculos.add(v);
        System.out.println("\nVeiculo adicionado!");
    }

    public void listarVeiculos(){
        for(Veiculo v : veiculos){
            if(v instanceof Moto){
                System.out.println("\n" + v.getMarca() + " de " + v.getAno() + " com placa " + v.getPlaca() + " de " + ((Moto) v)
                        .getCilindradas() + "cc");
            } else if(v instanceof Carro){
                System.out.println("\n" + v.getMarca() + " de " + v.getAno() + " com placa " + v.getPlaca() + " com " + ((Carro) v)
                        .getPortas() + " portas e " + (((Carro) v).isArcondicionado() ? "possui ar-condicionado" : "não tem ar-condicionado") + " com " + "cambio" + 
                        " " + ((Carro) v).getCambio() + " e " + "direção" 
                        + " " + ((Carro) v).getDirecao() );
            } else if (v instanceof Caminhao){
                System.out.println("\n" + v.getMarca() + " de " + v.getAno() + " com placa " + v.getPlaca() + " de capacidade de " + ((Caminhao) v)
                        .getCapacidade() + "ton");
            } else {
                System.out.println("\n" + v.getMarca() + " de " + v.getAno() + " com placa " + v.getPlaca() + " de " + ((Onibus) v)
                        .getAssentos() + " assentos");
            }
        }
    }
}
