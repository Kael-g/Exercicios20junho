package exercicio02;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.registrarLivro(111111);
        biblioteca.registrarLivro(222222,"A Rainha Vermelha");
        biblioteca.registrarLivro(333333,"Divergente","distopia");
        biblioteca.registrarLivro(444444,"A Vida Invisivel de Addie LaRue","Romance","V.E. Schwab");
    }
}
