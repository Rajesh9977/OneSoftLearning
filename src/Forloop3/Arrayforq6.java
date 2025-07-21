package Forloop3;

import java.util.Arrays;

public class Arrayforq6 {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		int[] nums = {1,2,3,4,5};
		int[] c = {19,18,12,14};
//		Boolean a = Arrays.equals(num,nums);
		System.out.println(Arrays.equals(num, nums));
		Arrays.sort(c);
		for(int d: c) {
			System.out.print(d+",");
		}
		
		
	}
	

}
