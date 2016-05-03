package progOP;

import model.ProgramCounter;
import model.Instructions;
import model.Memory;

public class Jump implements Instructions {
	protected int i;

	public Jump(int i) {
		this.i = i;
	}

	public void execute(Memory memory, ProgramCounter progC) {
		progC.set(i);
		return;
	}

	public String makeString() {
		return "JMP " + i;
	}

}
