package br.com.ada.formas;

public class Triangulo {

    private Double catetoOposto;
    private Double catetoAdjacente;
    private Double base;

    // getters and setters

    public Double getCatetoOposto() {
        return catetoOposto;
    }

    public void setCatetoOposto(Double catetoOposto) {
        this.catetoOposto = catetoOposto;
    }

    public Double getCatetoAdjacente() {
        return catetoAdjacente;
    }

    public void setCatetoAdjacente(Double catetoAdjacente) {
        this.catetoAdjacente = catetoAdjacente;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

//    public Triangulo(Double catetoOposto, Double catetoAdjacente, Double base){
//        this.catetoOposto = catetoOposto;
//        this.catetoAdjacente = catetoAdjacente;
//        this.base = base;
//    }

//    public Triangulo(){
//        this.catetoOposto = 5.00;
//        this.catetoAdjacente = 5.00;
//        this.base = 5.00;
//    }

    private Double calculaSemiPerimetro(){
        return (this.catetoAdjacente + this.catetoOposto + this.base)/2;
    }

    public Double calculaArea(){

        return Math.sqrt(calculaSemiPerimetro()
                * (calculaSemiPerimetro() - this.catetoOposto)
                * (calculaSemiPerimetro() - this.catetoAdjacente)
                * (calculaSemiPerimetro() - this.base));
    }

    public static String mensagemComparaTriangulos(Triangulo t1, Triangulo t2){

        if (t1.calculaArea() > t2.calculaArea()){
            return "triangulo 1 maior que triangulo 2";
        }else if (t2.calculaArea() > t1.calculaArea()){
            return "triangulo 2 maior que triangulo 1";
        }else {
            return "Os triangulos são do mesmo tamanho";
        }
    }

}
