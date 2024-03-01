package Task2;

public class Truck extends Machine {
    public Truck(String name, int age) {
        super(name, age);
    }

    @Override
    public void begin(){
        System.out.println("Грузовик " + getName() + " почав роботу");
    }
    @Override
    public void end(){
        System.out.println("Грузовик " + getName() + " закінчив роботу");
    }
}
