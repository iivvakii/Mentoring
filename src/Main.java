import exeptions.AgeExeption;
import exeptions.NameExeption;
import task3.MyDateComparator;
import task3.Person;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
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
                checkAge(infoPerson[1]);
            } catch (AgeExeption e) {
                throw new RuntimeException(e);
            }
            checkName(infoPerson[0]);

            people.add(new Person(infoPerson[0], infoPerson[1], infoPerson[2]));

        }

        for (Person person : people){
            System.out.println(person);
        }
    }


    public static void checkAge(String date) throws AgeExeption {
        String[] dates = date.split("\\.");
        LocalDate birthdate = LocalDate.of(Integer.parseInt(dates[2]), Integer.parseInt(dates[1]), Integer.parseInt(dates[0]));
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthdate, currentDate);

        // Print Age
//        System.out.println("Age: " + period.getYears() + " years");
        if(period.getYears() < 18){
            throw new AgeExeption("You must be 18+.");
        }
        else{
            System.out.println("You have 18.");
        }
    }


    public static void checkName(String name){
        if(name.length() < 4){
            throw new NameExeption("This name does not have enough letters");
        }
    }
}