package com.gis.prototype.view.converter;

import java.util.List;
import java.util.Set;

import javax.faces.component.UIComponent;
import javax.faces.component.UISelectItem;
import javax.faces.component.UISelectItems;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import org.primefaces.component.picklist.PickList;
import org.primefaces.model.DualListModel;

import com.gis.prototype.model.Provider;

@FacesConverter(forClass = Provider.class, value = "providerConverter")
public class ProviderConverter implements Converter {

	@SuppressWarnings("unchecked")
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent component,
			String value) {

		Object ret = null;
		if (component instanceof PickList) {
			Object dualList = ((PickList) component).getValue();
			DualListModel<Provider> dl = (DualListModel<Provider>) dualList;

			for (Provider provider : dl.getSource()) {
				if ((new Integer(value)).intValue() == provider.getProviderID()) {
					ret = provider;
					break;
				}
			}
			if (ret == null)
				for (Provider provider : dl.getTarget()) {
					if ((new Integer(value)).intValue() == provider.getProviderID()) {
						ret = provider;
						break;
					}
				}
			// } else if (component instanceof SelectManyMenu) {
		} else {

			List<UIComponent> childs = component.getChildren();
			UISelectItems itens = null;
			if (childs != null) {
				for (UIComponent ui : childs) {
					if (ui instanceof UISelectItems) {
						itens = (UISelectItems) ui;
						break;
					} else if (ui instanceof UISelectItem) {
						UISelectItem item = (UISelectItem) ui;
						try {
							Provider val = (Provider) item.getItemValue();
							if (value.equals("" + val.getProviderID())) {
								ret = val;
								break;
							}
						} catch (Exception e) {
						}
					}
				}
			}

			if (itens != null) {
				Set<Provider> values = (Set<Provider>) itens.getValue();
				if (values != null) {
					for (Provider val : values) {
						if (value.equals("" + val.getProviderID())) {
							ret = val;
							break;
						}
					}
				}
			}

		}

		return ret;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent component,
			Object value) {
		if (value != null)
			return String.valueOf(((Provider) value).getProviderID());
		else
			return "";
	}

}
