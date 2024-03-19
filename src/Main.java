import task3.MyDateComparator;
import task3.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException { //checked exeption
        Set<Person> people = new TreeSet<>(new MyDateComparator());
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/User/OneDrive/Робочий стіл/people.txt"));
        String current;
        bufferedReader.readLine();
        while((current = bufferedReader.readLine()) != null){
            String[] infoPerson = current.split(" ");
            try {
                people.add(new Person(infoPerson[0], infoPerson[1], infoPerson[24]));
            }
            catch (ArrayIndexOutOfBoundsException e){ //unchecked exeption
                System.out.println(e);
            }
        }

        for (Person person : people){
            System.out.println(person);
        }
    }



}