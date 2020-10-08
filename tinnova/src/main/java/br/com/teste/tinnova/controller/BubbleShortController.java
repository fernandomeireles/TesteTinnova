package br.com.teste.tinnova.controller;

import java.io.Serializable;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Question 2")
@RequestMapping(value = "exercise2/v1/bubbleShort")
public class BubbleShortController implements Serializable {

	private static final long serialVersionUID = -531840333641208754L;

	@ApiOperation(value = "Perform the bubble short ordenation")
	@GetMapping(value = "/bubbleShort")

	public ResponseEntity<Object> getBubbleShortResult(@RequestParam(value = "vector", required = true) int[] vector) {

		return new ResponseEntity<Object>("Teste", HttpStatus.OK);
	}

}
