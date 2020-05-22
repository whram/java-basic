package reacher.polymorphism.sample;

public class Laptop {

    public void powerOn() {
        System.out.println("电脑开机！");
    }

    public void powerOff() {
        System.out.println("电脑关机！");
    }

    public void useDevice(USB device) {

        device.open();

        if (device instanceof Mouse) {
            Mouse USBMouse = (Mouse)device;
            USBMouse.click();
        }else if (device instanceof Keyboard) {
            Keyboard USBKeyboard = (Keyboard)device;
            USBKeyboard.type();
        }

        device.close();
    }

}
