package com.geral.apigeral.DTO;

import jakarta.persistence.Column;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.hateoas.RepresentationModel;
import org.springframework.hateoas.server.core.Relation;

import java.math.BigDecimal;

@Relation(collectionRelation = "produtos")
@Getter
@Setter
public class ProdutoDTO {


     private  Integer id;
    private String nome;
    private BigDecimal preco;
    private String descricao;
}
