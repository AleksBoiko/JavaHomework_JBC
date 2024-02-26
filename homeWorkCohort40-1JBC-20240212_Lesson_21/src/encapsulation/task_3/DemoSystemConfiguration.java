package encapsulation.task_3;

public class DemoSystemConfiguration {
    public static void main(String[] args) {
        SystemConfiguration configuration = new SystemConfiguration();

        configuration.setLogLevel(2);
        configuration.setLogFilePath("C:/log/mylog.txt");

        System.out.println("Уровень логирования: " + configuration.getLogLevel());
        System.out.println("Путь к файлу логов: " + configuration.getLogFilePath());
    }
}
