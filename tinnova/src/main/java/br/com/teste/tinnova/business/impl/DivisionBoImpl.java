package br.com.teste.tinnova.business.impl;

import org.springframework.stereotype.Service;

import br.com.teste.tinnova.business.DivisionBo;
import br.com.teste.tinnova.model.DivisionCalculationResponse;

@Service
public class DivisionBoImpl implements DivisionBo {

	private static String INVALID_LIMIT_NUMBER = "The limit number must be equal to or greater than 3";
	private static String SUCESS = "Sucess";
	private int totalSum;

	@Override
	public DivisionCalculationResponse calculationOfDivision(int limitNumber) {

		DivisionCalculationResponse division = new DivisionCalculationResponse();
		totalSum = 0;

		if (limitNumber < 3) {
			division.setStatus(INVALID_LIMIT_NUMBER);
			division.setValidRequest(false);

			return division;
		}

		for (int count = 0; count < limitNumber; count++) {
			if ((count % 3 == 0) || (count % 5 == 0))
				totalSum += count;

		}

		division.setStatus(SUCESS);
		division.setValidRequest(false);
		division.setTotalSum(totalSum);

		return division;
	}

}
