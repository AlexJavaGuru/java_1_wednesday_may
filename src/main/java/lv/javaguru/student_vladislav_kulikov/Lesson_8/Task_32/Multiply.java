package lv.javaguru.student_vladislav_kulikov.Lesson_8.Task_32;

class Multiply extends TwoArgumentMathOperation {

	public Multiply(MathOperation leftArgument,
                    MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() * calculateRightSide();
	}
}

