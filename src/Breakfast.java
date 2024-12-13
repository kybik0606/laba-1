import java.util.ArrayList;
import java.util.List;

public class Breakfast {
    public static void main(String[] args) {
        List<Product> breakfast = new ArrayList<>();
        breakfast.add(new Milk(1.5));
        breakfast.add(new Milk(2.5));
        breakfast.add(new Milk(5.0));
        breakfast.add(new Cake(100));

        int cakeCount = countProductsOfType(breakfast, Cake.class);
        int milkCount = countProductsOfType(breakfast, Milk.class);
        System.out.println("Number of cake products: " + cakeCount);
        System.out.println("Number of milk products: " + milkCount);
    }

    public static int countProductsOfType(List<Product> products, Class<?> type) {
        int count = 0;
        for (Product product : products) {
            if (type.isInstance(product)) {
                count++;
            }
        }
        return count;
    }
}
