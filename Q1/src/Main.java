public class Main {
    public static void main(String[] args) {

        VeiculoBuilder carroBuilder = new CarroBuilder();
        Diretor diretor = new Diretor(carroBuilder);


        Veiculo carroDeLuxo = diretor.buildCarroDeLuxo();
        Veiculo caminhaoRobusto = diretor.buildCaminhaoRobusto();


        System.out.println("Carro de Luxo: " + carroDeLuxo);
        System.out.println("Caminhão Robusto: " + caminhaoRobusto);



    }
}