package main.java.lv.javaguru.student_rodions_pismennijs.lesson_8.level_7.Math;

class Argument extends MathOperation {

	private double argument;

	public Argument(double argument) {
		this.argument = argument;
	}

	@Override
	public double calculate() {
		return argument;
	}
}
