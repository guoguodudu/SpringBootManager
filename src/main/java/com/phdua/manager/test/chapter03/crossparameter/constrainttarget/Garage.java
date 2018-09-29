//tag::include[]
package com.phdua.manager.test.chapter03.crossparameter.constrainttarget;

//end::include[]

import java.util.List;
import javax.validation.ConstraintTarget;

//tag::include[]
public class Garage {

	@ELAssert(expression = "...", validationAppliesTo = ConstraintTarget.PARAMETERS)
	public Car buildCar(List<Part> parts) {
		//...
		return null;
	}

	@ELAssert(expression = "...", validationAppliesTo = ConstraintTarget.RETURN_VALUE)
	public Car paintCar(int color) {
		//...
		return null;
	}
}
//end::include[]
