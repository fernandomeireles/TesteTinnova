package br.com.teste.tinnova.enumeration;

public enum ElectionEnum {

	INVALID_NULLS("Number of NULLS greater than TOTAL votes"),
	INVALID_BLANKS("Number of BLANKS greater than TOTAL votes"),
	INVALID_VALIDS("Number of VALIDS greater than TOTAL votes"),
	INVALID_TOTAL("The sum of blank, null and valid votes is different from the TOTAL number of voters "),
	SUCESS("Sucess");

	private String status;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	private ElectionEnum(String status) {
		this.status = status;

	}

}
