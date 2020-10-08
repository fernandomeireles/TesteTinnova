package br.com.teste.tinnova.model;

import java.io.Serializable;

public class DivisionCalculationResponse extends BaseResponse implements Serializable {

	private static final long serialVersionUID = 6490791795934258792L;

	private int totalSum;

	public int getTotalSum() {
		return totalSum;
	}

	public void setTotalSum(int totalSum) {
		this.totalSum = totalSum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + totalSum;
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
		DivisionCalculationResponse other = (DivisionCalculationResponse) obj;
		if (totalSum != other.totalSum)
			return false;
		return true;
	}

}
