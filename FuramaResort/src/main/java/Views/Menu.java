package Views;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public int mainMenu() {
        int selectOption;
        System.out.println("1. Add New Services\n" +
                "2. Show Services\n" +
                "3. Add New Customer\n" +
                "4. Show Information Customer\n" +
                "5. Add New Booking Resort\n" +
                "6. Show Information Employee\n" +
                "7. Exit");
        System.out.print("Enter your choice: ");
        selectOption = scanner.nextInt();
        return selectOption;
    }

    public int addingServiceMenu() {
        int selectOption;
        System.out.println("1. Add New Villa\n" +
                "2. Add New House\n" +
                "3. Add New Room\n" +
                "4. Back to menu\n" +
                "5. Exit");
        System.out.print("Input your choice: ");
        selectOption = scanner.nextInt();
        return selectOption;
    }

}

