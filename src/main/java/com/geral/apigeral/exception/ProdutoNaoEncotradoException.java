package com.geral.apigeral.exception;

public class ProdutoNaoEncotradoException extends  EntidadeNaoEncontradaException  {

    private static final long serialVersionUID = 1L;

    public ProdutoNaoEncotradoException(String mensagem) {
        super(mensagem);
    }

    public ProdutoNaoEncotradoException(Long produtoId) {
     this(String.format("Não existe um cadastro de produto com código %d para o restaurante de código %d",
               produtoId));
   }

}
