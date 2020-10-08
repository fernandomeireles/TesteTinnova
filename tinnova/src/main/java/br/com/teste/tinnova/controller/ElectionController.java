package br.com.teste.tinnova.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.tinnova.business.ElectionBo;
import br.com.teste.tinnova.model.ElectionRequest;
import br.com.teste.tinnova.model.ElectionResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Question 1")
@RequestMapping(value = "exercise1/v1/election")

public class ElectionController implements Serializable {

	private static final long serialVersionUID = -3734865864701486832L;

	@Autowired
	private ElectionBo electionBo;

	@ApiOperation(value = "Perform the election calculation")
	@GetMapping(value = "/resultOfElection")
	public ResponseEntity<ElectionResponse> getElectionResult(
			@RequestParam(value = "totalVoters", required = true) int totalVoters,
			@RequestParam(value = "validVotes", required = true) int validVotes,
			@RequestParam(value = "blankVotes", required = true) int blankVotes,
			@RequestParam(value = "nullVotes", required = true) int nullVotes) {

		ElectionResponse electionResponse = new ElectionResponse();

		ElectionRequest election = new ElectionRequest();
		election.setBlankVotes(blankVotes);
		election.setNullVotes(nullVotes);
		election.setTotalVoters(totalVoters);
		election.setValidVotes(validVotes);

		electionResponse = electionBo.validationParameters(election);

		if (!electionResponse.isValidRequest())
			return new ResponseEntity<>(electionResponse, HttpStatus.BAD_REQUEST);

		electionResponse = electionBo.calculateResultOfElection(election);

		return new ResponseEntity<>(electionResponse, HttpStatus.OK);

	}

}
