package com.gis.prototype.model;

public class Provider extends BaseModel {
	
	
	private Integer providerID;
	private String providerName;
	private ProviderType providerType;
	private QualityRating qualityRating;
	private Integer providerCapacity;
	private String physicalCity;
	private String physicalZipCode;
	private County county;
	
	/**
	 * 
	 * @param providerName
	 * @param providerType
	 * @param qualityRating
	 * @param providerCapacity
	 * @param physicalCity
	 * @param physicalZipCode
	 * @param county
	 */
	public Provider(Integer providerID, String providerName, ProviderType providerType, QualityRating qualityRating,
			Integer providerCapacity, String physicalCity, String physicalZipCode, County county) {
		super();
		this.setProviderID(providerID);
		this.providerName = providerName;
		this.providerType = providerType;
		this.qualityRating = qualityRating;
		this.providerCapacity = providerCapacity;
		this.physicalCity = physicalCity;
		this.physicalZipCode = physicalZipCode;
		this.county = county;
	}
	
	
	/**
	 * @return the providerID
	 */
	public Integer getProviderID() {
		return providerID;
	}


	/**
	 * @param providerID the providerID to set
	 */
	public void setProviderID(Integer providerID) {
		this.providerID = providerID;
	}


	/**
	 * @return the providerName
	 */
	public String getProviderName() {
		return providerName;
	}
	/**
	 * @param providerName the providerName to set
	 */
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	/**
	 * @return the providerType
	 */
	public ProviderType getProviderType() {
		return providerType;
	}
	/**
	 * @param providerType the providerType to set
	 */
	public void setProviderType(ProviderType providerType) {
		this.providerType = providerType;
	}
	/**
	 * @return the qualityRating
	 */
	public QualityRating getQualityRating() {
		return qualityRating;
	}
	/**
	 * @param qualityRating the qualityRating to set
	 */
	public void setQualityRating(QualityRating qualityRating) {
		this.qualityRating = qualityRating;
	}
	/**
	 * @return the providerCapacity
	 */
	public Integer getProviderCapacity() {
		return providerCapacity;
	}
	/**
	 * @param providerCapacity the providerCapacity to set
	 */
	public void setProviderCapacity(Integer providerCapacity) {
		this.providerCapacity = providerCapacity;
	}
	/**
	 * @return the physicalCity
	 */
	public String getPhysicalCity() {
		return physicalCity;
	}
	/**
	 * @param physicalCity the physicalCity to set
	 */
	public void setPhysicalCity(String physicalCity) {
		this.physicalCity = physicalCity;
	}
	/**
	 * @return the physicalZipCode
	 */
	public String getPhysicalZipCode() {
		return physicalZipCode;
	}
	/**
	 * @param physicalZipCode the physicalZipCode to set
	 */
	public void setPhysicalZipCode(String physicalZipCode) {
		this.physicalZipCode = physicalZipCode;
	}
	/**
	 * @return the county
	 */
	public County getCounty() {
		return county;
	}
	/**
	 * @param county the county to set
	 */
	public void setCounty(County county) {
		this.county = county;
	}
	
	
}
