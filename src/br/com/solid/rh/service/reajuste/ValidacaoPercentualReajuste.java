package br.com.solid.rh.service.reajuste;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.solid.rh.ValidacaoException;
import br.com.solid.rh.model.Funcionario;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste {
	
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		BigDecimal salarioAtual = funcionario.getSalario();
		BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
	}

}
