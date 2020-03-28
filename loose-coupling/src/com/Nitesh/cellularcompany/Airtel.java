package com.Nitesh.cellularcompany;

public class Airtel {

	private Services service;

	public void setService(Services service) {
		this.service = service;
	}

	public void ActivateService() {
		service.service();
	}
}