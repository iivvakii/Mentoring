package Task2;

public class Bulldozer extends Machine {

    public Bulldozer(String name, int age) {
        super(name, age);
    }

    @Override
    public void begin(){
        System.out.println("Бульдозер " + getName() + " почав роботу");
    }
    @Override
    public void end(){
        System.out.println("Бульдозер " + getName() + " закінчив роботу");
    }
}
