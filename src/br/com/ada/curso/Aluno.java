package br.com.ada.curso;

public class Aluno {

    private String nome;
    private Double nota;
    private String matricula;
    private String curso;
    private Boolean repetente;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Boolean getRepetente() {
        return repetente;
    }

    public void setRepetente(Boolean repetente) {
        this.repetente = repetente;
    }
}
