package Loops;
/**
 * print "ping" if a number is divisible by 3,"pong" 
 * if a number is divisible by 5, and "ping pong" if number is divisible by both, 
 * else print the number
 * @author Radhika
 *
 */
public class PingPong {
	// TODO Auto-generated constructor stub
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.print(" pingpong");
			} else if (i % 3 == 0) {
				System.out.print("  ping");
			} else if (i % 5 == 0) {
				System.out.print(" pong");
			} else {
				System.out.print(" " + i);
			}

		}
	}

}
