package com.ex.base;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;

@Data
@Component
public class RuntimeConfiguration {

	@Getter
	@Value("${clubMarket:}")
	String clubMarket;
	
	@Getter
	@Value("${serverUrl:}")
	String serverUrl;

	public String getClubMarket() {
		return clubMarket;
	}

	public void setClubMarket(String clubMarket) {
		this.clubMarket = clubMarket;
	}

	public String getServerUrl() {
		return serverUrl;
	}

	public void setServerUrl(String serverUrl) {
		this.serverUrl = serverUrl;
	}

}
