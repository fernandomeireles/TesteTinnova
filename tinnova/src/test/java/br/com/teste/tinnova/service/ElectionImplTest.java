package br.com.teste.tinnova.service;

import br.com.teste.tinnova.business.ElectionBo;
import br.com.teste.tinnova.business.impl.ElectionBoImpl;
import br.com.teste.tinnova.model.ElectionRequest;
import br.com.teste.tinnova.model.ElectionResponse;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ElectionImplTest {

    private ElectionRequest election;
    private ElectionResponse response;
    private ElectionBo electionBo;

    @BeforeEach
    public void initMocks() {
        election = new ElectionRequest(200, 100, 30, 70);
        electionBo = new ElectionBoImpl();
        response = electionBo.calculateResultOfElection(election);
    }

    @Test
    public void validResultOfElection() {
        Assertions.assertEquals(50.0, response.getPercentageValidVotes());
    }

    @Test
    public void blankVotesOnTheTotalVoters() {
        Assertions.assertEquals(15.0, response.getPercentageBlankVotes());
    }

    @Test
    public void nullVotesOnTheTotalVoters() {
        Assertions.assertEquals(35.0, response.getPercentageNullVotes());
    }

    @Test
    public void isValidElection() {
        response = electionBo.validationParameters(election);
        Assertions.assertTrue(response.isValidRequest());
    }

    @Test
    public void notValidElection() {
        election.setNullVotes(90);
        response = electionBo.validationParameters(election);
        Assertions.assertFalse(response.isValidRequest());
    }
}
