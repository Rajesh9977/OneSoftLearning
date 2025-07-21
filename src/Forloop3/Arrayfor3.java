package Forloop3;

public class Arrayfor3 {
	public static void main(String[] args) {
		int[] a = {5,3,4,2,4,5,6,1};
		for(int i = 0;i<a.length;i++) {
			for(int j=1+i; j<a.length;j++) {
				if(a[i]+a[j]==7) {
					System.out.println(a[i]+","+a[j]);
					
				}
			}
		}
	}

}
