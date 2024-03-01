package Task2;

public class Tractor extends Machine {
    public Tractor(String name, int age) {
        super(name, age);
    }

    @Override
    public void begin(){
        System.out.println("Трактор " + getName() + " почав роботу");
    }

    @Override
    public void end(){
        System.out.println("Трактор " + getName() + " закінчив роботу");
    }
}
