//tag::include[]
package com.phdua.manager.test.chapter03.inheritance.parallel;

//end::include[]

import javax.validation.constraints.Max;

//tag::include[]
public interface Vehicle {

	void drive(@Max(75) int speedInMph);
}
//end::include[]
