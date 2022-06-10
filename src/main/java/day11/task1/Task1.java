package day11.task1;

public class Task1 {
    public static void main(String[] args) {
        WareHouse wareHouse = new WareHouse();
        Picker picker = new Picker(0, false,wareHouse);
        businessProcess(picker);
        picker.bonus();
        System.out.println(picker);
        System.out.println("--------------------------");
        WareHouse wareHouse1 = new WareHouse();
        Courier courier = new Courier(0, false,wareHouse1);
        businessProcess(courier);
        courier.bonus();
        System.out.println(courier);






    }
    static void businessProcess(Worker worker){
        for (int i = 0; i < 10000; i++){
            worker.doWork();
        }
        worker.bonus();
    }
}