public class HowEasy {
	public int pointVal (String str) {
		String[] tokens = str.split("\\s+");
		
		int sum = 0;
		int numWords = 0;
		
		for (String token : tokens) {
			if (token.matches("[a-zA-Z]+\\.?")) {
				sum += token.length() - (token.endsWith(".") ? 1 : 0);
				numWords++;
			}
		}
		
		int avg;
		
		if (numWords == 0)
			avg = 0;
		else
			avg = sum / numWords;
		
		if (avg <= 3) {
			return 250;
		} else if (avg == 4 || avg == 5) {
			return 500;
		} else {
			return 1000;
		}
	}
}