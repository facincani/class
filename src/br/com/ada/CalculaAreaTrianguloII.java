package br.com.ada;

import br.com.ada.formas.Triangulo;

import java.util.Scanner;

public class CalculaAreaTrianguloII {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as dimensões do triangulo:");
        Double cateto1 = sc.nextDouble();
        Double cateto2 = sc.nextDouble();
        Double base = sc.nextDouble();

//        Triangulo triangulo1 = new Triangulo(cateto1, cateto2, base);
        Triangulo triangulo1 = new Triangulo();
        Triangulo triangulo2 = new Triangulo();

        triangulo1.setCatetoOposto(cateto1);
        triangulo1.setCatetoAdjacente(cateto2);
        triangulo1.setBase(base);

        triangulo2.setCatetoOposto(5.00);
        triangulo2.setCatetoAdjacente(5.00);
        triangulo2.setBase(5.00);

        triangulo1.getCatetoOposto();

        System.out.println(
                Triangulo.mensagemComparaTriangulos(
                        triangulo1, triangulo2
                )
        );

    }

}
