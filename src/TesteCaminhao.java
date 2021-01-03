public class TesteCaminhao {
    public static void main(String[] args) {
        Caminhao caminhao = new Caminhao("4312-asda", "bmw", 1993, "azul", 4);

        System.out.println(caminhao);
        System.out.println(caminhao.getPlaca());
        System.out.println(caminhao.getMarca());
        System.out.println(caminhao.getAno());
        System.out.println(caminhao.getCor());
        System.out.println(caminhao.getCapacidade());
    }
}
