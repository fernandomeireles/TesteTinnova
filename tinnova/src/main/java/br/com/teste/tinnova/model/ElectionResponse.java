package br.com.teste.tinnova.model;

import java.io.Serializable;

public class ElectionResponse extends BaseResponse implements Serializable {

	private static final long serialVersionUID = -6171361700697309656L;

	private double percentageValidVotes;
	private double percentageBlankVotes;
	private double percentageNullVotes;

	public double getPercentageValidVotes() {
		return percentageValidVotes;
	}

	public void setPercentageValidVotes(double percentageValidVotes) {
		this.percentageValidVotes = percentageValidVotes;
	}

	public double getPercentageBlankVotes() {
		return percentageBlankVotes;
	}

	public void setPercentageBlankVotes(double percentageBlankVotes) {
		this.percentageBlankVotes = percentageBlankVotes;
	}

	public double getPercentageNullVotes() {
		return percentageNullVotes;
	}

	public void setPercentageNullVotes(double percentageNullVotes) {
		this.percentageNullVotes = percentageNullVotes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(percentageBlankVotes);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(percentageNullVotes);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(percentageValidVotes);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ElectionResponse other = (ElectionResponse) obj;
		if (Double.doubleToLongBits(percentageBlankVotes) != Double.doubleToLongBits(other.percentageBlankVotes))
			return false;
		if (Double.doubleToLongBits(percentageNullVotes) != Double.doubleToLongBits(other.percentageNullVotes))
			return false;
		if (Double.doubleToLongBits(percentageValidVotes) != Double.doubleToLongBits(other.percentageValidVotes))
			return false;
		return true;
	}

}
