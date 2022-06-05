package src;
 
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingListUsingMultipleFields{


 
 
 
    // customer list
    private static List<Customer> getUnSortedCustomers() {
 
        return Arrays.asList(
                new Customer("Shalini", "Chennai", 60),
                new Customer("Sneha", "Pune",  73),
                new Customer("Simran", "Bangalore", 37),
                new Customer("Trisha", "Hyderabad", 52),
                new Customer("Shalini", "Chennai", 70),
                new Customer("Abirami", "Bangalore", 48),
                new Customer("Trisha", "Mangalore", 45),
                new Customer("Sneha", "Pune", 62),
                new Customer("Shalini", "Chennai",  50)
                );
    }
 
    // main() method
    public static void main(String[] args) {
 
        // get customer list
        List<Customer> unsortedCustomerList = getUnSortedCustomers();
 
        System.out.println("Before Sorting: Customer list :- \n");
        unsortedCustomerList.stream().forEach(System.out::println);
 
 
        System.out.println("\n\nSorted Customer list on multiple fields"
                + " using Lambda Expression :- \n");
 
        // 1. customer Name comparator
        Comparator<Customer> nameComparatorLEx = 
                (cust1, cust2) -> cust1.getCustName().compareTo(cust2.getCustName());
 
        // 2. customer City comparator
        Comparator<Customer> cityComparatorLEx = 
                (cust1, cust2) -> cust1.getCustCity().compareTo(cust2.getCustCity());
 
        // 3. customer Age comparator
        Comparator<Customer> ageComparatorLEx =  
                (cust1, cust2) -> cust1.getCustAge().compareTo(cust2.getCustAge());
 
        // sorting on multiple fields (3-level) using Lambda expression
        List<Customer> sortedCustomerList = unsortedCustomerList
                .stream()
                .sorted(
                        nameComparatorLEx // 1st compare Name
                        .thenComparing(cityComparatorLEx) // then 2nd compare City
                        .thenComparing(ageComparatorLEx)) // then 3rd compare Age
                .collect(Collectors.toList()); // collect sorted customers to new list
 
        // print new list to console using forEach()
        sortedCustomerList.stream().forEach(cust -> System.out.println(cust));
    }
}
