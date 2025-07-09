package org.example;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Produto> produtos = new ArrayList<>();

    public void cadastrar(String tipoProduto, String nomeFornecedor) {
        Fornecedor fornecedor = FornecedorFactory.getFornecedor(nomeFornecedor);
        Produto produto = new Produto(tipoProduto, fornecedor);
        produtos.add(produto);
    }

    public List<String> obterProdutos() {
        List<String> saida = new ArrayList<String>();
        for (Produto produto : this.produtos) {
            saida.add(produto.obterProduto());
        }
        return saida;
    }
}
