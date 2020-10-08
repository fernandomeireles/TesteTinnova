package br.com.teste.tinnova.model;

import java.io.Serializable;
import java.util.Arrays;

public class BubbleShortResponse extends BaseResponse implements Serializable {

	private static final long serialVersionUID = -4454358241479507847L;

	private Integer[] vectorResponse;

	public Integer[] getVectorResponse() {
		return vectorResponse;
	}

	public void setVectorResponse(Integer[] vectorResponse) {
		this.vectorResponse = vectorResponse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(vectorResponse);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		BubbleShortResponse other = (BubbleShortResponse) obj;
		if (!Arrays.equals(vectorResponse, other.vectorResponse))
			return false;
		return true;
	}

}
