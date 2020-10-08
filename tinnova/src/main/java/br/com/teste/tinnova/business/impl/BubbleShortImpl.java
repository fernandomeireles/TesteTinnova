package br.com.teste.tinnova.business.impl;

import org.springframework.stereotype.Service;

import br.com.teste.tinnova.business.BubbleShortBo;
import br.com.teste.tinnova.model.BubbleShortResponse;

@Service
public class BubbleShortImpl implements BubbleShortBo {

	private static String SUCESS = "Sucess";

	private int manager = 0;

	@Override
	public BubbleShortResponse executeBubbleShort(Integer[] vector) throws Exception {

		BubbleShortResponse bubbleShortResponse = new BubbleShortResponse();

		for (int interator = 0; interator < vector.length; interator++) {

			for (int secondInterator = 0; secondInterator < (vector.length - 1); secondInterator++) {

				if (vector[secondInterator] > vector[secondInterator + 1]) {
					manager = vector[secondInterator];
					vector[secondInterator] = vector[secondInterator + 1];
					vector[secondInterator + 1] = manager;
				}
			}
		}

		bubbleShortResponse.setValidRequest(true);
		bubbleShortResponse.setStatus(SUCESS);
		bubbleShortResponse.setVectorResponse(vector);
		return bubbleShortResponse;
	}

}
