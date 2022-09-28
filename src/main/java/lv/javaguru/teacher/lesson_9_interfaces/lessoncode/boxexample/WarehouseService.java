package lv.javaguru.teacher.lesson_9_interfaces.lessoncode.boxexample;

public class WarehouseService {

    private BoxService boxService;

    public WarehouseService(BoxService boxService) {
        this.boxService = boxService;
    }

    public boolean putSomePackageIntoTheBox(Box box, Item item) {
        int nextPosition = boxService.getNextPosition(box);
        return boxService.putItemIntoTheBox(box, item, nextPosition);
    }

    public void sortTheBox(Box box) {
        boxService.sort(box);
    }

    public void closeTheBox(Box box) {
        boxService.closeTheBox(box);
    }
}
