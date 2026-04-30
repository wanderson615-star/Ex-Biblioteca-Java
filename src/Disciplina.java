public class Disciplina {
    private String nome;
    private double nota;
    public Disciplina(){
    }
    public Disciplina(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public double getNotaFinal() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

}
