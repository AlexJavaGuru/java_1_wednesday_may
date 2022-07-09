package main.java.lv.javaguru.student_rodions_pismennijs.lesson_4.level_5;

class LightColorDetector {
    public String detect(int waveLength) {
        String result;
        if (waveLength >= 380 && waveLength < 450) {
            result = "Violet";
        } else if (waveLength >= 450 && waveLength < 495) {
            result = "Blue";
        } else if (waveLength >= 495 && waveLength < 570) {
            result = "Green";
        } else if (waveLength >= 570 && waveLength < 590) {
            result = "Yellow";
        } else if (waveLength >= 590 && waveLength < 620) {
            result = "Orange";
        } else if (waveLength >= 620 && waveLength <= 750) {
            result = "Red";
        } else {
            result = "Invisible Light";
        }
        return result;
    }
}
