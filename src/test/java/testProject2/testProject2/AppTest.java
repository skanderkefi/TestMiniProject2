package testProject2.testProject2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
   
{
	@Test
	public void testAirport() {
		Flight ecoF = new Flight("1", "Economy");
		Flight busiF = new Flight("2", "Business");

		
		Passenger john = new Passenger("john", true);
		Passenger mike = new Passenger("mike", false);

		assertEquals(true, ecoF.addPassenger(john));
		assertEquals(true, ecoF.removePassenger(john));
		assertEquals(true, busiF.addPassenger(john));
		assertEquals(false, busiF.removePassenger(john));

		assertEquals(true, ecoF.addPassenger(mike));
		assertEquals(false, ecoF.removePassenger(mike));
		assertEquals(false, busiF.addPassenger(mike));
		assertEquals(false, busiF.removePassenger(mike));
}
}
