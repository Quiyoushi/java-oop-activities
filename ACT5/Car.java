package ACT5;

import java.util.Scanner;


public class Car {
	
	private String company_name, model_name, year, mileage;
	
	public void setcompany_name(String company_name) {
		
		this.company_name=company_name;
		
	}
	public void setmodel_name(String model_name) {
		
		this.model_name=model_name;
		
	}
	public void setyear(String year) {
		
		this.year=year;
		
	}
	public String getcompany_name() {
		
		return company_name;
		
	}
	public String getmodel_name(String model_name) {
		
		return model_name;
		
	}
	public String getyear() {
		
		return year;
		
	}
	public String getmileage(){
		
		return mileage;
		
	}
	public void DisplayCar() {
		
		System.out.println("Company Name:"+ company_name);
		System.out.println("Model Name:"+ model_name);
		System.out.println("Year:"+ year);
		System.out.println("Mileage:" + mileage);
		
		
	}
	
	
	
	

}
