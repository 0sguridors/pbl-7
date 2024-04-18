abstract class ItemBibliotecaDigital {
    String titulo;
    String autor;

    ItemBibliotecaDigital(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    abstract String descricao();
}

interface Baixavel {
    void baixar();
}

interface Visualizavel {
    void visualizar();
}

class Ebook extends ItemBibliotecaDigital implements Baixavel {
    Ebook(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    String descricao() {
        return "Ebook: " + titulo + ", Autor: " + autor;
    }

    @Override
    public void baixar() {
        System.out.println("Baixando o ebook: " + titulo);
    }
}

class VideoDigital extends ItemBibliotecaDigital implements Baixavel, Visualizavel {
    VideoDigital(String titulo, String autor) {
        super(titulo, autor);
    }

    @Override
    String descricao() {
        return "Vídeo Digital: " + titulo + ", Autor: " + autor;
    }

    @Override
    public void baixar() {
        System.out.println("Baixando o vídeo: " + titulo);
    }

    @Override
    public void visualizar() {
        System.out.println("Visualizando o vídeo: " + titulo);
    }
}
 
public class Main {
    public static void main(String[] args) {
        Ebook ebook = new Ebook("O Senhor dos Anéis", "J. R. R. Tolkien");
        VideoDigital video = new VideoDigital("A Jornada do Anel", "Peter Jackson");

        System.out.println(ebook.descricao());
        ebook.baixar();

        System.out.println(video.descricao());
        video.baixar();
        video.visualizar();
    }
}
