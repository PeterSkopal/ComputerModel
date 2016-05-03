package progOP;

import model.Address;
import model.Memory;
import model.MemorySlot;
import model.Word;
import progOP.MathOp;

public class Add extends MathOp {

	public Add(MemorySlot x, MemorySlot y, Address address) {
		super(x, y, address);

	}

	public void op(Word w1, Word w2, Memory mem) {
		w2.add(w1, mem);

	}

	protected String stringOp() {
		return "ADD ";
	}

}
