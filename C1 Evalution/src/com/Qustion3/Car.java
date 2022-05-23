package com.Qustion3;

public class Car {
	String model;
	String companyName;
	String Color;

	
	public Car(String model,String companyName,String Color) {
		this.model = model;
		this.companyName = companyName;
		this.Color = Color;
	}
	public void setmodel(String model) {
		this.model = model;
	}
	public String getmodel() {
		return model;
	}
	public void setcompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getcompanyName() {
		return companyName;
	}
	
	public void setColor(String Color) {
		this.Color = Color;
	}
	public String getColor() {
		return Color;
	}

	public void showdetails() {
		System.out.println("model is :"+model);
		System.out.println("Companey name is :"+companyName);
		System.out.println("colore is :"+Color);
	}

}
