package Controllers;

import Service.ResortService;

import java.util.Scanner;

public class MainController {
    private Scanner scanner = new Scanner(System.in);
    ResortService resortService = new ResortService();


    public void displayMainMenu() {
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
        switch (selectOption) {
            case 1: {
                addNewService();
                break;
            }
            case 2: {
                menuShowService();
                break;
            }
            case 3: {
                addNewCustomer();
                break;
            }
            case 4: {
                showInfoCustomer();
                break;
            }
            case 5: {
                addNewBooking();
                break;
            }
            case 6: {
                showInformationEmployee();
                break;
            }
            case 7: {
                addBookingCinema();
                break;
            }
            case 8: {
                showBookingCinema();
                break;
            }
            case 9: {
                searchFilingCabinetsOfEmployee();
                break;
            }
            case 10: {
                System.exit(0);
            }
            default: {
                displayMainMenu();
            }
        }

    }

    public void addNewService() {
        int selectOption;
        System.out.println("1. Add New Villa\n" +
                "2. Add New House\n" +
                "3. Add New Room\n" +
                "4. Back to menu\n" +
                "5. Exit");
        System.out.print("Input your choice: ");
        selectOption = scanner.nextInt();
        switch (selectOption) {
            case 1: {
                resortService.addListVilla();
                addNewService();
                break;
            }
            case 2: {
                resortService.addListHouse();
                addNewService();
                break;
            }
            case 3: {
                resortService.addListRoom();
                addNewService();
                break;
            }

            case 4: {
                displayMainMenu();
                break;
            }
            default: {
                System.exit(0);
            }
        }
    }

    private void menuShowService() {
        int selectedOption;
        System.out.println("1. Show All Villa\n" +
                "2. Show All House\n" +
                "3. Show All Room\n" +
                "4. Show All Name Villa Not Duplicate\n" +
                "5. Show All Name House Not Duplicate\n" +
                "6. Show All Name Room Not Duplicate\n" +
                "7. Back to menu\n" +
                "8. Exit");
        System.out.print("Enter your choice: ");
        selectedOption = scanner.nextInt();
        switch (selectedOption) {
            case 1: {
                resortService.showVillaService();
                menuShowService();
                break;
            }
            case 2: {
                resortService.showHouseList();
                menuShowService();
                break;
            }
            case 3: {
                resortService.showRoomList();
                menuShowService();
                break;
            }
            case 4: {
                showAllNameVillaNotDuplicate();
                break;
            }
            case 5: {
                showAllNameHouseNotDuplicate();
                break;
            }
            case 6: {
                showAllNameRoomNotDuplicate();
                break;
            }

            case 7: {
                displayMainMenu();
                break;
            }
            default: {
                System.exit(0);
            }
        }
    }

}
