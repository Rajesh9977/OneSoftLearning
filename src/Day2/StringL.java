package Day2;

public class StringL {
	public static void main(String[] args) {
		String name = "varsha";
		String upper = name.toUpperCase();
		System.out.println(name.toUpperCase());
		System.out.println(upper);
		String name1 = "Vaishu";
		String a = name.concat(name1);
		System.out.println(a);
		
		String b = "Java";
		String c = "Developer";
		String d = b.concat(c);
		System.out.println(d);
		System.out.println(b.length());
		System.out.println(name.contains("va"));
		System.out.println(name.startsWith("v"));
		System.out.println(name.startsWith("va"));
		System.out.println(name.endsWith("ha"));
		System.out.println(name.indexOf("a"));
		System.out.println(name.substring(2,5));
		System.out.println(name.charAt(0));
		
		
	}

}
