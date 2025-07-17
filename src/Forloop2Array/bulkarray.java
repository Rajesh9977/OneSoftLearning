package Forloop2Array;

public class bulkarray {

	public static void main(String[] args) {
		int[] num = {10, 20,30,43,50};
		for(int i =0;i<num.length ;i++) {
			if(num[i]%2==0)
			System.out.println(num[i]);
			
		}
		int max = num[0];
		
		for(int j=0; j<num.length;j++ ) {
			if(num[j]>max) {
				max = num[j];
			}
			
			
			
		}
		System.out.println("Maximum: "+max);

	}

}
