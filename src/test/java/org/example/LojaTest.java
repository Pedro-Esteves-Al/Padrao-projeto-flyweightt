package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LojaTest {
    Loja loja = new Loja();
    @BeforeEach
    void setUp() {
        loja.cadastrar("gpu", "kabum");
        loja.cadastrar("cpu", "Amazon");
        loja.cadastrar("ram", "kabum");
    }

    @Test
    void deveRetornarProdutos() {

        List<String> saida = Arrays.asList(
                "Produto{tipo='gpu', fornecedor='kabum}",
                "Produto{tipo='cpu', fornecedor='Amazon}",
                "Produto{tipo='ram', fornecedor='kabum}"
        );
        assertEquals(saida, loja.obterProdutos());

    }
    @Test
    void deveRetornarTotalDeFornecedores() {
        assertEquals(2,FornecedorFactory.getTotalFornecedores());
    }

}