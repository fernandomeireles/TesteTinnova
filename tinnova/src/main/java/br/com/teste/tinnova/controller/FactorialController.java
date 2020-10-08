package br.com.teste.tinnova.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.teste.tinnova.business.FactorialBo;
import br.com.teste.tinnova.model.FactorialResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Question 3")
@RequestMapping(value = "exercise3/v1/factorial")

public class FactorialController implements Serializable {

	private static final long serialVersionUID = -945240066283237738L;

	@Autowired
	private FactorialBo factorialBo;

	@ApiOperation(value = "Perform the factorial calculation")
	@GetMapping(value = "/resultOfFactorial")
	public ResponseEntity<FactorialResponse> getFactorialResult(
			@RequestParam(value = "numberForFactorial", required = true) int numberForFactorial) throws Exception {

		FactorialResponse factorial = new FactorialResponse();

		factorial = factorialBo.calculationOfFactorial(numberForFactorial);

		if (factorial.isValidRequest())
			return new ResponseEntity<FactorialResponse>(factorial, HttpStatus.OK);
		else
			return new ResponseEntity<FactorialResponse>(factorial, HttpStatus.BAD_REQUEST);

	}

}
