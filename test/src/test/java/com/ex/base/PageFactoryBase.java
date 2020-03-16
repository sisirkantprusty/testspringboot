package com.ex.base;

import org.springframework.beans.factory.annotation.Autowired;

public abstract class PageFactoryBase {
	
	@Autowired
	RuntimeConfiguration runtimeConfiguration;
	
	protected String getServerUrl() {
        return runtimeConfiguration.getServerUrl();
    }
}
