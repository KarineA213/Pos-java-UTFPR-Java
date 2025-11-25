package com.atividade3;

import com.atividade3.Exceptions.VelocException;

import java.util.Scanner;

public class Teste {
    private static int contadorPasseio = 0;
    private static int contadorCarga = 0;
    private static Leitura leitura = new Leitura();

    private static Passeio[] passeio = new Passeio[5];
    private static Carga[] carga = new Carga[5];

    public static void main(String[] args) {

        int opcao;

        do {
            System.out.println("======= MENU DE VEÍCULOS =======");
            System.out.println("1 - Cadastrar Veículo de Passeio");
            System.out.println("2 - Cadastrar Veículo de Carga");
            System.out.println("3 - Imprimir todos os Veículos de Passeio");
            System.out.println("4 - Imprimir todos os Veículos de Carga");
            System.out.println("5 - Buscar Veículo de Passeio pela placa");
            System.out.println("6 - Buscar Veículo de Carga pela placa");
            System.out.println("7 - Sair");
            System.out.println("=============================");

            opcao = Integer.parseInt(leitura.entDados("Escolha uma opção: "));

            switch (opcao) {
                case 1: cadastrarVPasseio();
                break;
                case 2: cadastrarVCarga();
                break;
                case 3: mostrarCarga();
                break;
                case 4: mostrarPasseio();
                break;
                case 5: buscarPlacaPasseio();
                break;
                case 6:buscarPlacaCarga();
                break;
                case 7: System.out.println("Encerrando o programa...");
                break;
//                default -> System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 7);
    }


    //cadastros
    private static void cadastrarVPasseio() {
        if (contadorPasseio >= passeio.length) {
            System.out.println(" Não há espaço para mais veículos de passeio!");
            return;
        }

        String placa = leitura.entDados("Placa: ");
        String marca = leitura.entDados("Marca: ");
        String modelo = leitura.entDados("Modelo: ");
        String cor = leitura.entDados("Cor: ");
        float velocMax = Float.parseFloat(leitura.entDados("Velocidade máxima (km/h): "));
        int qtdRodas = Integer.parseInt(leitura.entDados("Quantidade de rodas: "));
        int qtdPist = Integer.parseInt(leitura.entDados("Quantidade de pistões: "));
        int potencia = Integer.parseInt(leitura.entDados("Potência do motor: "));
        int qntPassageiros = Integer.parseInt(leitura.entDados("Quantidade de passageiros: "));

        try {
            if (velocMax > 100) {
                throw new VelocException("Velocidade maior que a permitida no Brasil");
            }
            passeio[contadorPasseio] = new Passeio(placa, marca, modelo, cor, velocMax, qtdRodas, new Motor(qtdPist, potencia), qntPassageiros);
            contadorPasseio++;
        } catch (VelocException e) {
            System.out.println(" Veiculo com velocidade máxima acima do permitido para o Brasil");
        }
    }


    private static void cadastrarVCarga() {


           if (contadorCarga >= carga.length) {
               System.out.println(" Não há espaço para mais veículos de carga!");
               return;
           }


           String placa = leitura.entDados("Placa: ");
           String marca = leitura.entDados("Marca: ");
           String modelo = leitura.entDados("Modelo: ");
           String cor = leitura.entDados("Cor: ");
           float velocMax = Float.parseFloat(leitura.entDados("Velocidade máxima (km/h): "));
           int qtdRodas = Integer.parseInt(leitura.entDados("Quantidade de rodas: "));
           int qtdPist = Integer.parseInt(leitura.entDados("Quantidade de pistões: "));
           int potencia = Integer.parseInt(leitura.entDados("Potência do motor: "));
           int cargaMax = Integer.parseInt(leitura.entDados("Carga máxima (kg): "));
           int tara = Integer.parseInt(leitura.entDados("Tara (kg): "));


            try {

                if (velocMax > 90){
                    throw new VelocException("Velocidade maior que a permitida ");
                }


                carga[contadorCarga] = new Carga(placa, marca, modelo, cor, velocMax, qtdRodas, new Motor(qtdPist, potencia), cargaMax, tara);
                contadorCarga++;

                System.out.println("Veículo de carga cadastrado com sucesso!");
            }catch (VelocException e){

                System.out.println("Veiculo com velocidade máxima acima do permitido para o Brasil");
            }

            private static boolean veiculoExistePasseio(String veiculo){
            for (Passeio veiculo : bdVeiculos.getLista) {

                if (listaPasseio[i].get) {
                    return true;
                }

                return false;

            }
        }
    }

    //MOSTRANDO OS VEÍCULOS
    private static void mostrarCarga() {
        if (contadorCarga <= 0) {

            System.out.println("nenhum veículo de carga encontrado");
        }else{
            System.out.println("========LISTA DE VEICULO DE CARGA=========");
            for (int i = 0; i < contadorCarga; i++){
                System.out.println(carga[i].toString());
            }
        }
    }

    private static void mostrarPasseio() {
        if (contadorPasseio <= 0) {
            System.out.println("nenhum veículo de  passeio encontrado");
        }else {
            System.out.println("====LISTA DE VEICULO DE PASSEIO====");
            for (int i = 0; i < contadorPasseio; i++){
                System.out.println(passeio[i].toString());
            }
        }
    }

    //BUSCAR VEÍCULOS PELA PLACA
    private static void buscarPlacaPasseio() {
        String placa = leitura.entDados("Placa: ");
        boolean encontrado = false;

        for (int i = 0; i < contadorPasseio; i++){
            if (placa.equals(passeio[i].getPlaca())){
                System.out.println("veículo encontrado: ");
                System.out.println(placa);
                encontrado = true;
                break;
            }
        }

        if (!encontrado){
            System.out.println("veículo não encontrado");
        }
    }

    private static void buscarPlacaCarga() {
       String placa = leitura.entDados("Placa: ");
       boolean encontrado = false;
        for (int i = 0; i < contadorPasseio; i++) {
            if (placa.equals(carga[i].getPlaca())) {
                System.out.println("veiculo encontrado: ");
                System.out.println(placa);
                encontrado = true;
                break;


            }
        }
    }

}
