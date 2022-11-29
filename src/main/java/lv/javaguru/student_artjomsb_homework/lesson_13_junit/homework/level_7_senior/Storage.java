package lv.javaguru.student_artjomsb_homework.lesson_13_junit.homework.level_7_senior;

class Storage {
    Directory rootDirectory;

    public Directory rootDirectory() {
        return new Directory("/");
    }

    public int totalSize() {
        return rootDirectory().getSize();
    }

    public int totalMP3() {
        return rootDirectory().countFileByType("mp3");
    }
}