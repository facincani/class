package br.com.ada.animais;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Teste {

    public static void main(String[] args) {


        Set<String> set = new HashSet<>();
        set.add("Alex");
        set.add("Yuri");
        set.add("Alex");

        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(1, "Alex");
        mapa.put(5, "Yuri");

        mapa.forEach((key, valeu) -> {
            System.out.print("chave = " + key + " ");
            System.out.println("valor = " + valeu);
        });

//        Animal mf =  new Mamifero();
//        mf.alimentarSe("cenora");
//        System.out.println();
//        Animal pr = new Primata();
//        pr.alimentarSe("noz");

        Animal mf =  new Mamifero();
        recebeAnimal(mf);
        System.out.println();
        Animal pr = new Primata();
        recebeAnimal(pr);

    }

    public static void recebeAnimal(Animal animal){
        ((Mamifero) animal).mamar();
    }

}
