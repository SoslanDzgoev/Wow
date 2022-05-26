package day9.Task1;

public class Student extends Human {
    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Этот студент с именем :" + name);
    }
}
