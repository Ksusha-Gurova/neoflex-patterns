package singleton;

public class Logger {
    private static Logger INSTANCE;
    private static String log = "log info: ";

    private Logger() {}

    public static Logger getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    public void addClassAndShowInfo(Class cl, String info) {
        System.out.println(log + cl.getName() + ", " + info);
    }
}
