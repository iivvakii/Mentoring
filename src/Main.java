import exeptions.AgeExeption;
import exeptions.NameExeption;
import task2.Bulldozer;
import task2.Machine;
import task3.MyDateComparator;
import task3.Person;
import task5.MyClass;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) throws IOException { //checked exeption

//        BiFunction
        System.out.println("BiFunctional:");
        BiFunction<Double, Double, Double> f = (a, b) -> a * b;
        System.out.println("Square of rectangle: " + f.apply(10.0, 5.0));

        f = f.andThen(a -> a * 2.0);
        System.out.println("Volume of rectangle: " + f.apply(10.0, 5.0) + "\n");

        System.out.println("Predicate(even or odd of 10 * 5):");
//        Predicate
        Predicate<Double> predicate = i -> i % 2 ==0;
        if (predicate.test(f.apply(10.0, 5.0))){
            System.out.println("Even \n");
        }else{
            System.out.println("Odd \n");
        }

        System.out.println("Consumer(word: hello):");
//        Consumer
        Consumer<String> consumer = i -> System.out.println("Upper case: " + i.toUpperCase());
        consumer = consumer.andThen(i -> System.out.println("String length: " + i.length()));
        consumer.accept("hello");
        System.out.println();

//        BinaryOperator
        int a = 3;
        int b = 4;
        System.out.println("BinaryOperator: ");
        System.out.print("Sum of two numbers: ");
        BinaryOperator<Integer> binaryOperator = Integer::sum;
        System.out.println(binaryOperator.apply(a, b));
        System.out.print("Find smaller number: ");
        BinaryOperator<Integer> op = BinaryOperator.minBy(Integer::compareTo);
        System.out.println(op.apply(a, b) + "\n");

        System.out.println("Arithmetic calculations(number - 3, number + 10, number % 3): ");
//        Function
        Function<Integer, Integer> function = i -> i + 10;
        function = function.compose(i -> i-3);
        function = function.andThen(i -> i % 3);
        System.out.println(function.apply(10) + "\n");


        System.out.println("Custom functional interface(print information about machine): ");
        MyClass<Machine, String> myClass = i -> String.format("%s was released in %d", i.getName(), i.getYear());
        System.out.println(myClass.accept(new Bulldozer("Bull", 1976)));


//        Set<Person> people = new TreeSet<>(new MyDateComparator());
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/User/OneDrive/Робочий стіл/people.txt"));
//        String current;
//        bufferedReader.readLine();
//        while((current = bufferedReader.readLine()) != null){
//            String[] infoPerson = current.split(" ");
//
//            try {
//                checkAge(infoPerson[1]);
//            } catch (AgeExeption e) {
//                throw new RuntimeException(e);
//            }
//            checkName(infoPerson[0]);
//
//            people.add(new Person(infoPerson[0], infoPerson[1], infoPerson[2]));
//
//        }
//
//        for (Person person : people){
//            System.out.println(person);
//        }
    }
}





//   public static void checkAge(String date) throws AgeExeption {
//        String[] dates = date.split("\\.");
//        LocalDate birthdate = LocalDate.of(Integer.parseInt(dates[2]), Integer.parseInt(dates[1]), Integer.parseInt(dates[0]));
//        LocalDate currentDate = LocalDate.now();
//        Period period = Period.between(birthdate, currentDate);
//
//
//        if(period.getYears() < 18){
//            throw new AgeExeption("You must be 18+.");
//        }
//        else{
//            System.out.println("You have 18.");
//        }
//    }


//    public static void checkName(String name){
//        if(name.length() < 4){
//            throw new NameExeption("This name does not have enough letters");
//        }
//    }
