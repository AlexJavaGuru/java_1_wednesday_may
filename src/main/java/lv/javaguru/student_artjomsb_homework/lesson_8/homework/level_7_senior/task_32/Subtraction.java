package main.java.lv.javaguru.student_artjomsb_homework.lesson_8.homework.level_7_senior.task_32;

class Subtraction extends TwoArgumentMathOperation {

	public Subtraction(MathOperation leftArgument,
                       MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() - calculateRightSide();
	}
}

