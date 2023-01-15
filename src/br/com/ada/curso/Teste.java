package br.com.ada.curso;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Teste {

    public static void main(String[] args) {


        Turma poloTech925 = new Turma();

        poloTech925.setNome("925 Polo Tech");

        Aluno georg = new Aluno();
        georg.setNome("Georg");
        georg.setRepetente(Boolean.FALSE);
        georg.setNota(10d);

        Aluno livia = new Aluno();
        livia.setNome("Livia");
        livia.setRepetente(Boolean.FALSE);
        livia.setNota(10d);

        Aluno marcus = new Aluno();
        marcus.setNome("Marcus");
        marcus.setRepetente(Boolean.FALSE);
        marcus.setNota(10d);

        Aluno fernanda = new Aluno();
        fernanda.setNome("Fernanda");
        fernanda.setRepetente(Boolean.FALSE);
        fernanda.setNota(10d);

        Aluno yuri = new Aluno();
        yuri.setNome("Yuri");
        yuri.setRepetente(Boolean.FALSE);
        yuri.setNota(10d);

        Aluno pablo = new Aluno();
        pablo.setNome("Pablo");
        pablo.setRepetente(Boolean.FALSE);
        pablo.setNota(10d);

        Aluno gabriel = new Aluno();
        gabriel.setNome("Gabriel");
        gabriel.setRepetente(Boolean.FALSE);
        gabriel.setNota(4d);

        Aluno alex = new Aluno();
        alex.setNome("Alex");
        alex.setRepetente(Boolean.TRUE);
        alex.setNota(3d);

        poloTech925.getAlunos().add(gabriel);
        poloTech925.getAlunos().add(pablo);
        poloTech925.getAlunos().add(yuri);
        poloTech925.getAlunos().add(alex);

        for (int i = 0; i < poloTech925.getAlunos().size(); i++){
            System.out.println(poloTech925.getAlunos().get(i).getNome());
        }

//        for (Aluno aluno: poloTech925.getAlunos()) {
//            System.out.println(aluno.getNome());
//        }

//        poloTech925.getAlunos()
//                .forEach(aluno -> System.out.println(aluno.getNome()));
//
        List<Professor> professores = poloTech925.getAlunos().stream()
                .map(aluno -> new Professor(aluno.getNome()))
                .collect(Collectors.toList());

        poloTech925.getAlunos().stream()
                .filter(aluno -> aluno.getNota() == 10)
                .map(aluno -> new Professor(aluno.getNome()))
                .collect(Collectors.toList());

        List<Aluno> reprovados = poloTech925.getAlunos()
                .stream().filter(aluno -> aluno.getNota() < 7 && aluno.getRepetente())
                .collect(Collectors.toList());

        List<Aluno> reprovadosII = poloTech925.getAlunos().stream()
                .filter(aluno -> aluno.getNota() < 7 && aluno.getRepetente())
                .collect(Collectors.toList());


        poloTech925.getAlunos()
                .stream().map(Aluno::getNome).forEach(System.out::println);

















        poloTech925.getClass();
//        poloTech925.setAlunos(turma2);
//        poloTech925.setAlunos(new Aluno[3]);
//        poloTech925.getAlunos()[0] = new Aluno();
//        poloTech925.getAlunos()[1] = new Aluno();
//        poloTech925.getAlunos()[2] = new Aluno();
//        poloTech925.setAlunos(new Aluno[10]);
//        Aluno[] turma1 = new Aluno[4];
//        turma1[0] = georg;
//        turma1[1] = livia;
//        turma1[2] = marcus;
//
//        Aluno[] turma2 = new Aluno[4];
//        turma2[0] = fernanda;
//        turma2[1] = yuri;
//        turma2[2] = pablo;
//        turma2[3] = gabriel;


    }

}
