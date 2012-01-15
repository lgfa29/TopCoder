import java.util.Set;
import java.util.HashSet;

public class SquareDigits {
	public int smallestResult(int n) {
		int x = 0;
		
		while (true) {
			if (t(x).contains(n))
				return x;
			x++;
		}
	}
	
	private int s(int x) {
		int sum = 0;
		
		while (x != 0) {
			sum += (x%10) * (x%10);
			x /= 10;
		}
		
		return sum;
	}
	
	private Set<Integer> t(int x) {
		Set<Integer> results = new HashSet<Integer>();
		
		int result = x;
		while (true) {
			result = s(result);
			
			if (results.contains(result))
				return results;
			
			results.add(result);
		}
	}
}