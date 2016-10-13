package com.gis.prototype.model;

public class Codes extends BaseModel {

	private Integer codeId;
	private String codeCategory;
	private String codeDescription;
	private Integer codeValue;
	
	
	public Codes(Integer codeId, String codeCategory, String codeDescription, Integer codeValue) {
		super();
		this.codeId = codeId;
		this.codeCategory = codeCategory;
		this.codeDescription = codeDescription;
		this.codeValue = codeValue;
	}
	
	/**
	 * @return the codeID
	 */
	public Integer getCodeId() {
		return codeId;
	}
	/**
	 * @param codeID the codeID to set
	 */
	public void setCodeId(Integer codeId) {
		this.codeId = codeId;
	}
	/**
	 * @return the codeCategory
	 */
	public String getCodeCategory() {
		return codeCategory;
	}
	/**
	 * @param codeCategory the codeCategory to set
	 */
	public void setCodeCategory(String codeCategory) {
		this.codeCategory = codeCategory;
	}
	/**
	 * @return the codeDescription
	 */
	public String getCodeDescription() {
		return codeDescription;
	}
	/**
	 * @param codeDescription the codeDescription to set
	 */
	public void setCodeDescription(String codeDescription) {
		this.codeDescription = codeDescription;
	}
	/**
	 * @return the codeValue
	 */
	public Integer getCodeValue() {
		return codeValue;
	}
	/**
	 * @param codeValue the codeValue to set
	 */
	public void setCodeValue(Integer codeValue) {
		this.codeValue = codeValue;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codeId == null) ? 0 : codeId.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Codes))
			return false;
		Codes other = (Codes) obj;
		if (codeId == null) {
			if (other.codeId != null)
				return false;
		} else if (!codeId.equals(other.codeId))
			return false;
		return true;
	}
	
	
	
}
