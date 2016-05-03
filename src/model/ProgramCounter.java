package model;

public class ProgramCounter {
	private int i;

	public ProgramCounter() {
		i = 0;
	}

	public void next() {
		i++;

	}

	public void set(int s) {
		i = s;
	}

	public int getCount() {
		return i;
	}
}
