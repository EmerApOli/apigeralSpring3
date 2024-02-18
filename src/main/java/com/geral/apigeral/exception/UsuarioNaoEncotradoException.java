package com.geral.apigeral.exception;

public class UsuarioNaoEncotradoException extends  EntidadeNaoEncontradaException  {

    private static final long serialVersionUID = 1L;

    public UsuarioNaoEncotradoException(String mensagem) {
        super(mensagem);
    }

    public UsuarioNaoEncotradoException(Long produtoId) {
     this(String.format("Não existe um cadastro de produto com código %d para o restaurante de código %d",
               produtoId));
   }

}
