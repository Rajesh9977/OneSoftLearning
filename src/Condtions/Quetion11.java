package Condtions;

public class Quetion11 {
	public static void main(String[] args) {
		int marks =  68;
		if(marks>90) {
			System.out.print("A Grade");
		}else if(marks<=90 && marks>80) {
			System.out.println("B Grade");
		}else if (marks<=80 && marks>70) {
			System.out.println("C Grade");
		}else if (marks<=70 && marks>60) {
			System.out.println("D Grade : " + marks );
		}else if (marks<=60 && marks>50) {
			System.out.println("E Grade");
		}else {
			System.out.println("Fail");
		}
		
		
		
	}
	

}
