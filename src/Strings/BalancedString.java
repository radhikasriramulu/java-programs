/**
 * 1. Ensure starts with (
 * 2. if not step1, then print "is not balanced". 
 * 3. Number of ( is equal to )
 * 4. if not step 3, then print "is not balanced".
 * 
 */
package Strings;

public class BalancedString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isBalanced = true;
		String s = "))((";
		int open=0;
		int close =0;
		for(int i=0 ; i <s.length();i++){
			char c = s.charAt(i);
			if(c == '(') {
				open = open + 1;
			}
			if(c == ')') {
				close = close +1;
			}
			if(open ==0 && close > 0) {
//				System.out.println(" Not balanced");
				isBalanced = false;
				break;
			}
		}
		if(open != close || !isBalanced) {
			System.out.println(" Not balanced");
		}
		else {
			System.out.println("  balanced");
		}
		
		
	}


}
