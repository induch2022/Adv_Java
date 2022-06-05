package src;
import java.util.ArrayList;


public class ArrayListManupulations {


    public static void main(String[] args) {
        // create an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // add elements to the ArrayList
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println("Numbers: " + numbers);

        // remove all even numbers
        numbers.removeIf(e -> (e % 2) == 1);
        System.out.println("Odd Numbers: " + numbers);
        
        
        
        ArrayList<String> languages = new ArrayList<>();

        // add elements to the ArrayList
        languages.add("java");
        languages.add("javascript");
        languages.add("swift");
        languages.add("python");
        System.out.println("ArrayList: " + languages);

        // replace all elements to uppercase
        languages.replaceAll(e -> e.toUpperCase());
        System.out.println("Updated ArrayList: " + languages);
    }
}