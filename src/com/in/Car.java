package com.in;
import java.util.*;
public class Car {

	public static void main(String[] args)throws Exception {
	String model;
    String cartype;
	String insure;
	int cost;
	Input i=new Input();
	Insurance_calc myobj= new Insurance_calc();
	Scanner sc = new Scanner (System.in);
	String user = "y";
	while(user.equalsIgnoreCase("y"))
	{	
	System.out.println("enter the car model");
	model=sc.nextLine();
	i.setModel(model);
	System.out.println("enter the car type");
	cartype= sc.nextLine();
	i.setCartype(cartype);
	System.out.println("enter the insurance type");
	insure=sc.nextLine();
	i.setInsure(insure);
	System.out.println("enter the costing value");
	cost=sc.nextInt();
	i.setCost(cost);
	myobj.calc(i.getCartype(),i.getCost());
	myobj.actual_premium(i.getInsure());

	System.out.println("carModel:" + model);
	System.out.println("Price:" + cost);
	System.out.println("TotalInsurance:" + myobj.actpremium);
	System.out.println("Do you want to enter details of any other car (y/n):");
	
	user = sc.next();
	sc.nextLine();
	}
	}
}
