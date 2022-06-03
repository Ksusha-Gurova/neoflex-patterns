package proxy;

public class Test {
    public static void main(String[] args) {
        DatabaseManager manager = new DatabaseManager("PostgreSQL");
        ConnectionFactory factory = new ConnectionFactory(manager);
        factory.connect();
    }
}
