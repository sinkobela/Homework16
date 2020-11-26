package homework16;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Shop<Clothes> clothesShop = new Shop<>(List.of(
                new Clothes("jeans", 150, Category.ON_SALE),
                new Clothes("hoodie", 120, Category.NEW),
                new Clothes("boots", 200, Category.REFURBISHED)));

        Shop<Electronics> electronicsShop = new Shop<>(List.of(
                new Electronics("TV", 2500, Category.NEW),
                new Electronics("PC", 5500, Category.REFURBISHED),
                new Electronics("fridge", 500, Category.ON_SALE)));

        Shop<Fruits> fruitsShop = new Shop<>(List.of(
                new Fruits("watermelon", 10),
                new Fruits("banana", 8)));


        clothesShop.addItem(new Clothes("hat", 50, Category.NEW));
        clothesShop.addItem(new Clothes("t-shirt", 20, Category.NEW));
        electronicsShop.addItem(new Electronics("smartphone", 2200, Category.ON_SALE));
        electronicsShop.addItem(new Electronics("headphone", 500, Category.REFURBISHED));
        electronicsShop.addItem(new Electronics("mouse", 600, Category.NEW));
        fruitsShop.addItem(new Fruits("strawberry", 600));

        System.out.println("\n");
        System.out.println(clothesShop);
        System.out.println(fruitsShop);
        // Miert irja ki csak azt amit most adtunk hozza?

        System.out.println("\n");
        System.out.println(electronicsShop.findByCategory(Category.ON_SALE));
        // Miert irja ki csak azt amit utolag adtunk hozza?

        System.out.println("\n");
        System.out.println(electronicsShop.findWithLowerPrice(1000));
        // Miert irja ki csak azt amit utolag adtunk hozza?

        System.out.println("\n");
        System.out.println(clothesShop.findByName("hat"));
    }
}
