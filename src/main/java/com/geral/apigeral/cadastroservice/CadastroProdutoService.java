package com.geral.apigeral.cadastroservice;


import com.geral.apigeral.exception.ProdutoNaoEncotradoException;
import com.geral.apigeral.model.Produto;
import com.geral.apigeral.model.Usuario;
import com.geral.apigeral.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CadastroProdutoService {

	@Autowired
	private ProdutoRepository produtoRepository;
	

	

	
	@Transactional
	public Produto salvar(Produto produto) {

		
		return produtoRepository.save(produto);
	}

	@Transactional
	public void excluir(Long estadoId) {

			produtoRepository.deleteById(estadoId);
			produtoRepository.flush();


		}

	public Produto buscarOuFalhar(Long produtoId) {
		return  produtoRepository.findById(produtoId)
				.orElseThrow(() -> new ProdutoNaoEncotradoException(produtoId));
	}

	
}
