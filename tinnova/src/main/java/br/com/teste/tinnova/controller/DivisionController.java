package br.com.teste.tinnova.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.tinnova.business.DivisionBo;
import br.com.teste.tinnova.model.DivisionCalculationResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Question 4")
@RequestMapping(value = "exercise4/v1/division")
public class DivisionController implements Serializable {

	@Autowired
	DivisionBo divisionBo;

	private static final long serialVersionUID = -8313756936355257857L;

	@ApiOperation(value = "Performs the division of the divisible numbers by 3 and 5 until the input number")
	@GetMapping(value = "/resultOfDivision")
	public ResponseEntity<DivisionCalculationResponse> getFactorialResult(
			@RequestParam(value = "limitNumber", required = true) int limitNumber) throws Exception {

		DivisionCalculationResponse division = new DivisionCalculationResponse();

		division = divisionBo.calculationOfDivision(limitNumber);

		if (division.isValidRequest())
			return new ResponseEntity<DivisionCalculationResponse>(division, HttpStatus.OK);
		else
			return new ResponseEntity<DivisionCalculationResponse>(division, HttpStatus.BAD_REQUEST);

	}

}
