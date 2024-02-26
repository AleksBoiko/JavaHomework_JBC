package abstraction.task_1;

public class Mouse extends InputDevice {

    @Override
    public void connect() {
        printMessage("Mouse is connected.");
    }

    @Override
    public void disconnect() {
        printMessage("Mouse is disconnected.");
    }
}
