package Day2;

public class LtoCharArray {
	public static void main(String[] args) {
		String str = "JavaDeveloper";
		char []arr = str.toCharArray(); //it will change the char into an array
		System.out.println(arr);
		char a = arr[0];
		System.out.println(a);
		char last = arr[arr.length-1];
		System.out.println(last);
		System.out.println(arr.length);
		
	}

}
