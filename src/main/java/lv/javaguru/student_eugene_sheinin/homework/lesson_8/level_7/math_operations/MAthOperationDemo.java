package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_8.level_7.math_operations;

class MAthOperationDemo {

	public static void main(String[] args) {

		//build and calculate: (10 - 5) * (20 / 5)
		System.out.println(
				new Multiply(
						new Subtraction(new Argument(10), new Argument(5)),
						new Divide(new Argument(20), new Argument(5))
				).calculate()
		);

	}

}
