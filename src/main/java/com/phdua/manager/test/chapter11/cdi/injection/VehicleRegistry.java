package com.phdua.manager.test.chapter11.cdi.injection;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class VehicleRegistry {

	public boolean isValidLicensePlate(String licensePlate) {
		return true;
	}
}
