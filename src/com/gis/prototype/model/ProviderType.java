package com.gis.prototype.model;

public class ProviderType extends BaseModel {

	private Integer providerTypeID;
	private String providerTypeDescription;
	private LicenseType licenseType;
	
	
	public ProviderType(Integer providerTypeID, String providerTypeDescription, LicenseType licenseType) {
		super();
		this.providerTypeID = providerTypeID;
		this.providerTypeDescription = providerTypeDescription;
		this.licenseType = licenseType;
	}
	/**
	 * @return the providerTypeID
	 */
	public Integer getProviderTypeID() {
		return providerTypeID;
	}
	/**
	 * @param providerTypeID the providerTypeID to set
	 */
	public void setProviderTypeID(Integer providerTypeID) {
		this.providerTypeID = providerTypeID;
	}
	/**
	 * @return the providerTypeDescription
	 */
	public String getProviderTypeDescription() {
		return providerTypeDescription;
	}
	/**
	 * @param providerTypeDescription the providerTypeDescription to set
	 */
	public void setProviderTypeDescription(String providerTypeDescription) {
		this.providerTypeDescription = providerTypeDescription;
	}
	/**
	 * @return the licenseType
	 */
	public LicenseType getLicenseType() {
		return licenseType;
	}
	/**
	 * @param licenseType the licenseType to set
	 */
	public void setLicenseType(LicenseType licenseType) {
		this.licenseType = licenseType;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((providerTypeID == null) ? 0 : providerTypeID.hashCode());
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
		if (!(obj instanceof ProviderType))
			return false;
		ProviderType other = (ProviderType) obj;
		if (providerTypeID == null) {
			if (other.providerTypeID != null)
				return false;
		} else if (!providerTypeID.equals(other.providerTypeID))
			return false;
		return true;
	}

	
}
