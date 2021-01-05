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

    
    public void listarArray(ArrayList<Veiculo> a){
        for(int i = 0; i < a.size(); i++){
            if(a.get(i) instanceof Moto){
                String message = String.format("\n %s -- %s de %s com placa %s com cor %s e %scc cilindradas", i, 
                a.get(i).getMarca(), a.get(i).getAno(),a.get(i).getPlaca(), a.get(i).getCor(), ((Moto) a.get(i)).getCilindradas());
                System.out.println(message);
            } else if(a.get(i) instanceof Carro){
                String message = String.format("\n %s -- %s de %s com placa %s com cor %s,  e %s portas e %s, com cambio %s e direcão %s", i, 
                a.get(i).getMarca(), a.get(i).getAno(),a.get(i).getPlaca(), a.get(i).getCor(), ((Carro) a.get(i))
                .getPortas(), (((Carro) a.get(i)).isArcondicionado() ? "possui ar-condicionado" : "não tem ar-condicionado"), ((Carro) a.get(i)).getCambio(), ((Carro) a.get(i)).getDirecao() );
                System.out.println(message);
            } else if (a.get(i) instanceof Caminhao){
                String message = String.format("\n %s -- %s de %s com placa %s com cor %s e com capacidade de %ston", i, 
                a.get(i).getMarca(), a.get(i).getAno(),a.get(i).getPlaca(), a.get(i).getCor(), ((Caminhao) a.get(i)).getCapacidade());
                System.out.println(message);
            } else {
                String message = String.format("\n %s -- %s de %s com placa %s com cor %s de %s assentos", i, 
                a.get(i).getMarca(), a.get(i).getAno(),a.get(i).getPlaca(), a.get(i).getCor(), ((Onibus) a.get(i)).getAssentos());
                System.out.println(message);
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
