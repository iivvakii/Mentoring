import task2.Bulldozer;
import task2.Machine;
import task2.Tractor;
import task2.Truck;

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