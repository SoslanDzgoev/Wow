package day6;


public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Павел Сергеевич", "История");
        Student student = new Student("Паша");
        teacher.evaluate(student);

    }
}
