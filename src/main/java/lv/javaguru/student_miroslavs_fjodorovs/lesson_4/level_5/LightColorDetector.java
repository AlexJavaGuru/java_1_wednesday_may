package main.java.lv.javaguru.student_miroslavs_fjodorovs.lesson_4.level_5;

class LightColorDetector {

    public String detect(int wavelength) {
        String result;
        if (wavelength > 379 && wavelength <= 449) {
            result = "Violet";
        } else if (wavelength > 449 && wavelength <= 494) {
            result = "Blue";
        } else if (wavelength > 494 && wavelength <= 569) {
            result = "Green";
        } else if (wavelength > 569 && wavelength <= 589) {
            result = "Yellow";
        } else if (wavelength > 589 && wavelength <= 619) {
            result = "Orange";
        } else if (wavelength > 619 && wavelength <= 750) {
            result = "Red";
        } else {
            result = "Invisible Light";
        }
        return result;
    }
}
