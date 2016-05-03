package progOP;

import model.Address;
import model.Instructions;
import model.Memory;
import model.ProgramCounter;

public class Print implements Instructions {

	private Address address;

	public Print(Address address) {
		this.address = address;
	}

	public void execute(Memory memory, ProgramCounter progC) {
		System.out.println(memory.getWord(address));
		progC.next();
	}

	public String makeString() {
		return "PRT " + address.makeString();
	}

}
