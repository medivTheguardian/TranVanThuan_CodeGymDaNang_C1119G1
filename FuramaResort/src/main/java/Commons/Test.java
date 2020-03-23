package Commons;

import Models.Customer;
import Models.Villa;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        CSVfile csVfile = new CSVfile();
        List<Villa> villaList = new ArrayList<Villa>();
        Villa villaTest = new Villa("4", "t", 124, 100, 1, "du", "vippro", "amazing", 50, 2);

        villaList.add(villaTest);

        csVfile.writeVillaCsv(villaList);
        csVfile.readVillaCsv();
        for (Villa villa : villaList) {
            System.out.println(villa.showInfor());
        }
        List<Customer> customerList = new ArrayList<Customer>();
        Customer customerTest = new Customer();
        customerTest.setId("1");
        customerTest.setFullName("tran van a");
        customerTest.setBirthday("10/2/1999");
        customerTest.setGender("male");
        customerTest.setIdCard("1234567889");
        customerTest.setPhoneNumber("0126258468");
        customerTest.setEmail("tranvanthuan@gmail.com");
        customerTest.setCustomerType("a");
        customerTest.setAddress("12 tran cao van");

        customerList.add(customerTest);
        csVfile.writeCustomerCsv(customerList);
    }



}
