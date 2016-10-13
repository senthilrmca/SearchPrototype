package com.gis.prototype.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.gis.prototype.model.Codes;
import com.gis.prototype.model.County;
import com.gis.prototype.model.LicenseType;
import com.gis.prototype.model.ProviderType;
import com.gis.prototype.model.QualityRating;

@ManagedBean(name = "dataValuesService", eager = true)
@ApplicationScoped
@SuppressWarnings("rawtypes")
public class VCDataValuesService {

	public static final String COUNTY = "COUNTY";
	public static final String QR = "QR";
	public static final String PT = "PT";

	Map<String, Map> codesCache = new HashMap();

	List<Codes> codesList = new ArrayList<Codes>();

	@SuppressWarnings("unchecked")
	@PostConstruct
	public void init() {

		// Counties List
		Map<Integer, Object> countyMap = new HashMap();
		countyMap.put(1, new County(1, "ADAMS", null));
		countyMap.put(2, new County(2, "ALCORN", null));
		countyMap.put(3, new County(3, "AMITE", null));
		countyMap.put(4, new County(4, "ATTALA", null));
		countyMap.put(5, new County(5, "BENTON", null));
		countyMap.put(6, new County(6, "BOLIVAR", null));
		countyMap.put(7, new County(7, "CALHOUN", null));
		countyMap.put(8, new County(8, "CARROLL", null));
		countyMap.put(9, new County(9, "CHICKASAW", null));
		countyMap.put(10, new County(10, "CHOCTAW", null));
		countyMap.put(11, new County(11, "CLAIBORNE", null));
		countyMap.put(12, new County(12, "CLARKE", null));
		countyMap.put(13, new County(13, "CLAY", null));
		countyMap.put(14, new County(14, "COAHOMA", null));
		countyMap.put(15, new County(15, "COPIAH", null));
		countyMap.put(16, new County(16, "COVINGTON", null));
		countyMap.put(17, new County(17, "DESOTO", null));
		countyMap.put(18, new County(18, "FORREST", null));
		countyMap.put(19, new County(19, "FRANKLIN", null));
		countyMap.put(20, new County(20, "GEORGE", null));
		countyMap.put(21, new County(21, "GREENE", null));
		countyMap.put(22, new County(22, "GRENADA", null));
		countyMap.put(23, new County(23, "HANCOCK", null));
		countyMap.put(24, new County(24, "HARRISON", null));
		countyMap.put(25, new County(25, "HINDS", null));
		countyMap.put(26, new County(26, "HOLMES", null));
		countyMap.put(27, new County(27, "HUMPHREYS", null));
		countyMap.put(28, new County(28, "ISSAQUENA", null));
		countyMap.put(29, new County(29, "ITAWAMBA", null));
		countyMap.put(30, new County(30, "JACKSON", null));
		countyMap.put(31, new County(31, "JASPER", null));
		countyMap.put(32, new County(32, "JEFFERSON", null));
		countyMap.put(33, new County(33, "JEFFERSON DAVIS", null));
		countyMap.put(34, new County(34, "JONES", null));
		countyMap.put(35, new County(35, "KEMPER", null));
		countyMap.put(36, new County(36, "LAFAYETTE", null));
		countyMap.put(37, new County(37, "LAMAR", null));
		countyMap.put(38, new County(38, "LAUDERDALE", null));
		countyMap.put(39, new County(39, "LAWRENCE", null));
		countyMap.put(40, new County(40, "LEAKE", null));
		countyMap.put(41, new County(41, "LEE", null));
		countyMap.put(42, new County(42, "LEFLORE", null));
		countyMap.put(43, new County(43, "LINCOLN", null));
		countyMap.put(44, new County(44, "LOWNDES", null));
		countyMap.put(45, new County(45, "MADISON", null));
		countyMap.put(46, new County(46, "MARION", null));
		countyMap.put(47, new County(47, "MARSHALL", null));
		countyMap.put(48, new County(48, "MONROE", null));
		countyMap.put(49, new County(49, "MONTGOMERY", null));
		countyMap.put(50, new County(50, "NESHOBA", null));
		countyMap.put(51, new County(51, "NEWTON", null));
		countyMap.put(52, new County(52, "NOXUBEE", null));
		countyMap.put(53, new County(53, "OKTIBBEHA", null));
		countyMap.put(54, new County(54, "PANOLA", null));
		countyMap.put(55, new County(55, "PEARL RIVER", null));
		countyMap.put(56, new County(56, "PERRY", null));
		countyMap.put(57, new County(57, "PIKE", null));
		countyMap.put(58, new County(58, "PONTOTOC", null));
		countyMap.put(59, new County(59, "PRENTISS", null));
		countyMap.put(60, new County(60, "QUITMAN", null));
		countyMap.put(61, new County(61, "RANKIN", null));
		countyMap.put(62, new County(62, "SCOTT", null));
		countyMap.put(63, new County(63, "SHARKEY", null));
		countyMap.put(64, new County(64, "SIMPSON", null));
		countyMap.put(65, new County(65, "SMITH", null));
		countyMap.put(66, new County(66, "STONE", null));
		countyMap.put(67, new County(67, "SUNFLOWER", null));
		countyMap.put(68, new County(68, "TALLAHATCHIE", null));
		countyMap.put(69, new County(69, "TATE", null));
		countyMap.put(70, new County(70, "TIPPAH", null));
		countyMap.put(71, new County(71, "TISHOMINGO", null));
		countyMap.put(72, new County(72, "TUNICA", null));
		countyMap.put(73, new County(73, "UNION", null));
		countyMap.put(74, new County(74, "WALTHALL", null));
		countyMap.put(75, new County(75, "WARREN", null));
		countyMap.put(76, new County(76, "WASHINGTON", null));
		countyMap.put(77, new County(77, "WAYNE", null));
		countyMap.put(78, new County(78, "WEBSTER", null));
		countyMap.put(79, new County(79, "WILKINSON", null));
		countyMap.put(80, new County(80, "WINSTON", null));
		countyMap.put(81, new County(81, "YALOBUSHA", null));
		countyMap.put(82, new County(82, "YAZOO", null));
		codesCache.put(COUNTY, countyMap);

		// qualityRatings
		Map<Integer, QualityRating> qualityRatingMap = new HashMap<Integer, QualityRating>();
		qualityRatingMap.put(0, new QualityRating(0, "Not Rated"));
		qualityRatingMap.put(1, new QualityRating(1, "Low"));
		qualityRatingMap.put(2, new QualityRating(2, "Average"));
		qualityRatingMap.put(3, new QualityRating(3, "Good"));
		qualityRatingMap.put(4, new QualityRating(4, "Very Good"));
		qualityRatingMap.put(5, new QualityRating(5, "Excellent"));
		codesCache.put(QR, qualityRatingMap);

		Map<Integer, ProviderType> providerTypesMap = new HashMap<Integer, ProviderType>();
		providerTypesMap.put(2, new ProviderType(2, "Slot Contractor", LicenseType.LICENSED));
		providerTypesMap.put(3, new ProviderType(3, "Group Home", LicenseType.LICENSED));
		providerTypesMap.put(4, new ProviderType(4, "Center", LicenseType.LICENSED));
		providerTypesMap.put(5, new ProviderType(5, "Non-Relative In-Home", LicenseType.UNLICENSED));
		providerTypesMap.put(6, new ProviderType(6, "Relative In-Home", LicenseType.UNLICENSED));
		providerTypesMap.put(7, new ProviderType(7, "Non-Relative Out-of-Home", LicenseType.UNLICENSED));
		providerTypesMap.put(8, new ProviderType(8, "Relative Out-of-Home", LicenseType.UNLICENSED));
		codesCache.put(PT, providerTypesMap);

		populateCodeSet();

	}

