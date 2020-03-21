package com.ex.pageobjects;

import org.springframework.beans.factory.annotation.Autowired;

import com.ex.base.RuntimeConfiguration;

public abstract class PageFactoryBase {
	
	@Autowired
	RuntimeConfiguration runtimeConfiguration;
	
	protected String getServerUrl() {
        return runtimeConfiguration.getServerUrl();
    }
}
