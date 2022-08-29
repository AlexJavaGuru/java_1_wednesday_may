package lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_3_junior;

class InMemoryDatabaseDemo {
    public static void main(String[] args) {
        InMemoryDatabase shop = new InMemoryDatabase();
        Product one = new Product("one");
        Product two = new Product("one2");
        Product three = new Product("one3");
        Product four = new Product("one4");
        Product five = new Product("one5");
        Product six = new Product("one6");
        shop.save(one);
        shop.save(two);
        shop.save(three);
        shop.save(five);
        shop.save(four);
        shop.save(six);
        System.out.println(shop.getListOfProduct());
    }
}
