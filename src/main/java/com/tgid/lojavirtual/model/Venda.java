package com.tgid.lojavirtual.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Usuario cliente;
    private List<ItemVenda> itens = new ArrayList<>();
    private LocalDateTime dataHora;

    public Venda(Usuario cliente) {
        this.cliente = cliente;
        this.dataHora = LocalDateTime.now();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        if (!produto.temEstoque(quantidade)) {
            throw new IllegalArgumentException("Produto sem estoque suficiente.");
        }
        produto.reduzirEstoque(quantidade);
        itens.add(new ItemVenda(produto, quantidade));
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(ItemVenda::getSubtotal).sum();
    }

    public Usuario getCliente() { return cliente; }
    public List<ItemVenda> getItens() { return itens; }

    @Override
    public String toString() {
        DateTimeFormatter formatterData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");

        StringBuilder sb = new StringBuilder();
        sb.append("=========================\n");
        sb.append("Cliente: ").append(cliente.getNome()).append("\n");
        sb.append("Data: ").append(dataHora.format(formatterData)).append("\n");
        sb.append("Hora: ").append(dataHora.format(formatterHora)).append("\n");
        sb.append("Itens:\n");
        for (ItemVenda item : itens) {
            sb.append("- ").append(item).append("\n");
        }
        sb.append("Total: R$").append(calcularTotal()).append("\n");
        return sb.toString();
    }

}
