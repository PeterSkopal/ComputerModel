package model;

public abstract class Memory {

	protected Word[] words;

	public Word getWord(Address address) {
		return words[address.getIndex()];
	}

	public void set(int index, Word word) {
		words[index] = word;
	}
}