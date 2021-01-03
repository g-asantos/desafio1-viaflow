public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro("4312-asda", "bmw", 1993, "azul", 4, true, Cambio.MANUAL, Direcao.MECANICA);

        System.out.println(carro);
        System.out.println(carro.getPlaca());
        System.out.println(carro.getMarca());
        System.out.println(carro.getAno());
        System.out.println(carro.getCor());
        System.out.println(carro.getPortas());
        System.out.println(carro.isArcondicionado());
        System.out.println(carro.getCambio());
        System.out.println(carro.getDirecao());
    }
}
