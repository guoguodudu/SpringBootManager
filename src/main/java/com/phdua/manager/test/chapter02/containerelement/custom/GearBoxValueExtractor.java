//tag::include[]
package com.phdua.manager.test.chapter02.containerelement.custom;

//end::include[]

import javax.validation.valueextraction.ExtractedValue;
import javax.validation.valueextraction.ValueExtractor;

//tag::include[]
public class GearBoxValueExtractor implements ValueExtractor<GearBox<@ExtractedValue ?>> {

	@Override
	public void extractValues(GearBox<@ExtractedValue ?> originalValue, ValueReceiver receiver) {
		receiver.value( null, originalValue.getGear() );
	}
}
//end::include[]
