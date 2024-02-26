package encapsulation.task_3;

public class SystemConfiguration {
    private int logLevel;
    private String logFilePath;

    public void setLogLevel(int level){
        if (level >= 0 && level <= 3){
            logLevel = level;
        } else {
            System.out.println("Некорректное значение уровня логирования");
        }
    }

    public void setLogFilePath(String logFilePath) {
        this.logFilePath = logFilePath;
    }

    public int getLogLevel() {
        return logLevel;
    }

    public String getLogFilePath() {
        return logFilePath;
    }
}
