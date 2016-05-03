package progOP;

import model.Instructions;
import model.Memory;
import model.ProgramCounter;
import model.MemorySlot;

public class JumpEq extends Jump {
	private MemorySlot x;
	private MemorySlot y;

	public JumpEq(int i, MemorySlot x, MemorySlot y) {
		super(i);
		this.x = x;
		this.y = y;
	}

	public void execute(Memory memory, ProgramCounter progC) {
//		if (x.value(memory) == y.value()) {
//			progC.set(i);
//			return;
//		}
//		progC.next();
//		
		if (x.getWord(memory).equals(y, memory)) {
			progC.set(super.i);
		} else {
			progC.next();
		}
	}

	public String makeString() {
		return "JEQ " + i + " " + x.makeString() + " " + y.makeString();
	}

}
