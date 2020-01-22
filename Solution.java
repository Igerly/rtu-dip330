public class Solution {

	static long superDigit(long x) {
		
		if (x == 0 || x < 0) {
			return 0;
		}

		long sum = (x % 10 + superDigit(x / 10));

		if (sum < 10) {
			return sum;
		}

		return superDigit(sum);

	}

	public static void main(String[] args) {
		
		long number = 9875;
		long x = superDigit(number);
		
		if (x == 0) {
			System.out.println(number + " does not have a super digit");
		} else {
			System.out.println("Super digit of " + number + " is " + superDigit(x));
		}
		
	}

}