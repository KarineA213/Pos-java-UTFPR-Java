package com.atividade3;

import java.util.Scanner;

public class Leitura {
        private static Scanner sc = new Scanner(System.in);

        public static String entDados(String mensagem) {
            System.out.println(mensagem);
            return sc.next();
        }

}
