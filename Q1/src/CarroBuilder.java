public class CarroBuilder implements VeiculoBuilder {
    private Veiculo carro;

    public CarroBuilder() {
        this.carro = new Veiculo();
    }

    @Override
    public VeiculoBuilder buildModelo(String modelo) {
        carro.setModelo(modelo);
        return this;
    }

    @Override
    public VeiculoBuilder buildMotor(String motor) {
        carro.setMotor(motor);
        return this;
    }

    @Override
    public VeiculoBuilder buildCor(String cor) {
        carro.setCor(cor);
        return this;
    }


    @Override
    public Veiculo build() {
        Veiculo veiculoConstruido = carro;
        this.carro = new Veiculo();
        return veiculoConstruido;
    }
}
