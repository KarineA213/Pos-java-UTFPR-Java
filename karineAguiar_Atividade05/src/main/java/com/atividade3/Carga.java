package com.atividade3;

public final class Carga extends Veiculo implements Calcular {

    private int cargaMax;
    private int tara;


    public Carga(String placa, String marca, String modelo, String cor, float velocMax, int qntRodas, Motor motor, int cargaMax, int tara) {
        super(placa, marca, modelo, cor, velocMax, qntRodas, motor.getQtdPist(), motor.getPotencia());
        this.cargaMax = cargaMax;
        this.tara = tara;

    }


    public Carga() {
        super();
        this.cargaMax = 0;
        this.tara = 0;
    }

    @Override
    public float calcVel(float velocMax) {
        return 0;
    }


    @Override
    public double calcularVelocidade() {
        return getVelocMax()*100000f;
    }



    public int getCargaMax() {
        return cargaMax;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

}

