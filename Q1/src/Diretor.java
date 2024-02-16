public class Diretor {

    private VeiculoBuilder veiculoBuilder;

    public Diretor(VeiculoBuilder veiculoBuilder) {
        this.veiculoBuilder = veiculoBuilder;
    }

    public Veiculo buildCarroDeLuxo() {
        return veiculoBuilder.buildModelo("Carro de Luxo")
                .buildMotor("Motor potente 9.0")
                .buildCor("Vermelho")
                .build();
    }

    public Veiculo buildCaminhaoRobusto() {
        return veiculoBuilder.buildModelo("Caminhão Robusto")
                .buildMotor("Motor potente 12.0")
                .buildCor("Preto")
                .build();
    }
}
