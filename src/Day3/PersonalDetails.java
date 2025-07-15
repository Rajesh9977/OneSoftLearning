package Day3;

public class PersonalDetails {
	public static void main(String[] args) {
		System.out.println("hello world");
		float b = Float.parseFloat(args[2]);
		float h = Float.parseFloat(args[4]);
		float sum = b+h;
		boolean d = Boolean.parseBoolean(args[3]);
		char c = args[5].charAt(0);
		long l = Long.parseLong(args[6]);
		int a = Integer.parseInt(args[1]);
		int z = 3;
		
		System.out.println("Name : "+args[0] + " age : "+a + " weight : "+b+" Ismale : "+d+" height : "+h+" Intial :  "+c+ " Contact : "+l);
		System.out.println("Sum of height and weight : " +sum);
		System.out.println(z+a);
	
		}

}
