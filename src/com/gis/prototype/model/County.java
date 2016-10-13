package com.gis.prototype.model;

public class County extends BaseModel {

	private Integer countyNumber;
	private String countyName;
	private String phoneNumber;

	public County(Integer countyNumber, String countyName, String phoneNumber) {
		super();
		this.countyNumber = countyNumber;
		this.countyName = countyName;
		this.phoneNumber = phoneNumber;
	}

	public Integer getCountyNumber() {
		return countyNumber;
	}

	public void setCountyNumber(Integer countyNumber) {
		this.countyNumber = countyNumber;
	}

	public String getCountyName() {
		return countyName;
	}

	public void setCountyName(String countyName) {
		this.countyName = countyName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countyNumber == null) ? 0 : countyNumber.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof County))
			return false;
		County other = (County) obj;
		if (countyNumber == null) {
			if (other.countyNumber != null)
				return false;
		} else if (!countyNumber.equals(other.countyNumber))
			return false;
		return true;
	}

}
