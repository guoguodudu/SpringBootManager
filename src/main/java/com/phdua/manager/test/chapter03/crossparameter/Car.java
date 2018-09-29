//tag::include[]
package com.phdua.manager.test.chapter03.crossparameter;

//end::include[]

import java.util.List;

//tag::include[]
public class Car {

	@LuggageCountMatchesPassengerCount(piecesOfLuggagePerPassenger = 2)
	public void load(List<Person> passengers, List<PieceOfLuggage> luggage) {
		//...
	}
}
//end::include[]
