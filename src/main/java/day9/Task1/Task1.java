package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Bob", "А-55");
        Teacher teacher = new Teacher("Michael Jackson", "vocals");
        student.info();
        System.out.println();
        teacher.info();
    }
}
