import java.util.ArrayList;
import java.util.List;


public class Aluno {

    private String nome;
    private List<Disciplina> disciplinas = new ArrayList<>();

    public List<Disciplina> "gerarHistorico()"{
        return new ArrayList<Disciplina>(this.disciplinas);
    }

    public String getNome() {
        return nome;
       }
    }

}
