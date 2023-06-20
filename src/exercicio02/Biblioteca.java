package exercicio02;

public class Biblioteca {
    private long isbn;
    private String nome;
    private String autore;
    private String genero;

    public void registrarLivro(long isbn){
        this.isbn = isbn;
        System.out.println("O livro foi registrado com o ISBN "+isbn);
    }
    public void registrarLivro(long isbn, String nome){
        this.isbn = isbn;
        this.nome = nome;
        System.out.println("O livro foi registrado com o ISBN "+isbn+" e o nome "+nome);
    }
    public void registrarLivro(long isbn, String nome, String genero){
        this.isbn = isbn;
        this.nome = nome;
        this.genero = genero;
        System.out.println("O livro foi registrado com o ISBN "+isbn+",o nome "+nome+" e o gênero "+genero);
    }
    public void registrarLivro(long isbn, String nome, String genero, String autore){
        this.isbn = isbn;
        this.nome = nome;
        this.genero = genero;
        this.autore = autore;
        System.out.println("O livro foi registrado com todos os atributos");
    }
}
