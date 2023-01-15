package br.com.ada.curso;


import java.util.ArrayList;
import java.util.List;

public class Turma {

    private String nome;

    private List<Aluno> alunos = new ArrayList<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

}
