public class TesteMoto {
    public static void main(String[] args) {

        Moto moto = new Moto("4312-asda", "bmw", 1993, "azul", 4);

        System.out.println(moto);
        System.out.println(moto.getPlaca());
        System.out.println(moto.getMarca());
        System.out.println(moto.getAno());
        System.out.println(moto.getCor());
        System.out.println(moto.getCilindradas());
    }
}
