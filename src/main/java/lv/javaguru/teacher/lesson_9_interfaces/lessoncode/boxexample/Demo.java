package lv.javaguru.teacher.lesson_9_interfaces.lessoncode.boxexample;

public class Demo {

    public static void main(String[] args) {

        BoxService boxService = new BoxServiceNew();
        WarehouseService warehouseService = new WarehouseService(boxService);

        Box box = new Box();
        Item item = new Item();

        warehouseService.putSomePackageIntoTheBox(box, item);
        warehouseService.sortTheBox(box);
        warehouseService.closeTheBox(box);
    }
}
