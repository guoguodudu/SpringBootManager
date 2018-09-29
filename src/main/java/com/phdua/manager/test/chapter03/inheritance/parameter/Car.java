//tag::include[]
package com.phdua.manager.test.chapter03.inheritance.parameter;

//end::include[]

import javax.validation.constraints.Max;

//tag::include[]
public class Car implements Vehicle {

	@Override
	public void drive(@Max(55) int speedInMph) {
		//...
	}
}
//end::include[]
