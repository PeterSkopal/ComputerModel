package model;

public interface Instructions {

	public abstract void execute(Memory memory, ProgramCounter progC);

	public String makeString();

	public String toString();

}
