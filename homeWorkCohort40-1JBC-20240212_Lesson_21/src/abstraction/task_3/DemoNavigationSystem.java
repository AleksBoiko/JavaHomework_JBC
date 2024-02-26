package abstraction.task_3;

public class DemoNavigationSystem {
    public static void main(String[] args) {
        CarNavigationSystem carNav = new CarNavigationSystem();
        carNav.startNavigation();
        carNav.turnOnVoiceGuidance();
        carNav.displayMap();
        carNav.stopNavigation();

        System.out.println();

        MarineNavigationSystem marineNav = new MarineNavigationSystem();
        marineNav.startNavigation();
        marineNav.deployAnchor();
        marineNav.displayMap();
        marineNav.stopNavigation();
    }
}
