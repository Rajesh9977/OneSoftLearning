package Day3;

public class LmsFloat {
	public static void main(String[] args) {
		System.out.println("Learing about lms float");
		float a = Float.parseFloat(args[0]);
		float b = Float.parseFloat(args[1]);
		float c = Float.parseFloat(args[2]);
		float d = Float.parseFloat(args[3]);
		
		System.out.println("sum : "+a+" "+b+" "+c+" "+d);
		float sum = a+b+c+d;
		System.out.println(sum);
		System.out.println(sum/4);
	}

}
