package com.ufcg.psoft.mercadofacil.unit;

import com.ufcg.psoft.mercadofacil.model.Produto;
import com.ufcg.psoft.mercadofacil.repository.ProdutoRepository;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class ProdutoRepositoryTests {

    private Produto produto;
    ProdutoRepository produtoRepository;

    @BeforeEach
    void setup() {
        produto = new Produto("batata","123456789","Seu Zé", 5.20);
        produtoRepository.save(produto);
    }

    @Test
    @DisplayName("Encontrar os produto na tabela")
    void listarProdutos(){
        produtoRepository.findAll();
    }
}
