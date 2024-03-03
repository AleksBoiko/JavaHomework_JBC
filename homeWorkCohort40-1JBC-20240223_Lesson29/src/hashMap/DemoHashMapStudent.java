package hashMap;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMapStudent {
    public static void main(String[] args) {
        Map<String, Double> studentPerformance = new HashMap<>();

        studentPerformance.put("Vasja", 8.2);
        studentPerformance.put("Alina", 9.1);
        studentPerformance.put("Fedja", 4.6);
        studentPerformance.put("Sveta", 7.4);
        studentPerformance.put("Vanja", 3.8);
        studentPerformance.put("Katja", 6.3);

        System.out.println("Выводим изначальный список студентов:");
        printStudentsList(studentPerformance);
        System.out.println("-".repeat(50));

        double maxPerformance = 0;
        String topStudent = "";
        for (Map.Entry<String, Double> stringDoubleMap : studentPerformance.entrySet()){
            if (stringDoubleMap.getValue() > maxPerformance){
                maxPerformance = stringDoubleMap.getValue();
                topStudent = stringDoubleMap.getKey();
            }
        }
        System.out.println("Студент с наивысшим среднем баллом: " + topStudent + " = " + maxPerformance);
        System.out.println("-".repeat(50));

        studentPerformance.put("Fedja", 8.1);
        System.out.println("Выводим обновлённый список студентов:");
        printStudentsList(studentPerformance);
        System.out.println("=".repeat(50));
    }
    public static void printStudentsList (Map<String, Double> studentPerformance){
        for (Map.Entry<String, Double> stringDoubleEntry : studentPerformance.entrySet()){
            System.out.println(stringDoubleEntry.getKey() + " = " + stringDoubleEntry.getValue());
        }
    }
}
