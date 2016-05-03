package model;

import java.util.ArrayList;

public abstract class Program {

	protected ArrayList<Instructions> list;

	public Program() {

		this.list = new ArrayList<Instructions>();

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {

			sb.append(i + " ");
			sb.append(list.get(i).makeString());
			sb.append("\n");
		}
		return sb.toString();
	}

	public boolean add(Instructions ins) {
		return list.add(ins);
	}

	public Instructions get(int i) {
		return list.get(i);
	}

}
