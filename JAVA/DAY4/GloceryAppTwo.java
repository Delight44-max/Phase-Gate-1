import java.util.ArrayList;
import java.util.Scanner;

public class GloceryAppTwo {

public static void printList(ArrayList<String> list) {
System.out.println("\n=== Grocery List ===");
if (list.isEmpty()) {
System.out.println("No items in the list.");
} else {
for (int count = 0; count < list.size(); count++) {
System.out.println((count + 1) + ". " + list.get(count));
}
}
}

    


public static void main(String[] args) {
ArrayList<String> store = new ArrayList<>();
Scanner input = new Scanner(System.in);
int choice;

do {
            

System.out.println("\n=== Select Menu ===");
System.out.println("1. Add item");
System.out.println("2. Remove item");
System.out.println("3. Show available items");
System.out.println("0. Exit");
System.out.print("Select a function from (1-3) or 0 to exit: ");

choice = input.nextInt();
input.nextLine();

switch (choice) {
case 1 -> {
System.out.print("Enter item to add: ");
String item = input.nextLine();
store.add(item);
System.out.println(item + " added to the list.");
}
                
case 2 -> {
printList(store);
System.out.print("Enter item number to remove: ");
int index = input.nextInt();
input.nextLine(); 
if (index > 0 && index <= store.size()) {
String removedItem = store.remove(index - 1);
System.out.println(removedItem + " removed from the list.");
} else {
                        
System.out.println("Invalid item number.");
}
}
                
case 3 -> printList(store);
case 0 -> System.out.println("Exiting the app. Goodbye!");
default -> System.out.println("Invalid choice. Please select between 0 and 3.");
}
} while (choice != 0);


}
}