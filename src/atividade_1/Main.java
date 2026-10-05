package atividade_1;

public class Main {

    static void main(String[] args) {
        Veiculo veiculo1;
        veiculo1 = new Veiculo();
        veiculo1.setMarca("Ford");
        veiculo1.setModelo("Escort");
        veiculo1.setCor("cinza");
        veiculo1.setPlaca("XXX-0x00");
        veiculo1.setVelocidadeMaxima(220.00f);
        veiculo1.setQtdRodas(4);
        veiculo1.getMotor().SetQuantidadePistoes(4);
        veiculo1.getMotor().SetPotencia(130);

        veiculo1.ImprimeVeiculo();

    }


}
