package progOP;

import model.Instructions;
import model.Memory;
import model.ProgramCounter;

public class Halt implements Instructions {

	public Halt() {

	}

	public void execute(Memory memory, ProgramCounter progC) {
		progC.set(-1);
	}

	public String makeString() {
		return "HLT";
	}

}
