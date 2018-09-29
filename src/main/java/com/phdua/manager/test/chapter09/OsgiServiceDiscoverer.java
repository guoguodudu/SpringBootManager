//tag::include[]
package com.phdua.manager.test.chapter09;

//end::include[]

import java.util.List;
import javax.validation.ValidationProviderResolver;
import javax.validation.spi.ValidationProvider;

//tag::include[]
public class OsgiServiceDiscoverer implements ValidationProviderResolver {

	@Override
	public List<ValidationProvider<?>> getValidationProviders() {
		//...
		return null;
	}
}
//end::include[]
