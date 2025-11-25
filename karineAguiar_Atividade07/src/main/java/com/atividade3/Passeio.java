package com.atividade3;

public final class Passeio extends Veiculo implements Calcular{

    private int qtdPassageiros;

    public Passeio() {
        super();
        this.qtdPassageiros = 0;
    }

    public Passeio(String placa, String marca, String modelo, String cor, float velocMax, int qntRodas, Motor motor, int qtdPassageiros) {
        super(placa, marca, modelo, cor, velocMax, qntRodas, motor.getQtdPist(), motor.getPotencia());
        this.qtdPassageiros = qtdPassageiros;
    }


    @Override
    public float calcVel(float velocMax) {
        return getVelocMax()*1000 ;
    }


    @Override
    public double calcularVelocidade() {
        return 0;
    }


    public int getQtdPassageiros() {
        return qtdPassageiros;
    }

    public void setQtdPassageiros(int qtdPassageiros) {
        qtdPassageiros = qtdPassageiros;
    }

}
