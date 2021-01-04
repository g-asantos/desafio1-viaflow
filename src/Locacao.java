import java.util.ArrayList;

public class Locacao {
    public ArrayList<VeiculoLocado> locados = new ArrayList<>();



    public void adicionarVeiculoLocado(String placa, int whatsApp) {

        VeiculoLocado veiculoLocado = new VeiculoLocado(placa, whatsApp);

        locados.add(veiculoLocado);
        
        System.out.println("\nVeículo locado!");
    }

    public void listarVeiculosLocados(){
        for(VeiculoLocado v: locados){
            System.out.println("\n " + "Veiculo de placa " + v.getPlaca() + ", o Whatsapp do locador é " + v.getWhatsapp());
        }
    }
    
}
