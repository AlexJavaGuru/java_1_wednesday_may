package lv.javaguru.student_artjomsb_homework.homework4.level_5_middle;

class LightColorDetector {
    public String detect(int waveLength) {
        String color;

        if (waveLength >= 380 && waveLength < 450) {
            color = "Violet";
        } else if (waveLength >= 450 && waveLength < 495) {
            color = "Blue";
        } else if (waveLength >= 495 && waveLength < 570) {
            color = "Green";
        } else if (waveLength >= 570 && waveLength < 590) {
            color = "Yellow";
        } else if (waveLength >= 590 && waveLength < 620) {
            color = "Orange";
        } else if (waveLength >= 620 && waveLength <= 750) {
            color = "Red";
        } else {
            color = "Invisible Light";
        }
        return color;
    }
}
