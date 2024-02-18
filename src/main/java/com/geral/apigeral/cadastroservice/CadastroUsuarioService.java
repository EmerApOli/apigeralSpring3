package com.geral.apigeral.cadastroservice;


import com.geral.apigeral.model.Usuario;
import com.geral.apigeral.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CadastroUsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	

	

	
	@Transactional
	public Usuario salvar(Usuario usuario) {

		
		return usuarioRepository.save(usuario);
	}

	@Transactional
	public void excluir(Long usuarioId) {

		usuarioRepository.deleteById(usuarioId);
		usuarioRepository.flush();


		}

	
}
