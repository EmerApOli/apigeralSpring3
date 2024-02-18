package com.geral.apigeral.Assembler;
import com.geral.apigeral.DTO.ProdutoDTO;
import com.geral.apigeral.DTO.UsuarioDTO;
import com.geral.apigeral.model.Produto;
import com.geral.apigeral.model.Usuario;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ModelAssemblerUsuario {

    @Autowired
    private ModelMapper modelMapper;
   // public ModelAssemblerProduto() {
   //     super(ProdutoController.class, ProdutoDTO.class);
   // }

    //@Override
    public UsuarioDTO toModel(Usuario usuario) {
       // ProdutoDTO produtoDTO = createModelWithId(produto.getId(),produto);
       return modelMapper.map(usuario,UsuarioDTO.class);

       // return  produtoDTO;
    }

    public List<UsuarioDTO> toCollectionModel(List<Usuario> usuarios){

         return  usuarios.stream().map(usuario->toModel(usuario)).collect(Collectors.toList());



    }
}
