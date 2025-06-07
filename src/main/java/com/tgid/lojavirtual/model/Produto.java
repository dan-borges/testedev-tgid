package com.tgid.lojavirtual.model;

import java.util.UUID;

public class Produto {
    private final String id;
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getQuantidade() { return quantidade; }

    public boolean temEstoque(int qtd) {
        return this.quantidade >= qtd;
    }

    public void reduzirEstoque(int qtd) {
        if (temEstoque(qtd)) {
            this.quantidade -= qtd;
        } else {
            throw new IllegalArgumentException("Estoque insuficiente para o produto " + nome);
        }
    }

    @Override
    public String toString() {
        return nome + " - R$" + preco + " (Estoque: " + quantidade + ")";
    }
}
