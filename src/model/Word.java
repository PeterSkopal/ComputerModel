package model;

public abstract class Word implements MemorySlot {

	public String makeString() {
		return this.toString();
	}

	public abstract Word getWord(Memory mem);

	public abstract Word add(Word word, Memory mem);

	public abstract Word mul(Word word, Memory mem);
	
	public abstract boolean equals(MemorySlot other, Memory memory);
}
