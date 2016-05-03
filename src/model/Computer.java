package model;

public class Computer {

	private Memory mem;
	private Program program;
	private ProgramCounter progC;

	public Computer(Memory mem) {
		this.mem = mem;
		progC = new ProgramCounter();

	}

	public void load(Program program) {
		this.program = program;
	}

	public void run() {
			while (progC.getCount() >= 0) {
				program.get(progC.getCount()).execute(mem, progC);
		}
	}

}
