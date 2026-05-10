public class Livro {
    private String titulo;
    private Autor autor;
    private boolean disponivel = true;

    public Livro(String titulo, Autor autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public Autor getAutor() {
        return this.autor;
    }

    public boolean isDisponivel() {
        return this.disponivel;
    }

    public void setDisponivel(boolean status) {
        this.disponivel = status;
    }

    public void reservar(Aluno aluno) {
        if (this.disponivel) {
            this.setDisponivel(false);
            System.out.println("Livro '" + this.titulo + "' reservado para: " + aluno.getNome());
        } else {
            System.out.println("O livro '" + this.titulo + "' já está ocupado.");
        }
    }

    public void devolver() {
        this.setDisponivel(true);
        System.out.println("Livro '" + this.titulo + "' devolvido com sucesso.");
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor.getNome() +
                ", disponivel=" + disponivel +
                '}';
    }
}
