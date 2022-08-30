package lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_7.math_operations;

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
