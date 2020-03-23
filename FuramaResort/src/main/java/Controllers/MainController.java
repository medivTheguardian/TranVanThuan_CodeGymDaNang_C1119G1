package Controllers;

import Commons.CSVfile;
import Models.*;
import Service.CustomerService;
import Service.ResortService;
import Sort.NameCustomerComparator;

import java.util.ArrayList;
import java.util.Collections;
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
        Scanner scanner = new Scanner(System.in);
        List<Customer> customers = new ArrayList<>();
        CSVfile csVfile = new CSVfile();
        customers = csVfile.readCustomerCsv();
        Collections.sort(customers, new NameCustomerComparator());
        for (Customer customer : customers) {
            System.out.println(".................................");
            System.out.println(customers.indexOf(customer) + ": " + customer.showInfo());
        }

        System.out.println("Choose the customer: ");
        int selectedOption = scanner.nextInt();
        Customer customer = null;
        if (selectedOption < 0 || selectedOption >= customers.size()) {
            System.out.println("No Customer!!!");
            addNewBooking();
        } else {
            customer = customers.get(selectedOption);
        }


        CSVfile readFileCSV = new CSVfile();
        Services service = null;
        System.out.println("1. Booking Villa\n2. Booking House \n3. Booking Room");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1: {
                List<Villa> villas;
                villas = csVfile.readVillaCsv();
                for (int i = 0; i < villas.size(); i++) {
                    System.out.println(".................................");
                    System.out.println("No: " + i);
                    System.out.println(villas.get(i).showInfor());
                }
                System.out.println("Enter choice booking villa: ");
                int index = scanner.nextInt();
                Villa villa = villas.get(index);
                customer.setServices(villa);
                service = villas.get(index);
                break;
            }
            case 2: {
                List<House> houses;
                houses = csVfile.readHouseCsv();
                for (int i = 0; i < houses.size(); i++) {
                    System.out.println(".................................");
                    System.out.println("No: " + i);
                    System.out.println(houses.get(i).showInfor());
                }
                System.out.println("Enter choice booking house: ");
                int index = scanner.nextInt();
                House house = houses.get(index);
                customer.setServices(house);
                service = houses.get(index);
                break;
            }
            case 3: {
                List<Room> rooms;
                rooms = csVfile.readRoomCsv();
                for (int i = 0; i < rooms.size(); i++) {
                    System.out.println(".................................");
                    System.out.println("No: " + i);
                    System.out.println(rooms.get(i).showInfor());
                }
                System.out.println("Enter choice booking room: ");
                int index = scanner.nextInt();
                Room room = rooms.get(index);
                customer.setServices(room);
                service = rooms.get(index);
                break;
            }
            default: {
                displayMainMenu();
            }

        }
        List<Booking> arrayListBooking = new ArrayList<>();
        Booking booking = new Booking();
        booking.setIdCustomer(customer.getId());
        booking.setCustomerName(customer.getFullName());
        booking.setIdService(service.getId());
        booking.setServiceName(service.getServicesName());
        arrayListBooking.add(booking);
        csVfile.writeBookingCsv(arrayListBooking);
        displayMainMenu();


    }



}
