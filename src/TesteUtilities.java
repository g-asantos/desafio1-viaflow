import java.time.LocalDate;

public class TesteUtilities {
    public static void main(String[] args) {
        Utilities util = new Utilities();

        LocalDate date = util.expirationDateAfterTwoWeeks();
        String finalDate = util.DateFormatter(date);
        System.out.println(finalDate);
    }
}
