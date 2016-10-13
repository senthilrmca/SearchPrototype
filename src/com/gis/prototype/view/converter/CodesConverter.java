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

import com.gis.prototype.model.Codes;

@FacesConverter(forClass = Codes.class, value = "codesConverter")
public class CodesConverter implements Converter {

	@SuppressWarnings("unchecked")
	@Override
	public Object getAsObject(FacesContext arg0, UIComponent component,
			String value) {

		Object ret = null;
		if (component instanceof PickList) {
			Object dualList = ((PickList) component).getValue();
			DualListModel<Codes> dl = (DualListModel<Codes>) dualList;

			for (Codes codes : dl.getSource()) {
				if ((new Integer(value)).intValue() == codes.getCodeId()) {
					ret = codes;
					break;
				}
			}
			if (ret == null)
				for (Codes codes : dl.getTarget()) {
					if ((new Integer(value)).intValue() == codes.getCodeId()) {
						ret = codes;
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
							Codes val = (Codes) item.getItemValue();
							if (value.equals("" + val.getCodeId())) {
								ret = val;
								break;
							}
						} catch (Exception e) {
						}
					}
				}
			}

			if (itens != null) {
				Set<Codes> values = (Set<Codes>) itens.getValue();
				if (values != null) {
					for (Codes val : values) {
						if (value.equals("" + val.getCodeId())) {
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
			return String.valueOf(((Codes) value).getCodeId());
		else
			return "";
	}

}
