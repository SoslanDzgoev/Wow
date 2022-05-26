package day9.Task1;

public class Human {
    protected String name;

    public Human(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void info() {
        System.out.println("Этот человек с именем :" + name);
    }

    public String getName() {
        return name;
    }
}
