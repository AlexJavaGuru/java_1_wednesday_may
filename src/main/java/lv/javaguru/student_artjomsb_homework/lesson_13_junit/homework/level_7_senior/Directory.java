package lv.javaguru.student_artjomsb_homework.lesson_13_junit.homework.level_7_senior;

import java.util.List;

class Directory extends Resources {
    private final String name;
    private int size;
    private List<Resources> files;

    public Directory(String name) {
        this.name = name;
    }

    int getSize() {
        int size = 0;
        for (Resources resource : files) {
            size += resource.getSize();
        }
        return size;
    }

    int countFileByType(String fileType) {
        int sum = 0;
        for (Resources resource : files) {
            if (((File) resource).getName().endsWith(fileType)) {
                sum++;
            }
        }
        return sum;
    }

    void addFile(Resources resources) {
        files.add(resources);
    }

    void removeFile(Resources resources) {
        files.remove(resources);
    }
}
