package Service;

import Commons.CSVfile;
import CustomerException.*;
import Models.Customer;
import Models.Villa;
import Validation.CustomerValidation;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CustomerService {
    private Scanner scanner;
    private CSVfile csVfile;
    private CustomerValidation customerValidation;

    public CustomerService() {
        scanner = new Scanner(System.in);
        csVfile = new CSVfile();
        customerValidation = new CustomerValidation();

    }

    public void addNewCustomer() {
        String inputID;
        Customer customer = new Customer();
        List<Customer> customerList = csVfile.readCustomerCsv();

        System.out.println("Enter Id:");
        inputID = scanner.nextLine();
        customer.setId(inputID);
        try {
            customer.setFullName(customerValidation.validateFullName());
        } catch (FullNameException e) {
            e.printStackTrace();
        }
        try {
            customer.setBirthday(customerValidation.validateBirthday());
        } catch (BirthdayException e) {
            e.printStackTrace();
        }
        try {
            customer.setGender(customerValidation.validateGender());
        } catch (GenderException e) {
            e.printStackTrace();
        }
        try {
            customer.setIdCard(customerValidation.validateIdCard());
        } catch (IdCardException e) {
            e.printStackTrace();
        }
        System.out.print("Enter phone number: ");
        customer.setPhoneNumber(scanner.nextLine());
        try {
            customer.setEmail(customerValidation.validateEmail());
        } catch (EmailException e) {
            e.printStackTrace();
        }
        System.out.print("Enter type of customer: ");
        customer.setCustomerType(scanner.nextLine());
        System.out.println("Enter the address: ");
        customer.setAddress(scanner.nextLine());

        customerList.add(customer);
        csVfile.writeCustomerCsv(customerList);

    }

    public void showInfoCustomer() {
        List<Customer> customerList = csVfile.readCustomerCsv();
//        Collections.sort(customerList);

        for (Customer customer : customerList) {
            System.out.println(customer.showInfo());

        }
    }
}
