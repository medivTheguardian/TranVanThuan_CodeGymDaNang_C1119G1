package Service;

import Models.Customer;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CinemaService {
    private Scanner scanner;
    private CustomerService customerService;
    private Queue<Customer> customerQueue;

    public CinemaService() {
        scanner = new Scanner(System.in);
        customerService = new CustomerService();
        customerQueue = new LinkedList<>();
    }

    public void bookingTicketCinema(){
        System.out.println("Enter maximum ticket: ");
        int numberOfTicket = scanner.nextInt();
        while (numberOfTicket < 1) {
            System.out.println("Số lượng vé phải là số dương");
        }
        for (int i = 0; i < numberOfTicket; i++) {
            Customer customer = customerService.addNewCustomer();
            customerQueue.add(customer);
        }

    }

    public void showBookingCinema() {
        while (true) {
            Customer customer = customerQueue.poll();
            if (customer == null){
                break;
            } else {
                System.out.println(customer.showInfo());
            }
        }
    }
}
