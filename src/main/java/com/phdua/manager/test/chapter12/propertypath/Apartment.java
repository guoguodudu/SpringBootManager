package com.phdua.manager.test.chapter12.propertypath;

import javax.validation.Valid;

public class Apartment {

	@Valid
	Person resident;

	Apartment(Person resident) {
		this.resident = resident;
	}
}
