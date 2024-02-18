package com.geral.apigeral.repository;

import com.geral.apigeral.model.Produto;
import com.geral.apigeral.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query("from Usuario where id = :usuario")
    Optional<Usuario> findById(@Param("usuario") Long usuarioid);

}
