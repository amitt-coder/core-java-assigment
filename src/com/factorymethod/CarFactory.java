package com.factorymethod;

public class CarFactory {
	
	public static Car getCarFactory(String carType ) {
		if(carType == null) {
			return null;
		}
		
		if(carType.equalsIgnoreCase("Bmw")) {
			return new Bmw();
		}
		else if(carType.equalsIgnoreCase("Bugatti")) {
			return new Bugatti();
		}
		else if(carType.equalsIgnoreCase("Jaguar")) {
			return new Jaguar();
		
		}
		else if(carType.equalsIgnoreCase("Alto")) {
			return new Alto();
		}
		else if(carType.equalsIgnoreCase("Swift")) {
			return new Swift();
		}
		else if(carType.equalsIgnoreCase("Baleno")) {
			return new Baleno();
		}
		else if(carType.equalsIgnoreCase("TataNexon")) {
			return new TataNexon();
		}
		else {
			return null;
		}
	}
}
