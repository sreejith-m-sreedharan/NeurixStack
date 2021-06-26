package com.neurix.stack.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neurix.stack.entity.PageConfig;
import com.neurix.stack.services.UIProviderService;

@RestController
@RequestMapping("/uiEngine/")
public class UIController {
	@Autowired
	UIProviderService uiProvider;
	
	@GetMapping("/pageConfig/{pageName}")
	public ResponseEntity<PageConfig> getPageConfig(@PathVariable String pageName){
		return new ResponseEntity<PageConfig>(uiProvider.getPage(pageName), HttpStatus.OK);
	}
}
