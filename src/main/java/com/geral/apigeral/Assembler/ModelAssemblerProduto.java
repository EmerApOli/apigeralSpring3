package com.geral.apigeral.Assembler;
import com.geral.apigeral.Controller.ProdutoController;
import com.geral.apigeral.DTO.ProdutoDTO;
import com.geral.apigeral.model.Produto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

@Component
public class ModelAssemblerProduto
        extends  RepresentationModelAssemblerSupport<Produto, ProdutoDTO> {

    @Autowired
    private ModelMapper modelMapper;
    public ModelAssemblerProduto() {
        super(ProdutoController.class, ProdutoDTO.class);
    }

    @Override
    public ProdutoDTO toModel(Produto produto) {
        ProdutoDTO produtoDTO = createModelWithId(produto.getId(),produto);
        modelMapper.map(produto,produtoDTO);

        return  produtoDTO;
    }
}
