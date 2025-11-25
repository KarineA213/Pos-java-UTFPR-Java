package com.atividade3;

public abstract class Veiculo {


        private String placa;
        private String marca;
        private String modelo;
        private String cor;
        private float velocMax;
        private int qntRodas;
        private Motor motor;


        public Veiculo() {
            this.placa = "";
            this.marca = "";
            this.modelo = "";
            this.cor = "";
            this.velocMax = 0;
            this.qntRodas = 0;
            this.motor = new Motor(0,0);
        }

        public Veiculo(String placa, String marca, String modelo, String cor, float velocMax, int qntRodas, int qtdPist, int potencia) {
            this.placa = placa;
            this.marca = marca;
            this.modelo = modelo;
            this.cor = cor;
            this.velocMax = velocMax;
            this.qntRodas = qntRodas;
            this.motor = new Motor(qtdPist,potencia);
        }

        @Override
        public String toString() {
            return "Veiculo {  " +
                    "placa ='" + placa + '\'' +
                    ", marca = '" + marca + '\'' +
                    ", modelo ='" + modelo + '\'' +
                    ", cor='" + cor + '\'' +
                    ", velocMax =" + velocMax +
                    ", qntRodas =" + qntRodas +
                    ", potencia" + motor.getPotencia() +
                    ", qntPist:" +  motor.getQtdPist() +
                    '}';
        }

        public String getPlaca() {
            return placa;
        }

        public void setPlaca(String placa) {
            this.placa = placa;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public String getCor() {
            return cor;
        }

        public void setCor(String cor) {
            this.cor = cor;
        }

        public float getVelocMax() {
            return velocMax;
        }

        public void setVelocMax(float velocMax) {
            this.velocMax = velocMax;
        }

        public int getQntRodas() {
            return qntRodas;
        }

        public void setQntRodas(int qntRodas) {
            this.qntRodas = qntRodas;
        }

        public Motor getMotor() {
            return motor;
        }

        public void setMotor(Motor motor) {
            this.motor = motor;
        }

        public abstract float calcVel (float velocMax);
}

