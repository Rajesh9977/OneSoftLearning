package Forloop2Array;

public class Quetion3 {
	public static void main(String[] args) {
		String[] arr = {"Apple", "Orange","Bananas"};
		for(int i = 0; i<arr.length ; i++) {
			if(arr[i].length()%2==0) {
				System.out.println(arr[i]);
				
			}
		}
		
		for(int j = 0; j<arr.length; j++) {
			
			System.out.println(arr[j].charAt(arr[j].length()-1));
			
		}
		
		for(int k = 0; k<arr.length;k++ ) {
			System.out.println("Lenght of each string "+arr[k]+" : "+arr[k].length());
		}
		
		String max = arr[0];
		for(int l = 0; l<arr.length; l++ ) {
			if(arr[l].length()>max.length()) {
				
				
			}

			
		}

		
		
	}

}
