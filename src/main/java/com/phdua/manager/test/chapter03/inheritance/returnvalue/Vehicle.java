//tag::include[]
package com.phdua.manager.test.chapter03.inheritance.returnvalue;

//end::include[]

import java.util.List;
import javax.validation.constraints.NotNull;

//tag::include[]
public interface Vehicle {

	@NotNull
	List<Person> getPassengers();
}
//end::include[]
