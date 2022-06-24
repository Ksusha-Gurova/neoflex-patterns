package proxy;

public class ConnectionProxy {
    private DatabaseManager manager;

    public ConnectionProxy(DatabaseManager manager) {
        this.manager = manager;
    }

    public void connect() {
        String connection = manager.getConnection().split(" ")[2];
        String url = "localhost:port/";
        System.out.printf("Connection to %s%s%n", url, connection);
    }
}
