package lv.javaguru.student_artjomsb_homework.lesson_9_interfaces.homework.level_3_junior.optional;

import java.util.Objects;

class Product {

    private String title;

    public Product(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Objects.equals(title, product.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
