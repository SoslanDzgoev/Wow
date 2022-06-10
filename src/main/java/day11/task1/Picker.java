package day11.task1;


public class Picker implements Worker { // Сборщик
    private int salary;
    private boolean isPayedBonus;
    private WareHouse wareHouse;

    public Picker(int salary, boolean isPayedBonus, WareHouse wareHouse) {
        this.salary = salary;
        this.isPayedBonus = isPayedBonus;
        this.wareHouse = wareHouse;
    }

    @Override
    public void doWork() {
        salary += 80;
        WareHouse.countPickedOrders++;
    }

    @Override
    public void bonus() {
        if (WareHouse.countPickedOrders < 10_000) {
            System.out.println("Бонус пока недоступен");
            return;
        }
        if (isPayedBonus){
            System.out.println("Бонус уже был выплачен");
            return;
        }
        salary += 70000;
        isPayedBonus = true;


    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayedBonus() {
        return isPayedBonus;
    }
    @Override
    public String toString() {
        return "Picker{" +
                "salary=" + salary +
                ", isPayedBonus=" + isPayedBonus +
                '}';
    }
}
