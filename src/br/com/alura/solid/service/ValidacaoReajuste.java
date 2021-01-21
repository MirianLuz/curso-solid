package br.com.alura.solid.service;

import java.math.BigDecimal;

import br.com.alura.solid.model.Funcionario;

public interface ValidacaoReajuste {
	
	void validar(Funcionario funcionario, BigDecimal aumento);

}
