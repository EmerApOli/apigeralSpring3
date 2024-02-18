package com.geral.apigeral.DTO;

import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.server.core.Relation;

import java.math.BigDecimal;

@Relation(collectionRelation = "produtos")
@Getter
@Setter
public class UsuarioDTO {


    Integer id;
    String nome;
    String email;
    String senha;

}
