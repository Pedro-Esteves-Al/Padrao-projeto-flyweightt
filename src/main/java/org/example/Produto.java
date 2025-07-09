package org.example;

public class Produto {
    private String tipo;
    private Fornecedor fornecedor;

    public Produto(String tipo, Fornecedor fornecedor) {
        this.tipo = tipo;
        this.fornecedor = fornecedor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String obterProduto() {
        return "Produto{" +
                "tipo='" + this.tipo + '\'' +
                ", fornecedor='" + fornecedor.getNome() +
                '}';
    }

}
