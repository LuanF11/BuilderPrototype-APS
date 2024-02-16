public class Circulo implements Forma {

    private String cor;
    private int tamanho;

    public Circulo() {
        this.cor = "Branco";
        this.tamanho = 10;
    }

    public Circulo(Circulo circulo) {
        this.cor = circulo.getCor();
        this.tamanho = circulo.getTamanho();
    }

    @Override
    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String getCor() {
        return cor;
    }

    @Override
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public int getTamanho() {
        return tamanho;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um círculo " + cor + " de tamanho " + tamanho);
    }

    @Override
    public Forma clone() {
        try {
            return (Forma) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
