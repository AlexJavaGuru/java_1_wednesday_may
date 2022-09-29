package main.java.lv.javaguru.student_andrei_de.Homework.lesson4;

public class LightColorDetector {
    public String detect(int length){
        String result;
        if (length >= 380 && length<= 449){
            result = "Violet";
        } else if (length >= 450 && length<= 494){
            result = "Blue";
        } else if (length >= 495 && length<= 569){
            result = "Green";
        } else if (length >= 570 && length<= 589){
            result = "Yellow";
        } else if (length >= 590 && length <= 619){
            result = "Orange";
        } else if (length >= 620 && length <= 750){
            result = "Red";
        } else {
            result  = "Invisible Light";
        }

        return result;
    }
}
