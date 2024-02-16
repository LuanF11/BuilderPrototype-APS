public interface Forma extends Cloneable{
    void setCor(String cor);
    String getCor();
    void setTamanho(int tamanho);
    int getTamanho();
    void desenhar();
    Forma clone();
}
