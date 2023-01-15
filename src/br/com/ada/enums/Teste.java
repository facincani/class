package br.com.ada.enums;


import java.util.Arrays;

public class Teste {

    public static void main(String[] args) {



        Arrays.stream(DiasDaSemanaEnum.values())
                .forEach(diaDaSemana -> {
                    System.out.println("O código de " + diaDaSemana + " é " + diaDaSemana.getCodigo());
                });


//        DiasDaSemana[] dias = DiasDaSemana.values();
//
//        for (int i = 0; i < dias.length; i++){
//            imprimeDiasDaSemana(dias[i]);
//        }

//        for (DiasDaSemana diasDaSemana: DiasDaSemana.values()) {
//            imprimeDiasDaSemana(diasDaSemana);
//        }

//        Arrays.stream(DiasDaSemana.values())
//                .forEach(Teste::imprimeDiasDaSemana);

    }

    public static void imprimeDiasDaSemana(DiasDaSemana dia){
        switch (dia){
            case SEGUNDA:
                System.out.println("Segunda feira");
                break;
            case TERCA:
                System.out.println("Terça feira");
                break;
            case QUARTA:
                System.out.println("Quarta feira");
                break;
            case QUINTA:
                System.out.println("Quinta feira");
                break;
            case SEXTA:
                System.out.println("Sexta feira");
                break;
            case SABADO:
                System.out.println("Sabado");
                break;
            case DOMINGO:
                System.out.println("Domingo");
                break;
        }
    }

    public static void imprimeDiasDaSemana(Integer dia){
        switch (dia){
            case 1:
                System.out.println("Segunda feira");
                break;
            case 2:
                System.out.println("Terça feira");
                break;
            case 3:
                System.out.println("Quarta feira");
                break;
            case 4:
                System.out.println("Quinta feira");
                break;
            case 5:
                System.out.println("Sexta feira");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
        }
    }



}
