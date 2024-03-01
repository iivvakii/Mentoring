import Task2.Bulldozer;
import Task2.Machine;
import Task2.Tractor;
import Task2.Truck;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<Machine> arr = new ArrayList<>();
        arr.add(new Bulldozer("Bull", 2006));
        arr.add(new Tractor("Tractor", 1984));
        arr.add(new Truck("Truck", 2021));

        for(Machine machine : arr){
            machine.begin();
        }
        System.out.println();
        for(Machine machine : arr){
            machine.end();
        }
    }

}