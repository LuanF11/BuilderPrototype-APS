public class Retangulo implements Forma {

    private String cor;
    private int tamanho;

    public Retangulo() {
        this.cor = "Branco";
        this.tamanho = 10;
    }

    public Retangulo(Retangulo retangulo) {
        this.cor = retangulo.getCor();
        this.tamanho = retangulo.getTamanho();
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
        System.out.println("Desenhando um retângulo " + cor + " de tamanho " + tamanho);
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


