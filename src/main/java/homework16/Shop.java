package homework16;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class Shop<T extends ShopItem> {
    private final List<T> elements;

    public Shop(List<T> elements) {
        this.elements = new ArrayList<>(elements);
    }

    public void addItem(T item) {
        elements.add(item);
    }

    public List<T> findByCategory(Category category) {
        List<T> result = new ArrayList<>();
        for (T element : elements) {
            if (element.category() == category) {
                result.add(element);
            }
        }
        return result;
    }

    public List<T> findWithLowerPrice(int maxPrice) {
        List<T> result = new ArrayList<>();
        for (T element : elements) {
            if (element.price() < maxPrice) {
                result.add(element);
            }
        }
        return result;
    }

    public Optional<T> findByName(String name) {
        Optional<T> result = Optional.empty();

        for (T element : elements) {
            if (element.name().equalsIgnoreCase(name)) {
                return Optional.of(element);
            }
        }
        return result;
    }

    public Optional<T> removeItem(String name) {
        Optional<T> result = Optional.empty();

        for (T element : elements) {
            if (element.name().equalsIgnoreCase(name)) {
                elements.remove(element);
                return Optional.of(element);
            }
        }
        return result;
    }

    public List<T> getElements() {
        return elements;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop<?> shop = (Shop<?>) o;
        return Objects.equals(elements, shop.elements);
    }

    @Override
    public int hashCode() {
        return Objects.hash(elements);
    }

    @Override
    public String toString() {
        return "Shop{" +
                "element=" + elements +
                '}';
    }
}
