package task2;

public class Machine {
    private String name;
    private int year;

    public Machine(String name, int age) {
        this.name = name;
        this.year = age;
    }

    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }

    public  void begin(){
        System.out.println(name + " почав роботу");
    }

    public void end(){
        System.out.println(name + " закінчив роботу");
    }
}
