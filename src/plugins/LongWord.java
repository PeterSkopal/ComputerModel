package plugins;

import model.Memory;
import model.MemorySlot;
import model.Word;

public class LongWord extends Word {
	private long word;

	public LongWord(long word) {
		this.word = word;
	}

	public Word getWord(Memory mem) {
		return this;
	}

	public long value(Memory mem) {
		return word;
	}

	public Word add(Word word, Memory mem) {
		this.word += ((LongWord)word).word;
		return this;
	}

	public Word mul(Word word, Memory mem) {
		this.word *= ((LongWord)word).word;
		return this;
	}
	
	public boolean equals(MemorySlot other, Memory memory) {
		LongWord wrd = (LongWord) other.getWord(memory);
		return this.word == ((LongWord) wrd).word;
	}

	public String toString() {
		return "" + word;
	}

	public String makeString() {
		return toString();
	}

}
