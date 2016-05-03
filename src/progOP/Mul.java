package progOP;

import model.Address;
import model.Memory;
import model.MemorySlot;
import model.Word;
import progOP.MathOp;

public class Mul extends MathOp {

	public Mul(MemorySlot x, MemorySlot y, Address address) {
		super(x, y, address);
	}

	public void op(Word w1, Word w2, Memory mem) {
		w2.mul(w1, mem);
	}

	protected String stringOp() {
		return "MUL ";
	}

}
