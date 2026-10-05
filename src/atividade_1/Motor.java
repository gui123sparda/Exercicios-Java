package atividade_1;

public class Motor {
    private Integer qtdPistoes;
    private Integer potencia;

    public Motor(){
        this.qtdPistoes = 0;
        this.potencia = 0;
    }


    public Integer GetQuantidadePistoes(){
        return qtdPistoes;
    }

    public Integer GetPotencia(){
        return potencia;
    }

    public void SetQuantidadePistoes(Integer qtdPistoes){
        this.qtdPistoes = qtdPistoes;
    }

    public void SetPotencia(Integer potencia){
        this.potencia = potencia;
    }
};
