package Day2;

public class PracticeString {
	public static void main(String[] args) {
		String a = "Java";
		String b = "Developer";
		String c = a.toUpperCase();
		System.out.println(c);
		String d = b.toLowerCase();
		System.out.println(d);
		String e = a.concat("hello");
		System.out.println(e);
		int f = a.length();
		System.out.println(f);
		boolean g = a.equals(b);
		System.out.println(g);
		boolean h = a.equalsIgnoreCase(b);
		System.out.println(h);
		boolean i = a.contains("JaV");
		System.out.println(i);
		boolean j = a.startsWith("h");
		System.out.println(j);
		boolean k = a.endsWith("va");
		System.out.println(k);
		int l = a.indexOf("y");
		System.out.println(l);
		String m = a.substring(2);
		System.out.println(m);
		char n = a.charAt(3);
		System.out.println(n);
		
		
		
		
	}

}
