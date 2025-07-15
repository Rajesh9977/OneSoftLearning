package Condtions;

public class Quetion9 {
	public static void main(String[] args) {
		int age1 = 65;
		int age2 = 20;
		int age3 = 25;
		int age4 = 30;
		if(age1 < age2 && age1 < age3 && age1 < age4) {
			System.out.println("Age1 is less than all "+age1);
		}else if (age2 < age1 && age2 < age3 && age2 < age4) {
			System.out.println("Age 2 is less than all "+age2);
			
		}else if (age3 <age1 && age3<age1 && age3<age4) {
			System.out.println("Age 3 is less than all "+age3);
			
		}else {
			System.out.println("Age 4 is less than all "+age4);
		}
	}

}
