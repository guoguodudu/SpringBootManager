//tag::include[]
package com.phdua.manager.test.chapter10;

//end::include[]

import javax.validation.constraints.NotNull;

//tag::include[]
public interface Vehicle {

	public interface Basic {
	}

	@NotNull(groups = Basic.class)
	String getManufacturer();
}
//end::include[]
