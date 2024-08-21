package com.ufcg.psoft.mercadofacil.dto;

import com.ufcg.psoft.mercadofacil.model.Produto;

import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

public class LoteDTO {

    private Long id;
    @OneToOne
    private Produto produto;
    @ManyToOne
    private int numeroDeItens;

    public Long getId() {
        return id;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getNumeroDeItens() {
        return numeroDeItens;
    }
}
