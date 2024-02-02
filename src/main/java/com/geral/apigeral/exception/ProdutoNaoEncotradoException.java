package com.geral.apigeral.exception;

import static java.lang.String.*;

public class ProdutoNaoEncotradoException extends  EntidadeNaoEncontradaException  {

    private static final long serialVersionUID = 1L;

    public ProdutoNaoEncotradoException(String mensagem) {
        super(mensagem);
    }

   // public  ProdutoNaoEncontradoException(Long produtoId) {
  //    this(String.format("Não existe um cadastro de produto com código %d para o restaurante de código %d",
  //              produtoId));
 //  }

}
