package day6;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Павел Сергеевич", "История");
        Student student = new Student("Алексей");
        student.setName("Алексей");
        teacher.evaluate(student);
    }
}
