package br.com.teste.tinnova.business.impl;

import org.springframework.stereotype.Service;

import br.com.teste.tinnova.business.FactorialBo;
import br.com.teste.tinnova.model.FactorialResponse;

@Service
public class FactorialBoImpl implements FactorialBo {
	private int resultFactorial;
	private static String SUCESS = "Sucess";
	private static String INVALID_NUMBER = "Only positive numbers";

	@Override
	public FactorialResponse calculationOfFactorial(int numberForFactorial) throws Exception {

		FactorialResponse factorialResponse = new FactorialResponse();
		resultFactorial = numberForFactorial;

		if (numberForFactorial < 0) {
			factorialResponse.setStatus(INVALID_NUMBER);
			factorialResponse.setValidRequest(false);

			return factorialResponse;

		}

		while (numberForFactorial > 1) {
			resultFactorial = resultFactorial * (numberForFactorial - 1);
			numberForFactorial--;

		}

		if (numberForFactorial == 0)
			resultFactorial = 1;

		factorialResponse.setStatus(SUCESS);
		factorialResponse.setValidRequest(true);
		factorialResponse.setFactorial(resultFactorial);

		return factorialResponse;
	}

}
