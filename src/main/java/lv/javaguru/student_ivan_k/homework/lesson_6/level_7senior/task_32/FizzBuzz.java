package lv.javaguru.student_ivan_k.homework.lesson_6.level_7senior.task_32;

class FizzBuzz {
    

        public String detect(int number) {
            int initialNumber = number;


            if ((initialNumber % 3 == 0) && (initialNumber % 5 == 0))
                return "FizzBuzz";
            else if (initialNumber % 3 == 0)
                return "Fizz";
            else if (initialNumber % 5 == 0)
                return "Buzz";
            else return "" + initialNumber;
        }

}
