package model.input;

import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;


@Setter
@Getter
public  class UsuarioInput {


	String nome;
	String email;
	String senha;
	
}
