package abstraction.task_1;

abstract class InputDevice {
    public abstract void connect();
    public abstract void disconnect();
    public void printMessage(String message){
        System.out.println(message);
    }
}
