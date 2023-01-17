package com.ada.example.monitoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Estoque {

    private static final List<Livro> livroList = new ArrayList<>();

    public static void cadastrarLivro(String nome, String autor, int quantidade){
        livroList.add(new Livro(nome, autor, quantidade));
    }
    public static void listarLivro(){

        livroList.forEach(System.out::println);
        //System.out.println(List.of(livroList));
    }
}
