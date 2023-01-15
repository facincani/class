package br.com.ada.enums;

public enum DiasDaSemanaEnum {

    SEGUNDA(1),TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);

    private Integer codigo;

    DiasDaSemanaEnum(Integer codigo){
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }
}
