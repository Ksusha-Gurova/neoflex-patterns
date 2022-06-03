package adapter;

public class Test {
    public static void main(String[] args) {
        Computer computer = new Computer();
        USB usb = new USB();
        computer.readInfoFromUsb(usb);
        MemoryCard card = new MemoryCard();
        UsbAdapter adapter = new UsbAdapter(card);
        computer.readInfoFromUsb(adapter);
    }
}
