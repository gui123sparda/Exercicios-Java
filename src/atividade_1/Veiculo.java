package atividade_1;

public class Veiculo {
    private String placa;
    private String marca;
    private String modelo;
    private String cor;
    private Float velocidadeMaxima;
    private Integer qtdRodas;
    private Motor motor;

    public Veiculo(){
        placa = "";
        marca = "";
        modelo= "";
        cor = "";
        velocidadeMaxima = 0f;
        qtdRodas=0;
        motor = new Motor();
    }

    public String getPlaca(){
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;

    }
    public Float getVelocidadeMaxima(){
        return velocidadeMaxima;
    }
    public void setVelocidadeMaxima(Float velocidadeMaxima){
        this.velocidadeMaxima = velocidadeMaxima;
    }
    public Integer getQtdRodas(){
        return qtdRodas;
    }
    public void setQtdRodas(Integer qtdRodas){
        this.qtdRodas = qtdRodas;
    }
    public Motor getMotor(){
        return motor;
    }
    public void setMotor(Motor motor){
        this.motor = motor;
    }

    public void ImprimeVeiculo(){
        System.out.println(getMarca());
        System.out.println(getModelo());
        System.out.println(getCor());
        System.out.println(getPlaca());
        System.out.println(getVelocidadeMaxima()+"KM/h");
        System.out.println(getQtdRodas()+"Rodas");
        System.out.println(getMotor().GetQuantidadePistoes()+" Cilindros ");
        System.out.println(getMotor().GetPotencia()+ " CV ");
    }

}
