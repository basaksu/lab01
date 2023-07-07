import java.util.Scanner;

public class IntBagTester {
    public static void main(String[] args) {
        IntBag collection = new IntBag();
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (choice != 7) {
            System.out.println("\nMenu:");
            System.out.println("1. Create a new empty collection (any previous values are lost!)");
            System.out.println("2. Read a set of positive values into the collection (use zero to indicate all the values have been entered.)");
            System.out.println("3. Print the collection of values");
            System.out.println("4. Add a value to the collection at a specified location");
            System.out.println("5. Remove the value at a specified location from the collection");
            System.out.println("6. Remove all instances of a value within the collection");
            System.out.println("7. Quit the program");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();

            if (choice == 1) {
                collection = new IntBag();
                System.out.println("\nNew empty collection created.");
            } 
            else if (choice == 2) {
                System.out.print("Enter positive values (enter 0 to stop): ");
                int val = input.nextInt();
                while (val != 0) {
 
                    collection.add(val);
                    val = input.nextInt();
                }
            } 
            else if (choice == 3) {
                System.out.println("Collection: " + collection);
            } 
            else if (choice == 4) {
                System.out.print("Enter the index to add the value: ");
                int index = input.nextInt();
                System.out.print("Enter the value to add: ");
                int value = input.nextInt();
                collection.add(index, value);
            } 
            else if (choice == 5) {
                System.out.print("Enter the index to remove the value: ");
                int index = input.nextInt();
                collection.remove(index);
            } 
            else if (choice == 6) {
                System.out.print("Enter the value to remove all instances of: ");
                int val = input.nextInt();
                collection.removeAll(val);
            } 
            else if (choice == 7) {
                System.out.println("Exiting the program...");
            } 
            else {
                System.out.println("Invalid choice. Try again...");
            }
        }
        input.close();
    }
}
