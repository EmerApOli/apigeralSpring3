package com.geral.apigeral.repository;

import com.geral.apigeral.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    @Query("from Produto where id = :produto")
    Optional<Produto> findById(@Param("produto") Long produtoId);
}
