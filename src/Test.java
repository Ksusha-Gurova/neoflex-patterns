import adapter.Computer;
import adapter.MemoryCard;
import adapter.USB;
import adapter.UsbAdapter;
import factory.CoffeeFactory;
import proxy.ConnectionProxy;
import proxy.DatabaseManager;
import singleton.Logger;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Logger logger = Logger.getINSTANCE();
        logger.logging(ArrayList.class, "Динамический масив");
        logger.logging(Object.class, "Прародитель всех классов");
        logger.logging(String.class, "Строка (набор символов)");

        DatabaseManager manager = new DatabaseManager("PostgreSQL");
        ConnectionProxy factory = new ConnectionProxy(manager);
        factory.connect();

        Computer computer = new Computer();
        USB usb = new USB();
        computer.readInfoFromUsb(usb);
        MemoryCard card = new MemoryCard();
        UsbAdapter adapter = new UsbAdapter(card);
        computer.readInfoFromUsb(adapter);

        CoffeeFactory coffeeFactory = new CoffeeFactory();
        System.out.println(coffeeFactory.createCoffee("espResso"));
        System.out.println(coffeeFactory.createCoffee("AmeRicano"));
    }
}
