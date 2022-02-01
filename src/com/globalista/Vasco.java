package com.globalista;

import java.util.Scanner;

public class Vasco {

    public static void main(String[] args) {

        Scanner time = new Scanner(System.in);
        while(true) {
            System.out.println("\n" + "Qual é o seu time?");
            if(time.next().equals("Vasco")) {
                break;
            } else {
                System.out.println("Ops! Parece que sua resposta não está certa..." + "\n" + "Tente novamente!");
                continue;
            }
        }

        System.out.println("Parabéns, resposta correta!");
    }
}
