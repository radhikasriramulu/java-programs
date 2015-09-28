package Strings;

public class ReverseUsingStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String reverseStr = "One two three";
		String[] split = reverseStr.split(" ");
		for(int i=split.length-1;i>=0;i--) {
//			StringBuilder builder = new StringBuilder(split[i]);
			System.out.print(split[i] + " ");
		}
	}

}