	private void populateCodeSet() {

		List<ProviderType> providerTypeList = getAllProviderType();

		int i = 0;
		for (ProviderType providerType : providerTypeList) {
			codesList
					.add(new Codes(i, PT, providerType.getProviderTypeDescription(), providerType.getProviderTypeID()));
			i++;
		}

		List<QualityRating> qrList = getAllQualityRating();
		for (QualityRating qualityRating : qrList) {
			codesList.add(
					new Codes(i, QR, qualityRating.getQualityRatingDescription(), qualityRating.getQualityRatingID()));
			i++;
		}

		List<County> countyList = getAllCounties();
		for (County county : countyList) {
			codesList.add(new Codes(i, COUNTY, county.getCountyName(), county.getCountyNumber()));
			i++;
		}

	}

	public List<Codes> getCodesByCategogy(String category) {
		List<Codes> codesListByCategory = new ArrayList<Codes>();
		for (Codes codes : codesList) {
			if (codes.getCodeCategory().equals(category)) {
				codesListByCategory.add(codes);
			}
		}
		return codesListByCategory;
	}

	/**
	 * 
	 * @return
	 */
	public List<ProviderType> getAllProviderType() {
		return new ArrayList<ProviderType>(codesCache.get(PT).values());
	}

	/**
	 * 
	 * @param key
	 * @return
	 */
	public ProviderType getProviderTypeByID(Integer key) {
		return (ProviderType) codesCache.get(PT).get(key);
	}

	/**
	 * 
	 * @return
	 */
	public List<QualityRating> getAllQualityRating() {
		return new ArrayList<QualityRating>(codesCache.get(QR).values());
	}

	public QualityRating getQualityRatingByID(Integer key) {
		return (QualityRating) codesCache.get(QR).get(key);
	}

	/**
	 * 
	 * @return
	 */
	public List<County> getAllCounties() {
		return new ArrayList<County>(codesCache.get(COUNTY).values());
	}

	public County getCountyByID(Integer key) {
		return (County) codesCache.get(COUNTY).get(key);
	}

	public static void main(String args[]) {
		VCDataValuesService vcdvs = new VCDataValuesService();
		vcdvs.init();
		System.out.println(vcdvs.getAllCounties().size());
		System.out.println(vcdvs.getCountyByID(2).getCountyName());
	}

}
