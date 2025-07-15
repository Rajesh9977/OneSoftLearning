package Day3;

public class UsePens {

	public static void main(String[] args) {
		System.out.println("hello world");
		Pens p1 = new Pens();
		String[] arr = args[0].split(",");
		p1.brand = arr[0];
		p1.price = Integer.parseInt(arr[1]);
		p1.tipwidth = Float.parseFloat(arr[2]);
		p1.color = arr[3];
		
		System.out.println("Brand = "+p1.brand +" Price = "+p1.price+" Tipwidth = "+p1.tipwidth+ " color = "+p1.color);
		
		Pens p2 = new Pens();
		String[] arr2 = args[1].split(",");
		p2.brand = arr2[0];
		p2.price = Integer.parseInt(arr2[1]);
		p2.tipwidth = Float.parseFloat(arr2[2]);
		p2.color = arr2[3];
		System.out.println("Brand = "+p2.brand +" Price = "+p2.price+" Tipwidth = "+p2.tipwidth+ " color = "+p2.color);
		
		
		// TODO Auto-generated method stub

	}

}


class Pens{
	String brand;
	int price;
	float tipwidth;
	String color;
}