package com.tgid.lojavirtual;

import com.tgid.lojavirtual.model.Produto;
import com.tgid.lojavirtual.model.Usuario;
import com.tgid.lojavirtual.service.LojaService;
import com.tgid.lojavirtual.util.SimuladorBanco;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Usuario> usuarios = SimuladorBanco.criarUsuarios();
        List<Produto> produtos = SimuladorBanco.criarProdutos();

        LojaService loja = new LojaService();

        loja.realizarVenda(usuarios.get(0), produtos.get(0), 2); // Ana compra 2 Camisas
        loja.realizarVenda(usuarios.get(1), produtos.get(1), 1); // Carlos compra 1 Calça
        loja.realizarVenda(usuarios.get(1), produtos.get(2), 1); // Carlos compra 1 Tênis

        loja.exibirResumo(produtos);
    }
}
