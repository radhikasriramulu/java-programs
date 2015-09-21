package Strings;

public class SubStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abcdefgh";
		System.out.println(s.substring(4));
		System.out.println(s.substring(4, 6));
		System.out.println("Length()" + s.length());
		char[] charArray = s.toCharArray();
		System.out.println("Length" + charArray.length);

	}

}
