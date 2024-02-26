package inheritance.task_3;

public class Manager extends Employee{
    private Employee[] subordinates;
    public Manager(String name, int age, String department) {
        super(name, age, department);
    }

    public Employee[] getSubordinates() {
        return subordinates;
    }

    public void setSubordinates(Employee[] subordinates) {
        this.subordinates = subordinates;
    }
}
