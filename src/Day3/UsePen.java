package Day3;

public class UsePen {
	public static void main(String[] args) {
		//classname variable = new classname()
		Pen pen1 = new Pen();
		pen1.brand = "Cello";
		pen1.price = 150;
		pen1.isBlueColor = true;
		pen1.tipWidth = 2.5f;
		
		Pen pen2 = new Pen();
		pen2.brand = "Wipro";
		pen2.price = 120;
		pen2.isBlueColor = false;
		pen2.tipWidth = 0.35f;
		
		Pen pen3 = new Pen();
		pen3.brand = "Tata";
		pen3.price = 130;
		pen3.isBlueColor = true;
		pen3.tipWidth = 0.65f;
		
		float averagevalue = (pen1.price+pen2.price+pen3.price)/3;
		System.out.print(averagevalue);
		
		
	}

}

class Pen{
	String brand;
	float price;
	boolean isBlueColor;
	float tipWidth;
	
}


