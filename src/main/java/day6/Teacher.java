package day6;

import java.util.Random;

public class Teacher {
    String name;
    String subject;
    Random random = new Random();
    void evaluate (Student student){

        int randNumber = random.nextInt(4)+2;
        if (randNumber == 2){
            System.out.println("Преподаватель " + name +
                    " оценил студента с именем " + student.name +
                    " по предмету " +  subject +
                    " на оценку " + "неудавлетворительно");
        }
        if (randNumber == 3){
            System.out.println("Преподаватель " + name +
                    " оценил студента с именем " + student.name +
                    " по предмету " +  subject +
                    " на оценку " + "удавлетворительно");
        }if (randNumber == 4){
            System.out.println("Преподаватель " + name +
                    " оценил студента с именем " + student.name +
                    " по предмету " +  subject +
                    " на оценку " + "хорошо");
        }if (randNumber == 5){
            System.out.println("Преподаватель " + name +
                    " оценил студента с именем " + student.name +
                    " по предмету " +  subject +
                    " на оценку " + "отлично");
        }


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
