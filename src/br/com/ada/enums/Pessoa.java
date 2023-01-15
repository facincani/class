package br.com.ada.enums;

public class Pessoa {

    private String nome;
    private Integer idade;
    private Genero genero;

    enum Genero{
        FEMININO('F'), MASCULINO('M');

        private char sigla;

        Genero(char sigla){
            this.sigla = sigla;
        }

    }

}
