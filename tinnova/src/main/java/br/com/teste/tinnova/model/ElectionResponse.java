package br.com.teste.tinnova.model;

import java.io.Serializable;

public class ElectionResponse implements Serializable {

	private static final long serialVersionUID = -6171361700697309656L;

	private double percentageValidVotes;
	private double percentageBlankVotes;
	private double percentageNullVotes;
	private String status;
	private boolean isValidRequest;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isValidRequest() {
		return isValidRequest;
	}

	public void setValidRequest(boolean isValidRequest) {
		this.isValidRequest = isValidRequest;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (isValidRequest ? 1231 : 1237);
		long temp;
		temp = Double.doubleToLongBits(percentageBlankVotes);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(percentageNullVotes);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(percentageValidVotes);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		if (isValidRequest != other.isValidRequest)
			return false;
		if (Double.doubleToLongBits(percentageBlankVotes) != Double.doubleToLongBits(other.percentageBlankVotes))
			return false;
		if (Double.doubleToLongBits(percentageNullVotes) != Double.doubleToLongBits(other.percentageNullVotes))
			return false;
		if (Double.doubleToLongBits(percentageValidVotes) != Double.doubleToLongBits(other.percentageValidVotes))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}

}
