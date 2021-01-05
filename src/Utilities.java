
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Utilities {
    

        public LocalDate expirationDateAfterTwoWeeks() {

            ZoneId timeZone = ZoneId.of( "America/Sao_Paulo" );
            LocalDate expirationDate = LocalDate.now(timeZone).plusWeeks(2);
           
            
           
            return expirationDate;
        }

        public String DateFormatter(LocalDate date){
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String formattedString = date.format(formatter); 

            return formattedString;
        }

        public void listarArray(ArrayList<Veiculo> a){
            for(int i = 0; i < a.size(); i++){
                if(a.get(i) instanceof Moto){
                    String message = String.format("\n %s -- Moto %s de %s com placa %s com cor %s e %scc cilindradas", i, 
                    a.get(i).getMarca(), a.get(i).getAno(),a.get(i).getPlaca(), a.get(i).getCor(), ((Moto) a.get(i)).getCilindradas());
                    System.out.println(message);
                } else if(a.get(i) instanceof Carro){
                    String message = String.format("\n %s -- Carro %s de %s com placa %s com cor %s,  e %s portas e %s, com cambio %s e direcão %s", i, 
                    a.get(i).getMarca(), a.get(i).getAno(),a.get(i).getPlaca(), a.get(i).getCor(), ((Carro) a.get(i))
                    .getPortas(), (((Carro) a.get(i)).isArcondicionado() ? "possui ar-condicionado" : "não tem ar-condicionado"), ((Carro) a.get(i)).getCambio(), ((Carro) a.get(i)).getDirecao() );
                    System.out.println(message);
                } else if (a.get(i) instanceof Caminhao){
                    String message = String.format("\n %s -- Caminhao %s de %s com placa %s com cor %s e com capacidade de %ston", i, 
                    a.get(i).getMarca(), a.get(i).getAno(),a.get(i).getPlaca(), a.get(i).getCor(), ((Caminhao) a.get(i)).getCapacidade());
                    System.out.println(message);
                } else {
                    String message = String.format("\n %s -- Onibus %s de %s com placa %s com cor %s de %s assentos", i, 
                    a.get(i).getMarca(), a.get(i).getAno(),a.get(i).getPlaca(), a.get(i).getCor(), ((Onibus) a.get(i)).getAssentos());
                    System.out.println(message);
                }
    
            }
        }
}
