//tag::include[]
package com.phdua.manager.test.chapter05;

//end::include[]

import javax.validation.constraints.NotNull;

//tag::include[]
public class Person {

	@NotNull
	private String name;

	public Person(String name) {
		this.name = name;
	}

	// getters and setters ...
}
//end::include[]
