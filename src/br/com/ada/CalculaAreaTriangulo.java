package br.com.ada;

/*
    A = raizquadrada de (S*(S-a)*(S-b)*(S-c))
    sendo que S = (a + b + c)/2
 */

public class CalculaAreaTriangulo {



    public static void main(String[] args){


        Double xCatetoOposto;
        Double xCatetoAdjacente;
        Double xBase;
        Double semiPerimetro;
        Double yCatetoOposto, yCatetoAdjacente, yBase;

        xCatetoAdjacente = 3.00;
        xCatetoOposto = 4.00;
        xBase = 5.00;

        yCatetoOposto = 3.00;
        yCatetoAdjacente = 4.00;
        yBase = 8.00;

        semiPerimetro = (xCatetoOposto + xCatetoAdjacente + xBase) / 2;
        Double areaX = Math.sqrt(semiPerimetro
                * (semiPerimetro-xCatetoOposto)
                * (semiPerimetro -xCatetoAdjacente)
                * (semiPerimetro - xBase));

        semiPerimetro = (yCatetoOposto + yCatetoAdjacente + yBase) / 2;
        Double areaY = Math.sqrt(semiPerimetro
                * (semiPerimetro-xCatetoOposto)
                * (semiPerimetro -xCatetoAdjacente)
                * (semiPerimetro - xBase));

        if (areaX > areaY){
            System.out.println("triangulo X é maior");
        }else if (areaY > areaX){
            System.out.println("triangulo Y é maior");
        }else {
            System.out.println("iguais");
        }

    }



}
