public class TesteVeiculoLocado {
    public static void main(String[] args) {
        VeiculoLocado veiculoLocado = new VeiculoLocado("4312-asda", 30298386);

        System.out.println(veiculoLocado);
        System.out.println(veiculoLocado.getPlaca());
        System.out.println(veiculoLocado.getWhatsapp());
        System.out.println(veiculoLocado.getLocation_expiration());
    }
}
