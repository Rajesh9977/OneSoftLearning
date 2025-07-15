package Condtions;

public class CondtionSwitch {
	public static void main(String[] args) {
		char dir = 'w';
		switch(dir){
			case 'n':
				System.out.println("North");
			    break;
			case 'w':
				System.out.println("West");
			break;
			case 'e':
				System.out.println("East");
			    break;
			case 's':
				System.out.println("South");
				break;
			default:
				System.out.println("Invalid");
				break;
				
			
		}
	}

}
