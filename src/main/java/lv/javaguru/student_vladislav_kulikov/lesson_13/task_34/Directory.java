package lv.javaguru.student_vladislav_kulikov.lesson_13.task_34;


import java.util.ArrayList;
import java.util.List;

class Directory {

    private String name;
    List<File> fileList = new ArrayList<>();
    List<Directory> directories = new ArrayList<>();

    Directory(String name) {
        this.name = name;
    }

    void addFile(File file) {
        fileList.add(file);
    }

    void deleteFile(File file) {
        fileList.remove(file);
    }

    void addDirectory(Directory directory) {
        directories.add(directory);
    }

    void deleteDirectory(Directory directory) {
        directories.remove(directory);
    }
}
