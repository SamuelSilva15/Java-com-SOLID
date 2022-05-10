package br.com.solid.rh.service.tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface Reajuste {
	
	BigDecimal valor();
	LocalDate data();

}
