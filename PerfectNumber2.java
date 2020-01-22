import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

public class PerfectNumber2 {

	public static Set<Integer> divisors(int n) {
        Set<Integer> x = new HashSet<Integer>();
        
		IntStream.rangeClosed(1, n/2).filter(i -> n % i == 0).forEach(i -> x.add(i));
 
        return x;
	}

	public static void detect(int n) {
		Set<Integer> x = PerfectNumber2.divisors(n);
		
		int sum = x.stream().mapToInt(Integer::intValue).sum();
		
		if (sum == n) {
			System.out.println("The number " + n + " is a perfect number");
		} else if (sum > n) {
			System.out.println("The number " + n + " is an abundant number");
		} else {
			System.out.println("The number " + n + " is a deficient number");
		}
	}

	public static void main(String[] args) {

		PerfectNumber2.detect(1);
		PerfectNumber2.detect(6);
		PerfectNumber2.detect(8);
		PerfectNumber2.detect(20);
		PerfectNumber2.detect(28);
	}
}