package com.neurix.stack.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.neurix.stack.entity.ElementConfig;
import com.neurix.stack.entity.PageConfig;
import com.neurix.stack.config.Constants;

@Service
public class UIProviderService {
	public PageConfig getPage(String pageName) {
			PageConfig pc = new PageConfig();
			ArrayList <ElementConfig> elems = new ArrayList<ElementConfig>();
			
			elems.add(new ElementConfig("Username", Constants.TXT_SINGLE , null, null));
			elems.add(new ElementConfig("password", Constants.TXT_PWD , null, null));
			elems.add(new ElementConfig("firstname", Constants.TXT_SINGLE , "sreejith", null));
			elems.add(new ElementConfig("Login", Constants.BUTTON_SUBMIT , "Login", null));
			
			pc.setElems(elems);
			pc.setName(pageName);
			
			return pc;
	 
	}
}
