package plugins;

import model.Memory;
import model.Word;

public class LongMemory extends Memory {

	public LongMemory() {
		words = new Word[1024];
		for (int i = 0; i < words.length; i++) {
			words[i] = new LongWord(0);
		}
	}
}
