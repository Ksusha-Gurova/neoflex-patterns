package singleton;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Logger logger = Logger.getINSTANCE();
        logger.addClassAndShowInfo(ArrayList.class, "Динамический масив");
        logger.addClassAndShowInfo(Object.class, "Прародитель всех классов");
        logger.addClassAndShowInfo(String.class, "Строка (набор символов)");
    }
}
