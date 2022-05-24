package day6;

import java.util.Random;

public class Teacher {
    String name;
    String subject;
    Random random = new Random();

    void evaluate(Student student) {
        int randNumber = random.nextInt(4) + 2;
        String evaluation = "";
        switch (randNumber){
            case 2:
                evaluation = "неудовлетворительно";
                break;
            case 3:
                evaluation = "удовлетворительно";
                break;
            case 4:
                evaluation = "хорошо";
                break;
            case 5:
                evaluation = "отлично";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.name + " по предмету " + subject + " на оценку " + evaluation);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }
}
