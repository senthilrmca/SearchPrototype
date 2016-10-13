package com.gis.prototype.common.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.gis.prototype.model.Provider;

public class CSVReader {

	private static List<Provider> providerList = new ArrayList<Provider>();

	static {
		CsvMapper mapper = new CsvMapper();
		// important: we need "array wrapping" (see next section) here:
		mapper.enable(CsvParser.Feature.WRAP_AS_ARRAY);
		List<Provider> providerList = new ArrayList<Provider>();
		File csvFile = new File(
				"MS ITS RFP 3717-Vendor Challenge Dataset FINAL.csv"); // or
																																		// from
																																		// String,
																																		// URL
																																		// etc
		MappingIterator<String[]> it;
		try {
			it = mapper.readerFor(String[].class).readValues(csvFile);
			while (it.hasNext()) {
				String[] row = it.next();
				// new Provider(row[0], providerType, qualityRating,
				// providerCapacity, physicalCity, physicalZipCode, county)
				providerList.add(new Provider(1, row[0], null, null, null, null, null, null));

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public List<Provider> getAllProviders() {
		return providerList;
	}

	public static void main(String a[]) {
		CSVReader csvReader = new CSVReader();
	}
}
