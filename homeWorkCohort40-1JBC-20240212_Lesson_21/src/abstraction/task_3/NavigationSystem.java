package abstraction.task_3;

abstract class NavigationSystem {
    public abstract void startNavigation();
    public abstract void stopNavigation();

    public void displayMap() {
        System.out.println("Отображение карты...");
    }
}

