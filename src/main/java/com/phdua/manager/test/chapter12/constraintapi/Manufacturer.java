//tag::include[]
package com.phdua.manager.test.chapter12.constraintapi;

//end::include[]

import javax.validation.constraints.NotNull;

//tag::include[]
public class Manufacturer {

	@NotNull
	private String name;

	//...
}
//end::include[]
