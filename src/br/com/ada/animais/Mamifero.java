package br.com.ada.animais;

public class Mamifero extends Animal{

    @Override
    public void alimentarSe(String alimento){
        System.out.printf("Mamifero alimentado-se de %s", alimento);
    }

    public void mamar(){
        System.out.println("mamando");
    }


}
