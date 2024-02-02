package com.geral.apigeral.service;

import com.geral.apigeral.exception.ProdutoNaoEncotradoException;
import com.geral.apigeral.model.Produto;
import com.geral.apigeral.repository.ProdutoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class ProdutoService {

    @Service
    public class CadastroProdutoService {

        @Autowired
        private ProdutoRepository produtoRepository;

        @Transactional
        public Produto salvar(Produto produto) {
            return produtoRepository.save(produto);
        }

      //  public Produto buscarOuFalhar(Long produtoId) {
      //      return produtoRepository.findById(produtoId)
                  //  .orElseThrow(() -> new ProdutoNaoEncotradoException(produtoId));
      //  }

    }}
