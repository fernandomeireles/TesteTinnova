package br.com.teste.tinnova.model;

import java.io.Serializable;

public class FactorialResponse extends BaseResponse implements Serializable {

	private static final long serialVersionUID = -2309455239789947033L;

	private int factorial;

	public int getFactorial() {
		return factorial;
	}

	public void setFactorial(int factorial) {
		this.factorial = factorial;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + factorial;
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
		FactorialResponse other = (FactorialResponse) obj;
		if (factorial != other.factorial)
			return false;
		return true;
	}

}
