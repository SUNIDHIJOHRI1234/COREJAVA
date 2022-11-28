
public class hi {

	public static void main(String[] args) {
		String str = "this is a string";
		System.out.println("str-a,e,i,o,u");
		int vowels = 0, consonant = 0, spaces = 0;
		for (int j = 1; j < str.length(); j++) {
			if (str.charAt(j) == ' ') {
				spaces++;
			} else if (str.charAt(j) == 'u' || str.charAt(j) == 'o' || str.charAt(j) == 'i' || str.charAt(j) == 'e'
					|| str.charAt(j) == 'a') {
				vowels++;
			} else {
				consonant++;
			}
		}
		System.out.println("Vowels ::" + vowels);
		System.out.println("Constants ::" + consonant);
		System.out.println("Spaces ::" + spaces);
		

	}

}
