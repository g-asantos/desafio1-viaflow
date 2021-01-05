import java.util.ArrayList;

public class Frota {
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


    public ArrayList<Veiculo> apenasMotos(){
        ArrayList<Veiculo> motos = new ArrayList<>();

        for(Veiculo v: veiculos){
            if(v instanceof Moto){
                motos.add(v);
            }

        
        }
        return motos;
    }

    public ArrayList<Veiculo> apenasCarros(){
        ArrayList<Veiculo> carros = new ArrayList<>();

        for(Veiculo v: veiculos){
            if(v instanceof Carro){
                carros.add(v);
            }

        
        }
        return carros;
    }

    public ArrayList<Veiculo> carrosOuCaminhoes(){
        ArrayList<Veiculo> carrosOuCaminhoes = new ArrayList<>();

        for(Veiculo v: veiculos){
            if(v instanceof Carro | v instanceof Caminhao){
                carrosOuCaminhoes.add(v);
            }

        
        }
        return carrosOuCaminhoes;
    }

    public ArrayList<Veiculo> todosMenosMotos(){
        ArrayList<Veiculo> todosMenosMotos = new ArrayList<>();

        for(Veiculo v: veiculos){
            if(v instanceof Carro | v instanceof Caminhao | v instanceof Onibus){
                todosMenosMotos.add(v);
            }

        
        }
        return todosMenosMotos;
    }


    public boolean verificarSeJáCadastrado(String placa){
        
        for(int i = 0; i < veiculos.size(); i++){
            if(placa.equals(veiculos.get(i).getPlaca())){
                return true;
            }
        }
        return false;
    }
}
