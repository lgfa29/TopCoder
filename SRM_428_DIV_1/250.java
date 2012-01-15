import java.util.Set;
import java.util.HashSet;

public class TheLuckyString {
	Set<String> permutations = new HashSet<String>();
	
	public int count(String s) {
		permute("", s);
		
		int count = 0;
		for(String string : permutations) {
			if (isLucky(string))
				count++;
		}
		
		return count;
	}
	
	private void permute(String head, String tail) {
	
		if (tail.length() <= 1) {
			permutations.add(head + tail);
			return;
		}
		
		for (int i = 0; i < tail.length(); i++) {
			String newHead = head + tail.charAt(i);
			String newTail = tail.substring(0, i) + tail.substring(i + 1);
			
			if (isLucky(newHead))
				permute(newHead, newTail);
		}
	}
	
	private boolean isLucky(String s) {
		char previous = s.charAt(0);
		
		for(int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == previous)
				return false;
			
			previous = s.charAt(i);
		}
		
		return true;
	}
}