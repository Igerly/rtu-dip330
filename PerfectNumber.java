import java.util.HashSet;
import java.util.Set;

public class PerfectNumber {

	public static Set<Integer> divisors(int n) {		
        Set<Integer> x = new HashSet<Integer>();
        
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                x.add(i);
            }
        }
 
        return x;		
	}

	public static void detect(int n) {		
		Set<Integer> x = PerfectNumber.divisors(n);
		int sum = -n;

		for (int i : x) {
			sum += i;
		}
		
		if (sum == n) {
			System.out.println("The number " + n + " is a perfect number");
		} else if (sum > n) {
			System.out.println("The number " + n + " is an abundant number");
		} else {
			System.out.println("The number " + n + " is a deficient number");
		}		
	}

	public static void main(String[] args) {

		PerfectNumber.detect(1);
		PerfectNumber.detect(6);
		PerfectNumber.detect(8);
		PerfectNumber.detect(20);
		PerfectNumber.detect(28);		
	}
}
