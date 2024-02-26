package inheritance.task_3;

public class DemoCompany {
    public static void main(String[] args) {

        Manager manager = new Manager("Alex B", 42, "Project-Manager");
        Developer developer = new Developer("Jevgenij S", 38, "IT-Developer");

        Employee[] subordinates = {new Employee("Vasilij I", 45, "IT-Backend"),
                new Employee("Anna P", 32, "IT-Backend"),
                new Employee("Ivan P", 35, "IT-Backend"),
                new Employee("Pjotr M", 35, "IT-Frontend"),
                new Employee("Olga I", 35, "IT-Frontend"),
                new Employee("Julija B", 35, "QR-Engineer"),
                new Employee("Sergej S", 35, "QR-Engineer")};

        manager.setSubordinates(subordinates);

        String[] projects = {"Project A1", "Project B1", "Project A2", "Project C1"};
        developer.setProject(projects);

        System.out.println(manager.getName() + " Работает в " + manager.getDepartment() + " отделе и имеет "
                + manager.getSubordinates().length + " подчинённых");
        System.out.println(developer.getName() + " Работает в " + developer.getDepartment() + " в настоящее время работает над "
                + String.join(", ", developer.getProject()) + " проектами.");
    }
}
