package inheritance.task_3;

public class Developer extends Employee{
    private String[] project;

    public Developer(String name, int age, String department) {
        super(name, age, department);
    }

    public String[] getProject() {
        return project;
    }

    public void setProject(String[] project) {
        this.project = project;
    }
}
