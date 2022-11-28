
public class Length {
	public static void main(String args[]) {
		String str = "this is a string";
		int count = 0;
		for (int i = 1; i <= str.length(); i++) {// i=i+1 --- i++
			count++;
		}
		System.out.println("string str" + count);
	}
}