package factory;

public class CoffeeFactory {

    Coffee coffee;

    public Coffee createCoffee(String coffeeName) {
        if (coffeeName.equalsIgnoreCase("espresso")) {
            coffee = new Espresso();
        }else if (coffeeName.equalsIgnoreCase("americano")) {
            coffee = new Americano();
        }
        return coffee;
    }


}
