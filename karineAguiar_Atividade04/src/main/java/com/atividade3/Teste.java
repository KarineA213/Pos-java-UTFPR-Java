package com.atividade3;


import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Veiculo[] v = new Veiculo[10];


        Passeio[] passeio  = new Passeio[5];
        passeio[0] = new Passeio("ABC1234", "Fiat", "Uno", "Vermelho", 180, 4, new Motor(4, 100), 5);
        passeio[1] = new Passeio("DEF5678", "VW", "Gol", "Branco", 190, 4, new Motor(4, 120),4);
        passeio[2] = new Passeio("GHI9012", "Chevrolet", "Onix", "Preto", 200, 4, new Motor(4, 130),5);
        passeio[3] = new Passeio("JKL3456", "Honda", "Civic", "Cinza", 210, 4, new Motor(6, 150),5);
        passeio[4] = new Passeio("MNO7890", "Toyota", "Corolla", "Prata", 200, 4, new Motor(6, 160),7);


        System.out.println("Veículos de passeio cadastrados com velocidade em m/h: ");
        for (Passeio p : passeio ) {
            System.out.println(p.toString());
            System.out.println("velocidade em m/h: " + p.calcVel(p.getVelocMax()));

        }

        Carga[] carga = new Carga[5];

        carga[0] = new Carga("AAA1111", "Mercedes", "Axor", "Branco", 120, 6, new Motor(8, 400), 10000, 20000);
        carga[1] = new Carga("BBB2222", "Volvo", "FH", "Preto", 110, 8, new Motor(8, 450), 12000, 25000);
        carga[2] = new Carga("CCC3333", "Scania", "R440", "Azul", 115, 8, new Motor(8, 440), 15000, 30000);
        carga[3] = new Carga("DDD4444", "Iveco", "Stralis", "Vermelho", 100, 8, new Motor(8, 380), 13000, 28000);
        carga[4] = new Carga("EEE5555", "MAN", "TGX", "Cinza", 105, 8, new Motor(8, 420), 14000, 29000);


        System.out.println("Veículos de carga cadastrados com velocidade em cm/h: ");
        for (Carga c : carga ) {
            System.out.println(c.toString());
            System.out.println("velocidade em cm/h: " + c.calcVel(c.getVelocMax()));
        }






    }
}
