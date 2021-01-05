
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;



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
}
