package main.java.lv.javaguru.student_artjomsb_homework.homework4.level_7_senior.solutions.super_task_2;

import main.java.lv.javaguru.teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_2.LeapYear;

public class LeapYearTest {

	public static void main(String[] args) {
		LeapYearTest test = new LeapYearTest();
		test.shouldBeRegularYearIfNotDevidedBy4();
		test.shouldBeLeapYearIfDevidedBy4AndNotDevidedBy100();
		test.shouldBeLeapYearIfDevidedBy4AndDevidedBy100AndDividedBy400();
		test.shouldBeRegularYearIfDevidedBy4AndDevidedBy100AndNotDividedBy400();
	}

	public void shouldBeRegularYearIfNotDevidedBy4() {
		main.java.lv.javaguru.teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_2.LeapYear leapYear = new main.java.lv.javaguru.teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_2.LeapYear();
		checkResults(!leapYear.isLeapYear(2), "shouldBeRegularYearIfNotDevidedBy4");
	}

	public void shouldBeLeapYearIfDevidedBy4AndNotDevidedBy100() {
		main.java.lv.javaguru.teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_2.LeapYear leapYear = new main.java.lv.javaguru.teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_2.LeapYear();
		checkResults(leapYear.isLeapYear(80), "shouldBeLeapYearIfDevidedBy4AndNotDevidedBy100");
	}

	public void shouldBeLeapYearIfDevidedBy4AndDevidedBy100AndDividedBy400() {
		main.java.lv.javaguru.teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_2.LeapYear leapYear = new main.java.lv.javaguru.teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_2.LeapYear();
		checkResults(leapYear.isLeapYear(400), "shouldBeLeapYearIfDevidedBy4AndDevidedBy100AndDividedBy400");
	}

	public void shouldBeRegularYearIfDevidedBy4AndDevidedBy100AndNotDividedBy400() {
		main.java.lv.javaguru.teacher.lesson_4_if_statement.homework.level_7_senior.solutions.super_task_2.LeapYear leapYear = new LeapYear();
		checkResults(!leapYear.isLeapYear(500), "shouldBeRegularYearIfDevidedBy4AndDevidedBy100AndNotDividedBy400");
	}

	private void checkResults(boolean condition, String testName) {
		if (condition) {
			System.out.println(testName + " = OK");
		} else {
			System.out.println(testName + " = FAIL");
		}
	}

}
