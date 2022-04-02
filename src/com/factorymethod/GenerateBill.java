package com.factorymethod;

public class GenerateBill {
	
	public static void main(String[] args) {
		
		GetPlanFactory planfactory = new GetPlanFactory();
		
		Plan p =planfactory.getPlan("CommercialPlan");
		
		p.gateRate();
		p.calculateBill(12);
	}
}
