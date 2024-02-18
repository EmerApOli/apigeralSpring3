package com.geral.apigeral.Controller;

import com.geral.apigeral.Assembler.ModelAssemblerProduto;
import com.geral.apigeral.Assembler.ModelAssemblerUsuario;
import com.geral.apigeral.Assembler.ProdutoInputDisassembler;
import com.geral.apigeral.Assembler.UsuarioInputDisassembler;
import com.geral.apigeral.DTO.ProdutoDTO;
import com.geral.apigeral.DTO.UsuarioDTO;
import com.geral.apigeral.cadastroservice.CadastroProdutoService;
import com.geral.apigeral.cadastroservice.CadastroUsuarioService;
import com.geral.apigeral.model.Produto;
import com.geral.apigeral.model.Usuario;
import com.geral.apigeral.repository.ProdutoRepository;
import com.geral.apigeral.repository.UsuarioRepository;
import jakarta.validation.Valid;
import model.input.ProdutoInput;
import model.input.UsuarioInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/usuarios", produces = MediaType.APPLICATION_JSON_VALUE)
public class UsuarioController {


    @Autowired
    CadastroUsuarioService cadastroUsuarioService;
 @Autowired

 UsuarioInputDisassembler usuarioInputDisassembler;

    @Autowired
    ModelAssemblerUsuario modelAssemblerUsuario;




    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping
    public List<UsuarioDTO> listar() {
        List<Usuario> usuarios  =  usuarioRepository.findAll();


        return modelAssemblerUsuario.toCollectionModel(usuarios);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDTO adicionar(@RequestBody @Valid UsuarioInput usuarioInput) {
        Usuario  usuario = usuarioInputDisassembler.toDomainObject(usuarioInput);
        usuario = cadastroUsuarioService.salvar(usuario);

        return modelAssemblerUsuario.toModel(usuario);
    }


    //@Override
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id) {
        cadastroUsuarioService.excluir(id);
    }

}








