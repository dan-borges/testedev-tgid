package com.tgid.lojavirtual.model;

import java.util.UUID;

public class Usuario {
    private final String id;
    private String nome;
    private String cpf;
    private String email;

    public Usuario(String nome, String cpf, String email) {
        this.id = UUID.randomUUID().toString();
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getId() { return id; }
    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public String getEmail() { return email; }

    @Override
    public String toString() {
        return nome + " (CPF: " + cpf + ", Email: " + email + ")";
    }
}
