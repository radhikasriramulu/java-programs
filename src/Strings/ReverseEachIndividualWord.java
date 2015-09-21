/**
 * reverse each individual word in a sentence
 */
package Strings;

public class ReverseEachIndividualWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "how are you";
		String reverseWord ="";
		String[] words = name.split(" ");
		for(int i=0;i<words.length;i++) {
			reverseWord = reverseWord + reverse(words[i])+" ";
		
		}
		System.out.println(reverseWord);
	}
	public static String reverse(String name) {
		String reverse = "";
		for (int i = name.length()-1; i > -1; i--) {
			reverse = reverse + name.charAt(i);
		}
		return reverse;
	}

}
