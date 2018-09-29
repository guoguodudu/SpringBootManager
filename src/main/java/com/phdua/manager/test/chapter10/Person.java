//tag::include[]
package com.phdua.manager.test.chapter10;

//end::include[]

import javax.validation.constraints.NotNull;

//tag::include[]
public class Person {

	public interface Basic {
	}

	@NotNull
	private String name;

	//getters and setters ...
}
//end::include[]
