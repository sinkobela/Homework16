package homework16;

import java.util.Objects;

public class Fruits implements ShopItem {
    private final String name;
    private final int price;
    private final Category category;

    public Fruits(String name, int price) {
        this.name = name;
        this.price = price;
        this.category = Category.NEW;
    }

    @Override
    public String name() {
        return name;
    }

    @Override
    public int price() {
        return price;
    }

    @Override
    public Category category() {
        return category;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruits fruits = (Fruits) o;
        return price == fruits.price &&
                Objects.equals(name, fruits.name) &&
                category == fruits.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, category);
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category=" + category +
                '}';
    }
}
