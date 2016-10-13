package com.gis.prototype.view;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import com.gis.prototype.model.Codes;
import com.gis.prototype.service.VCDataValuesService;

@ManagedBean
public class CodesBean {

	@ManagedProperty("#{dataValuesService}")
	private VCDataValuesService dataValuesService;
	
	public List<Codes> getCodesByCategogy(String category){
		return dataValuesService.getCodesByCategogy(category);
	}

	/**
	 * @return the dataValuesService
	 */
	public VCDataValuesService getDataValuesService() {
		return dataValuesService;
	}

	/**
	 * @param dataValuesService the dataValuesService to set
	 */
	public void setDataValuesService(VCDataValuesService dataValuesService) {
		this.dataValuesService = dataValuesService;
	}
}
