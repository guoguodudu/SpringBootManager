//tag::include[]
package com.phdua.manager.test.chapter02.inheritance;

//end::include[]

import javax.validation.constraints.NotNull;

//tag::include[]
public class Car {

	private String manufacturer;

	@NotNull
	public String getManufacturer() {
		return manufacturer;
	}

	//...
}
//end::include[]
