package model.input;

import lombok.Getter;
import lombok.Setter;



import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;


@Setter
@Getter
public  class ProdutoInput {



	@NotNull
	private String nome;


	@NotNull
	private String descricao;

	@NotNull
	private BigDecimal preco;


	@NotNull
	private Boolean ativo;
	
}
