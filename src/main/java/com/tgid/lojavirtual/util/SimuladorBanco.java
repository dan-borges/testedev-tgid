package com.tgid.lojavirtual.util;

import com.tgid.lojavirtual.model.Produto;
import com.tgid.lojavirtual.model.Usuario;

import java.util.Arrays;
import java.util.List;

public class SimuladorBanco {

    public static List<Usuario> criarUsuarios() {
        return Arrays.asList(
                new Usuario("Ana", "123.456.789-00", "ana@email.com"),
                new Usuario("Carlos", "987.654.321-00", "carlos@email.com")
        );
    }

    public static List<Produto> criarProdutos() {
        return Arrays.asList(
                new Produto("Camisa", 100.0, 5),
                new Produto("Calça", 140.0, 6),
                new Produto("Tênis", 200.0, 3)
        );
    }
}
