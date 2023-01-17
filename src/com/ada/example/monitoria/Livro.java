package com.ada.example.monitoria;

public class Livro {

    private String nome;
    private String autor;
    private int quantidade;

    public Livro(String nome, String autor, int quantidade) {
        this.nome = nome;
        this.autor = autor;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", autor='" + autor + '\'' +
                ", quantidade=" + quantidade +
                '}';
    }
}
