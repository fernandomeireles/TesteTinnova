package br.com.teste.tinnova.model;

import java.io.Serializable;

public class BaseResponse implements Serializable {

	private static final long serialVersionUID = 4051543036510217181L;

	private String status;
	private boolean validRequest;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public boolean isValidRequest() {
		return validRequest;
	}

	public void setValidRequest(boolean validRequest) {
		this.validRequest = validRequest;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + (validRequest ? 1231 : 1237);
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
		BaseResponse other = (BaseResponse) obj;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (validRequest != other.validRequest)
			return false;
		return true;
	}

}
