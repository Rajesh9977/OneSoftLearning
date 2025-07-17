package Forloop2Array;

public class ArrayConcept {
	public static void main(String[] args) {
		int[] num = new int[5];
		num[0] = 10;
		num[1] = 11;
		num[2] = 12;
		num[3] = 14;
		num[4] = 15;
		
		for(int i = 0; i<num.length;i++) {
			System.out.println(num[i]);
			
		}
		System.out.println(num);
	}

}
