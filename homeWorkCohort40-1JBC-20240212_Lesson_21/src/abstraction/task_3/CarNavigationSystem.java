package abstraction.task_3;

public class CarNavigationSystem extends NavigationSystem {
    @Override
    public void startNavigation() {
        System.out.println("Навигация для авто запущена");
    }

    @Override
    public void stopNavigation() {
        System.out.println("Навигация для авто остановлена");
    }

    public void turnOnVoiceGuidance() {
        System.out.println("Голосовые подсказки включены");
    }
}
