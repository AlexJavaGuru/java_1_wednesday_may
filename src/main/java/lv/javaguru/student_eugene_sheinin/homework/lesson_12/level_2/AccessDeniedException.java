package main.java.lv.javaguru.student_eugene_sheinin.homework.lesson_12.level_2;

//таск 17
//Почему класс AccessDeniedException в нашем случае
//        лучше наследовать от Exception, а не от RuntimeException?
// Ответ: потому, что Exception это checked исключение и его принудительно нужно отлавливать в блоке try->catch

public class AccessDeniedException extends Exception{
}
