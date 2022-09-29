package lv.javaguru.student_vladislav_kulikov.Lesson_12.Task_27_to_48;

import java.util.Objects;

class Product {

    String title;
    Integer price;// в центах
    String description;

    Product(String title, Integer price, String description) {
        this.title = title;
        this.price = price;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return price == product.price && Objects.equals(title, product.title) && Objects.equals(description, product.description);
    }


    @Override
    public int hashCode() {
        return Objects.hash(title, price, description);
    }
}
