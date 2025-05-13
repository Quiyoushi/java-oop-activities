package MAIN;

public class student {
	
	String name;
	double roll_no;
	
	public void student_info(String name,int roll_no){
		
		this.name = name;
		this.roll_no = roll_no;
		
	}

}


class marks extends student{
	
	double m1;
	double m2;
	double m3;
	double total;
	double percentage;

	marks(double m1,double m2,double m3, double total, double percentage){
		
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		this.total=total;
		this.percentage = percentage;
		
			
		
	}

	
	
}



