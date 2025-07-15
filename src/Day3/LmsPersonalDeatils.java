package Day3;

public class LmsPersonalDeatils {
	public static void main(String[] args) {
		System.out.println("Hello World");
		String[] a = args[0].split(",");
		String[] b = args[1].split(",");
		int age1 = Integer.parseInt(a[1]);
		float weight1 = Float.parseFloat(a[2]);
		int age2 = Integer.parseInt(b[1]);
		float weight2 = Float.parseFloat(b[2]);
		System.out.println("name : "+a[0] +" age :"+age1+" weight :"+weight1);
		System.out.println("name : "+b[0] +" age :"+age2+" weight :"+weight2);
		
		
		System.out.println("Hello World");
		String[] c = args[0].split(",");
		String[] d = args[1].split(",");
		int age3 = Integer.parseInt(c[1]);
		float weight3 = Float.parseFloat(a[2]);
		int age4 = Integer.parseInt(d[1]);
		Float weight4 = Float.parseFloat(d[2]);
		
		
	}

}



