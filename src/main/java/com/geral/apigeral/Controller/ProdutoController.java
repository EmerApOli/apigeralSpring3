package com.geral.apigeral.Controller;

import com.geral.apigeral.Assembler.ModelAssemblerProduto;
import com.geral.apigeral.DTO.ProdutoDTO;
import com.geral.apigeral.model.Produto;

import java.util.List;

import com.geral.apigeral.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.hateoas.CollectionModel;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "/produtos", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProdutoController {


    @Autowired
    private ProdutoRepository produtoRepository;

    @Autowired
    ModelAssemblerProduto modelAssemblerProduto;
    @GetMapping
    public CollectionModel<ProdutoDTO> listar() {
        List<Produto> produtos  =  produtoRepository.findAll();


        return modelAssemblerProduto.toCollectionModel(produtos);
    }


}
