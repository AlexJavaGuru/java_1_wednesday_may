package lv.javaguru.student_vladislav_kulikov.lesson_13.task_34;

class Storage {
    Directory directory;

    public Storage() {
        directory.addFile(new File("Summer 2022", 200));
    }

    Directory rootDirectory() {
        return directory;
    }

    int totalSize() {
        int count = 0;
        for (File file : directory.fileList ) {
            count += file.getSize();
        }
        return count;
    }

    int totalMP3() {
        int count = 0;
        for (File file : directory.fileList) {
            if (file.getName().contains("mp3")) {
                count ++;
            }
        }
        return count;
    }
}
