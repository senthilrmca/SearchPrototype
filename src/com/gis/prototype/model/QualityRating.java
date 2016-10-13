package com.gis.prototype.model;

public class QualityRating extends BaseModel {

	private Integer qualityRatingID;
	private String qualityRatingDescription;
	public QualityRating(Integer qualityRatingID, String qualityRatingDescription) {
		super();
		this.qualityRatingID = qualityRatingID;
		this.qualityRatingDescription = qualityRatingDescription;
	}
	/**
	 * @return the qualityRatingID
	 */
	public Integer getQualityRatingID() {
		return qualityRatingID;
	}
	/**
	 * @param qualityRatingID the qualityRatingID to set
	 */
	public void setQualityRatingID(Integer qualityRatingID) {
		this.qualityRatingID = qualityRatingID;
	}
	/**
	 * @return the qualityRatingDescription
	 */
	public String getQualityRatingDescription() {
		return qualityRatingDescription;
	}
	/**
	 * @param qualityRatingDescription the qualityRatingDescription to set
	 */
	public void setQualityRatingDescription(String qualityRatingDescription) {
		this.qualityRatingDescription = qualityRatingDescription;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((qualityRatingID == null) ? 0 : qualityRatingID.hashCode());
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
		if (!(obj instanceof QualityRating))
			return false;
		QualityRating other = (QualityRating) obj;
		if (qualityRatingID == null) {
			if (other.qualityRatingID != null)
				return false;
		} else if (!qualityRatingID.equals(other.qualityRatingID))
			return false;
		return true;
	}
	

}
