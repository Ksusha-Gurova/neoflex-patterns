package singleton;

public class Logger {
    private static Logger INSTANCE;
    private static final String log = "log info: ";

    private Logger() {}

    public static Logger getINSTANCE() {
        if (INSTANCE == null) {
            INSTANCE = new Logger();
        }
        return INSTANCE;
    }

    public void logging(Class cl, String info) {
        System.out.println(log + cl.getName() + ", " + info);
    }
}
