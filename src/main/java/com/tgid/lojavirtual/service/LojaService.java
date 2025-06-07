package com.tgid.lojavirtual.service;

import com.tgid.lojavirtual.model.Produto;
import com.tgid.lojavirtual.model.Usuario;
import com.tgid.lojavirtual.model.Venda;

import java.util.ArrayList;
import java.util.List;

public class LojaService {

    private List<Venda> vendas = new ArrayList<>();

    public Venda realizarVenda(Usuario usuario, Produto produto, int quantidade) {
        Venda venda = new Venda(usuario);
        venda.adicionarItem(produto, quantidade);
        vendas.add(venda);
        return venda;
    }

    public void exibirResumo(List<Produto> produtos) {
        System.out.println("===== RESUMO DE VENDAS =====");
        for (Venda venda : vendas) {
            System.out.println(venda);
        }

        System.out.println("========= ESTOQUE ATUAL =========");
        for (Produto p : produtos) {
            System.out.println(p);
        }
    }
}
