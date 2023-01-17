package com.ada.example;

import com.ada.example.monitoria.Estoque;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //
        // MENU() {

        //1 cadastrarLivro
        //2- cadastrar brinquedo
        // 3- SAIR

        // DIGITE A OPCAO

        //   case 1: CADASTRARLIVROESTOQUE()
        // }
        //


        // FUNCAO CADASTRARLIVROESTOQUE()
        // CADASTRARBRINQUEDOESTOQUE()


        //doWhile
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do livro: ");
        String nomeLivro = scanner.nextLine();
        System.out.println("Digite o autor do livro: ");
        String autorLivro = scanner.nextLine();
        System.out.println("Digite a quantidade de livro: ");
        int quantidade = scanner.nextInt();

        Estoque.cadastrarLivro(nomeLivro, autorLivro, quantidade);
        //Estoque.cadastrarLivro("segundoLivro", "ns", 2);
        Estoque.listarLivro();
        //CONTINUAR?
        // Deseja cadatrar outro livro (S ou N)

    }

}


