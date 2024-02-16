public class Main {
    public static void main(String[] args) {

        Forma circulo = new Circulo();
        circulo.setCor("Azul");
        circulo.setTamanho(10);
        circulo.desenhar();

        Forma circuloClone = circulo.clone();
        circuloClone.setCor("Vermelho");
        circuloClone.setTamanho(20);
        circuloClone.desenhar();

        System.out.println("Circulo: " + circulo.getCor() + " " + circulo.getTamanho());
        System.out.println("Circulo Clone: " + circuloClone.getCor() + " " + circuloClone.getTamanho());

        Forma retangulo = new Retangulo();
        retangulo.setCor("Verde");
        retangulo.setTamanho(10);
        retangulo.desenhar();

        Forma retanguloClone = retangulo.clone();
        retanguloClone.setCor("Amarelo");
        retanguloClone.setTamanho(20);
        retanguloClone.desenhar();

        System.out.println("Retangulo: " + retangulo.getCor() + " " + retangulo.getTamanho());
        System.out.println("Retangulo Clone: " + retanguloClone.getCor() + " " + retanguloClone.getTamanho());
    }
}