package br.com.teste.tinnova.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

import br.com.teste.tinnova.model.BubbleShortResponse;
import br.com.teste.tinnova.model.ElectionResponse;

@RestControllerAdvice
public class GenericErrorHandler {

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(MethodArgumentTypeMismatchException.class)
	public ElectionResponse handleBadInputStructure(MethodArgumentTypeMismatchException exception) {

		ElectionResponse election = new ElectionResponse();
		election.setValidRequest(false);
		election.setStatus("Only INTEGER Number");

		return election;
	}

	@ResponseStatus(code = HttpStatus.BAD_REQUEST)
	@ExceptionHandler(Exception.class)
	public BubbleShortResponse handleBadInputGeneric(Exception exception) {

		BubbleShortResponse bubbleShortResponse = new BubbleShortResponse();
		bubbleShortResponse.setValidRequest(false);
		bubbleShortResponse.setStatus("Something strange happened");

		return bubbleShortResponse;
	}

}
