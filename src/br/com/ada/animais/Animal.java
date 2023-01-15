package br.com.ada.animais;

public abstract class Animal {

    public Integer tamanho;

    public void alimentarSe(String alimento){
        System.out.printf("Animal alimentado-se de %s", alimento);
    }

}
