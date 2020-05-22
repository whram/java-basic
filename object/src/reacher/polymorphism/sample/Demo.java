package reacher.polymorphism.sample;

public class Demo {

    public static void main(String[] args) {
        Laptop pc = new Laptop();
        USB device1 = new Mouse();
        Keyboard device2 = new Keyboard();

        pc.powerOn();

        pc.useDevice(device1);
        pc.useDevice(device2);

        pc.powerOff();

    }

}
