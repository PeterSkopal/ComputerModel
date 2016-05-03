package progOP;

import model.*;

public class Copy implements Instructions {
	private Word word;
	private Address address;

	public Copy(Word word, Address address) {
		this.address = address;
		this.word = word;
	}

	public void execute(Memory mem, ProgramCounter progC) {
		
		mem.set(address.getIndex(), word.getWord(mem));
		progC.next();
	}

	public String makeString() {
		return "CPY " + word.makeString() + " " + address.makeString();
	}

}
