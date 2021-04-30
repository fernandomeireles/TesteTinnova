package br.com.teste.tinnova.business;

import br.com.teste.tinnova.model.ElectionRequest;
import br.com.teste.tinnova.model.ElectionResponse;

public interface ElectionBo {

	public ElectionResponse calculateResultOfElection(ElectionRequest election);
	public ElectionResponse validationParameters(ElectionRequest election);
	
	
}
