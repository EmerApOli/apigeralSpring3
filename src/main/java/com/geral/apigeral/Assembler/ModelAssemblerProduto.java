package com.geral.apigeral.Assembler;
import com.geral.apigeral.Controller.ProdutoController;
import com.geral.apigeral.DTO.ProdutoDTO;
import com.geral.apigeral.model.Produto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ModelAssemblerProduto {

    @Autowired
    private ModelMapper modelMapper;
   // public ModelAssemblerProduto() {
   //     super(ProdutoController.class, ProdutoDTO.class);
   // }

    //@Override
    public ProdutoDTO toModel(Produto produto) {
       // ProdutoDTO produtoDTO = createModelWithId(produto.getId(),produto);
       return modelMapper.map(produto,ProdutoDTO.class);

       // return  produtoDTO;
    }

    public List<ProdutoDTO> toCollectionModel(List<Produto> produtos){

         return  produtos.stream().map(produto->toModel(produto)).collect(Collectors.toList());



    }
}
