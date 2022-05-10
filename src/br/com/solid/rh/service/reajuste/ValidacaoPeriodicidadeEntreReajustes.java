package br.com.solid.rh.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.solid.rh.ValidacaoException;
import br.com.solid.rh.model.Funcionario;

public class ValidacaoPeriodicidadeEntreReajustes  implements ValidacaoReajuste {
	
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		long mesesDeseUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
		if (mesesDeseUltimoReajuste < 6) {
			throw new ValidacaoException("Intervalo entre reajustes deve ser de no minimo 6 meses!");
		}
	}

}
