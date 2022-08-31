package lv.javaguru.student_vladislav_kulikov.Lesson_3.Task_31;
//Task_31
//Разработать класс - продукт,
//у которого должны быть следующие характеристики:
//
//Свойства:
//- Наименование (String name)
//- Стандартная цена (double regularPrice)
//- Скидка в процентах (double discount)
//
//Методы:
//1. Расчет актуальной стоимости с учетом скидки (double actualPrice())
//Вывод информации о продукте в консоль (void printInformation())1P
//2. Название продукта нужно задавать через конструктор, а стоимость и скидку через оператор ".".
//
//Класс с объявлением продукта должен называться "Product".
//Класс с демонстрацией работы должен называться "ProductDemo"
class Product {

    String name;
    double regularPrice;
    double discount;

    Product(String name, double regularPrice, double discount){
        this.name = name;
        this.regularPrice = regularPrice;
        this.discount = discount;
    }

     double actualPrice(){
        return regularPrice - regularPrice / 100 * discount;
    }

    void printInformation(){
        System.out.println(name+ " price: " + actualPrice() + " with discount " + discount);
    }

}
