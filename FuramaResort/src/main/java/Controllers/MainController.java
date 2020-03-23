package Controllers;

import Models.Customer;
import Service.CustomerService;
import Service.ResortService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    private Scanner scanner = new Scanner(System.in);
    ResortService resortService = new ResortService();
    CustomerService customerService = new CustomerService();


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
                customerService.addNewCustomer();
                displayMainMenu();
                break;
            }
            case 4: {
                customerService.showInfoCustomer();
                displayMainMenu();
                break;
            }
            case 5: {
//                addNewBooking();
                break;
            }
            case 6: {
//                showInformationEmployee();
                break;
            }
            case 7: {
//                addBookingCinema();
                break;
            }
            case 8: {
//                showBookingCinema();
                break;
            }
            case 9: {
//                searchFilingCabinetsOfEmployee();
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

    public void menuShowService() {
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
//            case 4: {
//                showAllNameVillaNotDuplicate();
//                break;
//            }
//            case 5: {
//                showAllNameHouseNotDuplicate();
//                break;
//            }
//            case 6: {
//                showAllNameRoomNotDuplicate();
//                break;
//            }

            case 7: {
                displayMainMenu();
                break;
            }
            default: {
                System.exit(0);
            }
        }
    }

    private void addNewBooking() {
        List<Customer> listCustomers = new ArrayList<>();
        int selectedOption;
        System.out.println("Choose the customer: ");
        for (Customer customer : listCustomers) {
            System.out.println(listCustomers.indexOf(customer) + ": " + customer.getFullName());
        }
        selectedOption = scanner.nextInt();
        Customer selectedCustomer = null;
        if (selectedCustomer >= listCustomers.size()) {
            System.out.println("out of size.");
            addNewBooking();
        } else {
            selectedCustomer = listCustomers.get(selectedOption);
        }
        selectedCustomer = menu.displayBookingMenu();
        Models.Service selectedService = null;
        switch (choice) {
            case 1:
                List<Villa> villas = resortServices.getVillas();
                if (villas.size() == 0) {
                    System.out.println("List villa is empty.");
                    addNewBooking();
                }
                for (Villa villa : villas) {
                    System.out.println(villas.indexOf(villa) + ": " + villa.getServiceName());
                }
                choice = scanner.nextInt();
                if (choice > villas.size()) {
                    System.out.println("out of size.");
                    addNewBooking();
                } else {
                    selectedService = villas.get(choice);
                }
                break;
            case 2:
                List<House> houses = resortServices.getHouses();
                if (houses.size() == 0) {
                    System.out.println("List house is empty.");
                    addNewBooking();
                }
                for (House house : houses) {
                    System.out.println(houses.indexOf(house) + ": " + house.getServiceName());
                }
                choice = scanner.nextInt();
                if (choice > houses.size()) {
                    System.out.println("out of size.");
                    addNewBooking();
                } else {
                    selectedService = houses.get(choice);
                }
                break;
            case 3:
                List<Room> rooms = resortServices.getRooms();
                if (rooms.size() == 0) {
                    System.out.println("List room is empty.");
                    addNewBooking();
                }
                for (Room room : rooms) {
                    System.out.println(rooms.indexOf(room) + ": " + room.getServiceName());
                }
                choice = scanner.nextInt();
                if (choice > rooms.size()) {
                    System.out.println("out of size.");
                    addNewBooking();
                } else {
                    selectedService = rooms.get(choice);
                }
                break;
            default:
                System.out.println("There is not this option.");
        }
        assert selectedCustomer != null;
        List<Booking> bookings = readWriteCSV.readFileBookingCSV();
        Booking newBooking = new Booking();
        newBooking.setIdCustomer(selectedCustomer.getId());
        newBooking.setCustomerName(selectedCustomer.getNameCustomer());
        assert selectedService != null;
        newBooking.setIdService(selectedService.getId());
        newBooking.setServiceName(selectedService.getServiceName());
        bookings.add(newBooking);
        readWriteCSV.writeBookingToCSVFile(bookings);
        displayMainMenu();
    }



}
