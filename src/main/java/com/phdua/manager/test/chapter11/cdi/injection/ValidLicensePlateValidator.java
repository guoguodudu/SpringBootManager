//tag::include[]
package com.phdua.manager.test.chapter11.cdi.injection;

//end::include[]

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.inject.Inject;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

//tag::include[]
public class ValidLicensePlateValidator
		implements ConstraintValidator<ValidLicensePlate, String> {

	@Inject
	private VehicleRegistry vehicleRegistry;

	@PostConstruct
	public void postConstruct() {
		//do initialization logic...
	}

	@PreDestroy
	public void preDestroy() {
		//do destruction logic...
	}

	@Override
	public void initialize(ValidLicensePlate constraintAnnotation) {
	}

	@Override
	public boolean isValid(String licensePlate, ConstraintValidatorContext constraintContext) {
		return vehicleRegistry.isValidLicensePlate( licensePlate );
	}
}
//end::include[]
