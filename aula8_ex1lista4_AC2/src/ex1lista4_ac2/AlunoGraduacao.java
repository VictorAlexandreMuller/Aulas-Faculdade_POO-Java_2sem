package ex1lista4_ac2;

public class AlunoGraduacao extends Aluno {
    private String anoConclusaoEnsinoMedio;

    public AlunoGraduacao() {
    }

    public AlunoGraduacao(String anoConclusaoEnsinoMedio, String ra, String nome, String curso) {
        super(ra, nome, curso);
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }

    public String getAnoConclusaoEnsinoMedio() {
        return anoConclusaoEnsinoMedio;
    }

    public void setAnoConclusaoEnsinoMedio(String anoConclusaoEnsinoMedio) {
        this.anoConclusaoEnsinoMedio = anoConclusaoEnsinoMedio;
    }
    
    @Override
    public String toString() {
        return "Aluno de Graduação: " + "\n" +
                "\nRA: " + getRa() + 
                "\nNome: " + getNome() +
                "\nCurso: " + getCurso() +
                "\nConcluiu o Ensino Médio em: " + anoConclusaoEnsinoMedio;
    }
    
}
