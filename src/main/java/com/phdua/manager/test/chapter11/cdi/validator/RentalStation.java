//tag::include[]
package com.phdua.manager.test.chapter11.cdi.validator;

//end::include[]

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

//tag::include[]
@ApplicationScoped
public class RentalStation {

	@Inject
	private ValidatorFactory validatorFactory;

	@Inject
	private Validator validator;

	//...
}
//end::include[]
