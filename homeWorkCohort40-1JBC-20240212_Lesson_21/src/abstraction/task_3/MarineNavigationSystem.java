package abstraction.task_3;

public class MarineNavigationSystem extends NavigationSystem{
    @Override
    public void startNavigation() {
        System.out.println("Навигация для борта запущена");
    }

    @Override
    public void stopNavigation() {
        System.out.println("Навигация для борта остановлена");
    }

    public void deployAnchor() {
        System.out.println("Якорь отдан");
    }

}
