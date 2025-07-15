package Day3;

public class UseCars {
	public static void main(String[] args) {
		System.out.println("So here we are learing how to work with args with bean class and main method");
		Cars c1 = new Cars();
		String[] arr1 = args[0].split(",");
		c1.brand = arr1[0];
		c1.price = Integer.parseInt(arr1[1]);
		c1.taxPercentage = Integer.parseInt(arr1[2]);
		c1.color = arr1[3];
		c1.percentage = (c1.price*c1.taxPercentage)/100;
		c1.netprice = c1.price+c1.percentage;
		char c = arr1[0].charAt(2);
		char d = arr1[0].charAt(arr1[0].length()-1);
		System.out.println("Brand "+d+ " Price will be "+ c1.netprice+" Color is "+c1.color);
		
		Cars c2 = new Cars();
		String[] arr2 = args[1].split(",");
		c2.brand = arr2[0];
		c2.price = Integer.parseInt(arr2[1]);
		c2.taxPercentage = Integer.parseInt(arr2[2]);
		c2.percentage = (c2.price*c2.taxPercentage)/100;
		c2.netprice = c2.price+c2.percentage;
		c2.color = arr2[3];
		char d2 = arr2[0].charAt(arr2[0].length()-1);
		System.out.println("Brand "+d2+ " Price will be "+ c2.netprice+" Color is "+c2.color);
		
		Cars c3 = new Cars();
		String[] arr3 = args[2].split(","); //converting into array
		c3.brand = arr3[0];
		c3.price = Integer.parseInt(arr3[1]);
		c3.taxPercentage = Integer.parseInt(arr3[2]);
		c3.percentage = (c3.price*c3.taxPercentage)/100;
		c3.netprice = c3.price+c3.percentage;
		c3.color = arr3[3];
		char d3 = arr3[0].charAt(arr3[0].length()-1); //why we have used parentisis because it string.
		System.out.println("Brand "+d3+ " Price will be "+ c3.netprice+" Color is "+c3.color);
		
		
		
		
	}

}

class Cars{
	String brand;
	int price;
	int taxPercentage;
	String color;
	int netprice;
	int percentage;
}
