package Forloop3;

public class Arrayfor4 {
	public static void main(String[] args) {
		String a = "Java is a program and Java is a hello";
		String[] b = a.split(" ");
		for(int i =0;i<b.length;i++) {
			int count = 0;
			for(int j=1+i;j<b.length;j++) {
				if(b[i]==b[j]) {
					count++;
					b[j]="#";
					
				}
			}
			if(count>0 && b[i]!="#") {
				System.out.println("Repeated: " +b[i]+","+count);
			}
		
			
		}
	}

}
