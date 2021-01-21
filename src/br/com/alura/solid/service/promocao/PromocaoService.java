package br.com.alura.solid.service.promocao;


import br.com.alura.solid.ValidacaoException;
import br.com.alura.solid.model.Cargo;
import br.com.alura.solid.model.Funcionario;

public class PromocaoService {
	
	public void promover(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getCargo();
		if (Cargo.GERENTE == cargoAtual) {
			throw new ValidacaoException("Gerentes nao podem ser promovidos!");
		}
		
		if (metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcionario nao bateu a meta!");
		}
	}

}
