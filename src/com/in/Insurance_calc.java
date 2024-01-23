package com.in;

public class Insurance_calc {
double insurance_price,actpremium;
public void calc(String type , int price) throws Exception
{
if(type.equalsIgnoreCase("Hatchback")) {

insurance_price=0.05*price;

}
else if(type.equalsIgnoreCase("Sedan")) {
	
insurance_price=0.08*price;
}
else if(type.equalsIgnoreCase("SUV")) {
	
insurance_price=0.10*price;
	
} 
else {
	throw new Exception("Wrong Input");
}
	
}
public void actual_premium(String var) {
	if(var.equalsIgnoreCase("premium")) {
	actpremium=insurance_price*0.20;
	}
	else {
		actpremium=insurance_price;
	}
}	
}