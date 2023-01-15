package br.com.ada.animais;

public class Primata extends Animal{

    @Override
    public void alimentarSe(String alimento){
        System.out.printf("Primata alimentado-se de %s", alimento);
    }

}
