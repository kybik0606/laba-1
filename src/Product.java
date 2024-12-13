// Класс-продукт с одним параметром (абстрактный предок)
abstract class Product {
    // Абстрактный метод, который будут реализовывать классы-потомки
    public abstract String getDescription();
}

// Класс "Milk" с параметром жирности
class Milk extends Product {
    private double fat; // Жирность молока

    // Конструктор с параметром жирности
    public Milk(double fat) {
        this.fat = fat;
    }

    public double getFat() {
        return fat;
    }

    @Override
    public String getDescription() {
        return "Milk with " + fat + "% fat";
    }
}

class Cake extends Product {
    private double weight; // Жирность молока

    // Конструктор с параметром жирности
    public Cake(double weight) {
        this.weight = weight;
    }

    public double getFat() {
        return weight;
    }

    @Override
    public String getDescription() {
        return "Cake with " + weight + "% weight";
    }
}



