package br.com.teste.tinnova.model;

import java.io.Serializable;

public class ErrorResponse implements Serializable {

	private static final long serialVersionUID = 8475510347949364705L;
	private String error;
	private boolean validRequest;
	private String personalizedException;

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public boolean isValidRequest() {
		return validRequest;
	}

	public void setValidRequest(boolean validRequest) {
		this.validRequest = validRequest;
	}

	public String getPersonalizedException() {
		return personalizedException;
	}

	public void setPersonalizedException(String personalizedException) {
		this.personalizedException = personalizedException;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((error == null) ? 0 : error.hashCode());
		result = prime * result + ((personalizedException == null) ? 0 : personalizedException.hashCode());
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
		ErrorResponse other = (ErrorResponse) obj;
		if (error == null) {
			if (other.error != null)
				return false;
		} else if (!error.equals(other.error))
			return false;
		if (personalizedException == null) {
			if (other.personalizedException != null)
				return false;
		} else if (!personalizedException.equals(other.personalizedException))
			return false;
		if (validRequest != other.validRequest)
			return false;
		return true;
	}

}
