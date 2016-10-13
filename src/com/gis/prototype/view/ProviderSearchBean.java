package com.gis.prototype.view;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.gis.prototype.model.Provider;
import com.gis.prototype.service.ProviderDataService;

@ManagedBean
public class ProviderSearchBean {

	
	private Provider selectedProvider;
//	private 
	@ManagedProperty("#{providerDataService}")
	private ProviderDataService service;

	
	/**
	 * @return the service
	 */
	public ProviderDataService getService() {
		return service;
	}

	/**
	 * @param service
	 *            the service to set
	 */
	public void setService(ProviderDataService service) {
		this.service = service;
	}

	public ProviderSearchBean() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * @return the selectedProvider
	 */
	public Provider getSelectedProvider() {
		return selectedProvider;
	}

	/**
	 * @param selectedProvider
	 *            the selectedProvider to set
	 */
	public void setSelectedProvider(Provider selectedProvider) {
		this.selectedProvider = selectedProvider;
	}

	public List<Provider> completeProviderContains(String query) {
		List<Provider> filteredProvider = new ArrayList<Provider>();
		if (query != null) {
			List<Provider> allProviders = service.getAllProvider();

			for (int i = 0; i < allProviders.size(); i++) {
				Provider provider = allProviders.get(i);
				if (provider.getProviderName().toLowerCase().contains(query.toLowerCase())) {
					filteredProvider.add(provider);
				}
			}
		}

		return filteredProvider;
	}
}
