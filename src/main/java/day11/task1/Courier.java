package day11.task1;

import static day11.task1.WareHouse.countDeliveredOrders;

public class Courier implements Worker{
    private int salary;
    private boolean isPayedBonus;
    private WareHouse wareHouse;

    public Courier(int salary, boolean isPayedBonus, WareHouse wareHouse) {
        this.salary = salary;
        this.isPayedBonus = isPayedBonus;
        this.wareHouse = wareHouse;
    }

    @Override
    public void doWork() {
        salary += 100;
        countDeliveredOrders++;
    }

    @Override
    public void bonus() {
        if (countDeliveredOrders < 10_000) {
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
        return "Courier{" +
                "salary=" + salary +
                ", isPayedBonus=" + isPayedBonus +
                '}';
    }
}
