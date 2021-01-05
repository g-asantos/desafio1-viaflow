import java.time.LocalDate;

public class VeiculoLocado {
    private String placa;
    private int whatsapp;
    private LocalDate location_expiration;
   
    

    public VeiculoLocado(String placa, int whatsapp) {
        Utilities util = new Utilities();

        this.placa = placa;
        this.whatsapp = whatsapp;
        this.location_expiration = util.expirationDateAfterTwoWeeks() ;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getWhatsapp() {
        return whatsapp;
    }

    public void setWhatsapp(int whatsapp) {
        this.whatsapp = whatsapp;
    }

    public LocalDate getLocation_expiration() {
        return location_expiration;
    }

    public void setLocation_expiration(LocalDate location_expiration) {
        this.location_expiration = location_expiration;
    }

    

}
