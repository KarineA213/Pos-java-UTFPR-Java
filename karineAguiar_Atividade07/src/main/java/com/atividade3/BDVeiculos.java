package com.atividade3;

import java.util.List;

public class BDVeiculos {

    private Veiculo[] veiculos;

    public BDVeiculos(int capacidade) {
        this.veiculos = new Veiculo[capacidade];
    }


    public Veiculo[] getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(Veiculo[] veiculos) {
        this.veiculos = veiculos;
    }
}
