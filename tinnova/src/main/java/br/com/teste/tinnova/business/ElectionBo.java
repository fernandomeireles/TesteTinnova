package br.com.teste.tinnova.business;

import br.com.teste.tinnova.model.ElectionRequest;
import br.com.teste.tinnova.model.ElectionResponse;

public interface ElectionBo {

	public ElectionResponse calculateResultOfElection(ElectionRequest election);
	public double calculatePercentageValidVotes(int validVotes, int totalVoters);
	public double calculatePercentageNullVotes(int nullVotes, int totalVoters);
	public double calculatePercentageBlankVotes(int blankVotes, int totalVoters);
	public ElectionResponse validationParameters(ElectionRequest election);
	
	
}
