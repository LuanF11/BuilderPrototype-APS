public class Veiculo {
    private String modelo;
    private String motor;
    private String cor;

    public Veiculo() {
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", motor='" + motor + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}