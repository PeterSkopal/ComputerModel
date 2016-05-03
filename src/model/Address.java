package model;

public class Address implements MemorySlot {
	private int x;

	public Address(int x) {
		this.x = x;
	}

	public int getIndex() {
		return x;
	}

	@Override
	public Word getWord(Memory mem) {
		return mem.getWord(this);
	}

	public String makeString() {
		return new String("[" + x + "]");
	}
}
