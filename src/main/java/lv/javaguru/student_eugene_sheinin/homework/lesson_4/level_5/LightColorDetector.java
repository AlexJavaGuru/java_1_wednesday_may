package lv.javaguru.student_eugene_sheinin.homework.lesson_4.level_5;

class LightColorDetector {

    public String detect(int wavelength) {

        String waveColor = "Invisible Light";

        if (wavelength >= 380 &&  wavelength <= 449) {
            waveColor = "Violet";
        } else if (wavelength >= 450 && wavelength <= 494) {
            waveColor = "Blue";
        } else if (wavelength >= 495 && wavelength <= 569) {
            waveColor = "Green";
        } else if (wavelength >= 570 && wavelength <= 589) {
            waveColor = "Yellow";
        } else if (wavelength >= 590 && wavelength <= 619) {
            waveColor = "Orange";
        } else if (wavelength >= 620 && wavelength <= 750) {
            waveColor = "Red";
        }

        return waveColor;
    }
}


/*
* 380 ... 449 - Фиолетовый ("Violet")
450 ... 494 - Синий ("Blue")
495 ... 569 - Зеленый ("Green")
570 ... 589 - Желтый ("Yellow")
590 ... 619 - Оранжевый ("Orange")
620 ... 750 - Красный ("Red")
* */