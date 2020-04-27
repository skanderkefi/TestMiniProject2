package testProject2.testProject2;

import java.util.ArrayList;  
import java.util.Collections;
import java.util.List;


public class Flight {
	private String id, flightType;
	private List<Passenger> passengerList = new ArrayList<Passenger>();
	
	public Flight(String id, String flightType) {
		this.id = id;
		this.flightType = flightType;
	}
	
	public String getId() {
		return this.id;
	}
	
	public List<Passenger> getPessengerList() {
		return Collections.unmodifiableList(passengerList);
	}
	
	public String getFLightType() {
		return this.flightType;
	}
	
	public boolean addPassenger(Passenger passenger) {
		switch(flightType) {
		case "Economy":
			return passengerList.add(passenger);
		case "Business":
			if(passenger.isVip())
				return passengerList.add(passenger);
			return false;
		default:
			throw new RuntimeException("unknown type: "+ flightType);
		}
	}
	
	public boolean removePassenger(Passenger passenger) {
		switch(flightType) {
		case "Economy":
			if(passenger.isVip()) {
				return passengerList.remove(passenger);}
		 return false;
		case "Business" :
			return false;
		default:
			throw new RuntimeException("unknown type" + flightType);
		
						
		}
	}}
	
	
