import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    private Autor autor;
    private boolean disponivel = true;

    public Livro(String titulo, Autor autor){
        this.titulo = titulo;
        this.autor = autor;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public Autor getAutor(){
        return this.autor;
    }
    public void setDisponivel(boolean status) {
        this.disponivel = status;
    }
    public void reservar(Aluno aluno) {
        if (this.disponivel) {
            this.setDisponivel(false);
            System.out.println("Livro reservado para: " + aluno.getNome());
        } else{
            System.out.println("O livro já está ocupado.");
        }
    }
    public void devolver(){
        this.setDisponivel(true);
        System.out.println("Livro devolvido.");
    }
    static void main(){
    }
    public class Autor{
        private String nome;
        private String nacionalidade;
        private int anoNascimento;
        private String biografia;
        public Autor(String nome, String nacionalidade, int anoNascimento, String biografia) {
            this.nome = nome;
            this.nacionalidade = nacionalidade;
            this.anoNascimento = anoNascimento;
            this.biografia = biografia;
        }
        public String getNome(){
            return this.nome;
        }
        public String getBiografia(){
            return this.biografia;
        }
       import java.util.ArrayList;
         import java.util.List;
         public class Aluno {
            private String matricula;
            private String nome;
            private String email;
            private int anoIngresso;
            private Curso curso;
            private List<Disciplina> disciplinas;

            public Aluno(String matricula, String nome, String email, int anoIngresso, Curso curso) {
                this.matricula = matricula;
                this.nome = nome;
                this.email = email;
                this.anoIngresso = anoIngresso;
                this.curso = curso;
                this.disciplinas = new ArrayList<>();
            }
            public String getNome() {
                return this.nome;
            }
            public Curso getCurso() {
                return this.curso;
            }
            public void matricularDisciplina(Disciplina disc) {
                if (disc != null) {
                    this.disciplinas.add(disc);
                    System.out.println("Disciplina " + disc.getNome() + " adicionada com sucesso.");
                }
            }
            public double calcularCoeficiente() {
                if (disciplinas.isEmpty()){
                    return 0.0;
                }
                double somaNotas = 0.0;
                public void processar disciplinas {
                    for (Disciplina d : disciplinas) {
                        somaNotas += d.getNotaFinal();
                }
            }
            return somaNotas / disciplinas.size();
            }
            public List<Disciplina> gerarHistorico() {
                return new ArrayList<>(this.disciplinas);
            }
        }
