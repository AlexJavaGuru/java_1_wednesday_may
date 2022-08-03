package main.java.lv.javaguru.student_alija_alijeva.lesson4.level_5.task_16;

class LightColorDetector {
    public String detect(int wavelength) {
        String color;
        if (wavelength >= 380 && wavelength <= 449) {
            color = "Violet";
        } else if (wavelength > 449 && wavelength <= 494) {
            color = "Blue";
        } else if (wavelength > 494 && wavelength <= 569) {
            color = "Green";
        } else if (wavelength > 569 && wavelength <= 589) {
            color = "Yellow";
        } else if (wavelength > 589 && wavelength <= 619) {
            color = "Orange";
        } else if (wavelength > 619 && wavelength <= 750) {
            color = "Red";
        } else {
            color = "Invisible Light";
        }
        return color;
    }
}
