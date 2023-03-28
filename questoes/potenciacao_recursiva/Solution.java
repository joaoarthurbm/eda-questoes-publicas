import java.util.Scanner;

class Solution {
	
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			long n = sc.nextLong();
			sc.nextLine();
			long a = sc.nextLong();
			sc.nextLine();
			System.out.println(pot(n, a));
					
	}
	
	public static long pot(long n, long a) {
		if (a == 0) {
			return 1;
		} else if (a == 1) {
			return n;
		} else {
			return n * pot(n, a - 1);
		}
	}
}
