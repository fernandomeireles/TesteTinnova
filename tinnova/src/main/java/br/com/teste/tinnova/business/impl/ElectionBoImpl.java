package br.com.teste.tinnova.business.impl;

import org.springframework.stereotype.Service;

import br.com.teste.tinnova.business.ElectionBo;
import br.com.teste.tinnova.enumeration.ElectionEnum;
import br.com.teste.tinnova.model.ElectionRequest;
import br.com.teste.tinnova.model.ElectionResponse;

@Service
public class ElectionBoImpl implements ElectionBo {

    public static double HUNDRED = 100.00;

    @Override
    public ElectionResponse calculateResultOfElection(ElectionRequest election) {

        ElectionResponse electionResult = new ElectionResponse(calculatePercentageVotes(election.getValidVotes(), election.getTotalVoters()),
                calculatePercentageVotes(election.getBlankVotes(), election.getTotalVoters()),
                calculatePercentageVotes(election.getNullVotes(), election.getTotalVoters())
        );

        electionResult.setStatus(ElectionEnum.SUCESS.getStatus());
        electionResult.setValidRequest(true);

        return electionResult;
    }

    private double calculatePercentageVotes(int votes, int totalVoters) {

        return (Double.valueOf(votes * HUNDRED) / totalVoters);
    }

    @Override
    public ElectionResponse validationParameters(ElectionRequest election) {

        ElectionResponse electionResponse = new ElectionResponse(0, 0, 0);

        if (election.getBlankVotes() > election.getTotalVoters()) {
            electionResponse.setStatus(ElectionEnum.INVALID_BLANKS.getStatus());
            electionResponse.setValidRequest(false);

        } else if (election.getNullVotes() > election.getTotalVoters()) {
            electionResponse.setStatus(ElectionEnum.INVALID_NULLS.getStatus());
            electionResponse.setValidRequest(false);

        } else if (election.getValidVotes() > election.getTotalVoters()) {
            electionResponse.setStatus(ElectionEnum.INVALID_VALIDS.getStatus());
            electionResponse.setValidRequest(false);

        } else if ((election.getValidVotes() + election.getBlankVotes() + election.getNullVotes()) != election
                .getTotalVoters()) {
            electionResponse.setStatus(ElectionEnum.INVALID_TOTAL.getStatus());
            electionResponse.setValidRequest(false);

        } else {
            electionResponse.setStatus(ElectionEnum.SUCESS.getStatus());
            electionResponse.setValidRequest(true);
        }

        return electionResponse;
    }

}
