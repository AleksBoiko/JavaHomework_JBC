package abstraction.task_1;

public class DemoDevice {
    public static void main(String[] args) {
        InputDevice keyboard = new Keyboard();
        InputDevice mouse = new Mouse();

        keyboard.connect();
        mouse.connect();

        keyboard.disconnect();
        mouse.disconnect();
    }
}
