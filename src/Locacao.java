import java.util.ArrayList;



public class Locacao {
    public ArrayList<VeiculoLocado> locados = new ArrayList<>();



    public void adicionarVeiculoLocado(VeiculoLocado v) {
        locados.add(v);
        
        System.out.println("\nVeículo locado!");
    }

    public void listarVeiculosLocados(){
        for(VeiculoLocado v: locados){
            System.out.println("\n " + "Veiculo de placa " + v.getPlaca() + ", o Whatsapp do locador é " + v.getWhatsapp());
        }
    }

    public boolean verificarSeJáLocado(VeiculoLocado v){
        
        for(int i = 0; i < locados.size(); i++){
            if(v.getPlaca().equals(locados.get(i).getPlaca())){
                return true;
            }
        }
        return false;
    }

	
    
    
}
