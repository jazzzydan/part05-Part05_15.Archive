
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> items = new ArrayList<>();

        while(true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            Archive item = new Archive(identifier, name);
            items.add(item);
        }

        System.out.println("==Items==");

        for (int i = 0; i < items.size(); i++) {
            Archive currentItem = items.get(i);
            boolean printItem = true;

            // Check if the current item is equal to any of the previous items
            for (int j = 0; j < i; j++) {
                if (currentItem.equals(items.get(j))) {
                    printItem = false;
                    break;
                }
            }

            // Print the item if it's not equal to any of the previous items
            if (printItem) {
                System.out.println(currentItem);
            }
        }
    }
}
