package com.gis.prototype.service;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import com.gis.prototype.common.util.CSVReader;
import com.gis.prototype.model.Provider;

@ManagedBean(name = "providerDataService", eager = true)
@ApplicationScoped
public class ProviderDataService {

	public List<Provider> getAllProvider() {
		CSVReader csvReader = new CSVReader();
		return csvReader.getAllProviders();
	}
}
