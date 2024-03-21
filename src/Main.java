import task3.MyDateComparator;
import task3.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {


        Set<Person> people = new TreeSet<>(new MyDateComparator());
        Path path = Paths.get("C:/Users/User/OneDrive/Робочий стіл/people.txt");
        BufferedReader bufferedReader = Files.newBufferedReader(path);
        String current;
        bufferedReader.readLine();
        while((current = bufferedReader.readLine()) != null){
            String[] infoPerson = current.split(" ");
            people.add(new Person(infoPerson[0], infoPerson[1], infoPerson[2]));
        }

        for (Person person : people){
            System.out.println(person);
        }


    }
}