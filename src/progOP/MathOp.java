package progOP;

import plugins.LongWord;
import model.Address;
import model.Instructions;
import model.Memory;
import model.MemorySlot;
import model.ProgramCounter;
import model.Word;

public abstract class MathOp implements Instructions {
	protected MemorySlot x, y;
	protected Address address;
	protected ProgramCounter progC;

	public MathOp(MemorySlot x, MemorySlot y, Address address) {
		this.x = x;
		this.y = y;
		this.address = address;
	}

	public void execute(Memory mem, ProgramCounter progC) {
		op(y.getWord(mem), mem.getWord(address), mem);
		progC.next();
		
	}

	protected abstract String stringOp();
	
	protected abstract void op(Word w1, Word w2, Memory mem);

	public String makeString() {
		return new String(stringOp() + x.makeString() + " " + y.makeString()
				+ " " + address.makeString());
	}

}
