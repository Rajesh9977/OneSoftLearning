package Day3;

public class LmsInteger {
	public static void main(String[] args) {
		System.out.println("Learning about type conversion");
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		int e = Integer.parseInt(args[4]);
		
		System.out.println(a + " "+b+" "+c+ " "+d+" "+e);
		int sum = a+b+c+d;
		System.out.println(sum);
		System.out.println(sum/4);
		
	}
	

}
