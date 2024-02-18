package com.geral.apigeral.Controller;

import com.geral.apigeral.Assembler.ProdutoInputDisassembler;

import com.geral.apigeral.Assembler.ModelAssemblerProduto;
import com.geral.apigeral.DTO.ProdutoDTO;
import com.geral.apigeral.cadastroservice.CadastroProdutoService;
import com.geral.apigeral.model.Produto;

import java.util.List;
import java.util.Optional;

import jakarta.validation.Valid;
import com.geral.apigeral.repository.ProdutoRepository;
import model.input.ProdutoInput;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/produtos", produces = MediaType.APPLICATION_JSON_VALUE)
public class ProdutoController {


    @Autowired
    CadastroProdutoService cadastroProdutoService;
 @Autowired

 ProdutoInputDisassembler produtoInputDisassembler;

    @Autowired
    ModelAssemblerProduto modelAssemblerProduto;




    @Autowired
    ProdutoRepository produtoRepository;

    @GetMapping
    public List<ProdutoDTO> listar() {
        List<Produto> produtos  =  produtoRepository.findAll();


        return modelAssemblerProduto.toCollectionModel(produtos);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProdutoDTO adicionar(@RequestBody @Valid ProdutoInput produtoInput) {
        Produto produto = produtoInputDisassembler.toDomainObject(produtoInput);
        produto = cadastroProdutoService.salvar(produto);

        return modelAssemblerProduto.toModel(produto);
    }

    @PutMapping("/{produtoId}")
    public ProdutoDTO atualizar(@PathVariable Long produtoId,
                                  @RequestBody @Valid ProdutoInput produtoInput) {
        Produto produtoAtual = cadastroProdutoService.buscarOuFalhar(produtoId);
        produtoInputDisassembler.copyToDomainObject(produtoInput, produtoAtual);
        produtoAtual = cadastroProdutoService.salvar(produtoAtual);

        return modelAssemblerProduto.toModel(produtoAtual);
    }


    //@Override
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id) {
        cadastroProdutoService.excluir(id);
    }

}








