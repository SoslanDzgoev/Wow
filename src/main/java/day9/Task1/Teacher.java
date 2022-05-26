package day9.Task1;

public class Teacher extends Human {
    private String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Этот преподаватель с именем :" + name);
    }
}
