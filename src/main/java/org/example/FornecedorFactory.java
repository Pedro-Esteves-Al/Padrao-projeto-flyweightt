package org.example;

import java.util.HashMap;
import java.util.Map;

public class FornecedorFactory {
    private static Map<String, Fornecedor> fornecedores = new HashMap<>();

    public static Fornecedor getFornecedor(String nome) {
        Fornecedor fornecedor = fornecedores.get(nome);
        if (fornecedor == null) {
            fornecedor = new Fornecedor(nome);
            fornecedores.put(nome, fornecedor);
        }
        return fornecedor;
    }

    public static int getTotalFornecedores() {
        return fornecedores.size();
    }
}
