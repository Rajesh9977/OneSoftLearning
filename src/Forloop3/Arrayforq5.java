package Forloop3;

public class Arrayforq5 {
	public static void main(String[] args) {
		String a = "Java is a program and Java is a is pm";
		String[] b = a.split(" ");
		for(int i=0;i<b.length;i++) {
			int count = 0;
			for(int j=1+i; j<b.length; j++) {
				if(b[i].equals(b[j])) {
					count++;
					b[j]="#";
				}
				
			}
			if(count>0&& b[i]!="#") {
				System.out.println(b[i] +","+count);
			}
		}
	}

}
