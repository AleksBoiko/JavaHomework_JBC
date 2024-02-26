package abstraction.task_1;

public class Keyboard extends InputDevice{
    @Override
    public void connect(){
        printMessage("Keyboard is connected.");
    }
    @Override
    public void disconnect(){
        printMessage("Keyboard is disconnected.");
    }
}
