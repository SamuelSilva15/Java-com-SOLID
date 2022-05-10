package br.com.solid.rh.service.reajuste;

import java.math.BigDecimal;

import br.com.solid.rh.model.Funcionario;

public interface ValidacaoReajuste {
	
	void validar(Funcionario funcionario, BigDecimal aumento);

}
