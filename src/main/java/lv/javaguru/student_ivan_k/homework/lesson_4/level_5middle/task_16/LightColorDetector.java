package lv.javaguru.student_ivan_k.homework.lesson_4.level_5middle.task_16;

class LightColorDetector {
    public String detect (int wavelength){
        String result;

        if (wavelength >= 380 && wavelength <= 449){
            result = "Violet";
        }else if(wavelength >= 450 && wavelength <= 494){
            result = "Blue";
        }else if( wavelength >= 495 && wavelength <= 569){
            result = "Green";
        }else if ( wavelength >= 570 && wavelength <= 589){
            result = "Yellow";
        }else if( wavelength >= 590 && wavelength <= 619){
            result = "Orange";
        }else if ( wavelength >= 620 && wavelength <= 750){
            result = "Red";
        }else {
            result = "Invisible Light";
        }
        return result;

    }
}
