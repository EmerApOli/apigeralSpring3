package com.geral.apigeral.Controller;

import com.geral.apigeral.model.Produto;

import java.util.List;

import com.geral.apigeral.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/produtos", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProdutoController {


    @Autowired
    private ProdutoRepository produtoRepository;
    @GetMapping
    public List<Produto> listar() {
        List<Produto> todosProdutos = produtoRepository.findAll();
          return  todosProdutos;
        //return cozinhaModelAssembler.toCollectionModel(todasCozinhas);
    }


}
