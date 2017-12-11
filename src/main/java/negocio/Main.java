/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Scanner;

/**
 *
 * @author 20141D12GR0149
 */
public class Main {
    
    private static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        
        System.out.println("Escreva seu nome, você será X");
        String nome1 = sc.next();
        Jogador jogador1 = new Jogador(nome1);
        
        System.out.println("Escreva seu nome, você será O");
        String nome2 = sc.next();
        Jogador jogador2 = new Jogador(nome2);

        Jogadas jogo = new Jogadas();
        Tabuleiro tab = new Tabuleiro();

        tab.construir();
        Scanner sc = new Scanner(System.in);
        String posicao;
        int valida = 0, //enquanto estiver 0 a jogada n é valida
            jogadas = 0; //contador das jogadas

        while (true) {
            System.out.println("Jogo da velha");
            tab.mostrarPosicoes();
            do {
                System.out.print(nome1 + " informe uma posicao: ");
                posicao = sc.next();
                while (!jogo.validar(posicao, tab)) {
                    System.out.println("Jogada invalida");
                    System.out.print(nome1 + " informe uma posicao: ");
                    posicao = sc.next();
                    valida = 0;
                }
                jogo.fazerJogadaX(posicao, tab);
                valida = 1;

            } while (valida == 0);//fim jog 1

            jogadas++;
            valida = 0;
            tab.mostrarPosicoes();
            if (!jogo.ganhar(jogadas, tab).equals("null")) {
                break;
            }

            do {
                System.out.print(nome2 + " informe uma posicao: ");
                posicao = sc.next();
                while (!jogo.validar(posicao, tab)) {
                    System.out.println("Jogada invalida");
                    System.out.print(nome2 + " informe uma posicao: ");
                    posicao = sc.next();
                    valida = 0;
                }
                jogo.fazerJogadaO(posicao, tab);
                valida = 1;

            } while (valida == 0);

            jogadas++;
            valida = 0;
            tab.mostrarPosicoes();
            if (!jogo.ganhar(jogadas, tab).equals("null")) {
                break;
            }
        }

        System.out.println("O " + jogo.ganhar(jogadas, tab) + " venceu!");
    }
}
