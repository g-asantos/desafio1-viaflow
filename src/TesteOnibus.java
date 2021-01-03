public class TesteOnibus {
    public static void main(String[] args) {
        Onibus onibus = new Onibus("4312-asda", "bmw", 1993, "azul", 4);

        System.out.println(onibus);
        System.out.println(onibus.getPlaca());
        System.out.println(onibus.getMarca());
        System.out.println(onibus.getAno());
        System.out.println(onibus.getCor());
        System.out.println(onibus.getAssentos());
    }
}
