public interface VeiculoBuilder {

    VeiculoBuilder buildModelo(String modelo);
    VeiculoBuilder buildMotor(String motor);
    VeiculoBuilder buildCor(String cor);

    Veiculo build();
}
