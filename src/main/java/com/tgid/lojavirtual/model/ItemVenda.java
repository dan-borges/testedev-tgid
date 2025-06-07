package com.tgid.lojavirtual.model;

public class ItemVenda {
    private Produto produto;
    private int quantidade;

    public ItemVenda(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }

    public Produto getProduto() { return produto; }
    public int getQuantidade() { return quantidade; }

    @Override
    public String toString() {
        return quantidade + "x " + produto.getNome() + " - Subtotal: R$" + getSubtotal();
    }
}
