import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;



public class Locacao {
    public ArrayList<VeiculoLocado> locados = new ArrayList<>();



    public void adicionarVeiculoLocado(VeiculoLocado v) {
        locados.add(v);
        
        System.out.println("\nVeículo locado!");
    }

    public void listarVeiculosLocados(){
        Utilities util = new Utilities();

        if(locados.size() == 0){
            System.out.println("Nao ha veiculos locados");
        }

        for(VeiculoLocado v: locados){
            System.out.println("\n " + "Veiculo de placa " + v.getPlaca() + ", o Whatsapp do locador é " + v.getWhatsapp() + ", e a locação expira no dia " + util.DateFormatter(v.getLocation_expiration()));
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

	public String terminarLocacao(String placa){
        for(int i = 0; i < locados.size(); i++){
            if(placa.equals(locados.get(i).getPlaca())){
                locados.remove(i);
                return placa;
            }
        }
        return null;
    }

    public void checarLocacoesQueTerminaram(){

        ZoneId timeZone = ZoneId.of( "America/Sao_Paulo" );
        LocalDate dataAtual = LocalDate.now(timeZone);
      

        for(int i = 0; i < locados.size(); i++){
            if(dataAtual.isAfter(locados.get(i).getLocation_expiration())){
                String placaRemovida = this.terminarLocacao(locados.get(i).getPlaca());

                System.out.println("\n A locacao do veiculo de placa " + placaRemovida + " encerrou");
                
                
            }
        }

    }
    
    
}
