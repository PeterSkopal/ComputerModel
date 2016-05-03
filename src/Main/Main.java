package Main;
import model.*;
import plugins.*;

public class Main {
	public static void main(String[] args) {
	    Program factorial = new Factorial();
	    System.out.println(factorial);
	    Computer computer = new Computer(new LongMemory());
	    computer.load(factorial);
	    computer.run();
	}
}
