package stream;

import java.util.Arrays;

public class StreamEx19 {
	private static int count = 0;

	public void useFor(String[] words){
		count = 0;
		for (String word : words) {
			if(word.length() > 12)
				count++;
		}
	}

	public void useStream(String[] words){
		count = (int) Arrays.stream(words)
				.filter(w -> w.length()>12)
				.count();
	}
}
