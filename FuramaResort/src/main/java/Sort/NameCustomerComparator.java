package Sort;

import Models.Customer;

import java.util.Comparator;

public class NameCustomerComparator implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        if(o1.getFullName().compareTo(o2.getFullName())==0) {
            return o1.getBirthday()-o2.getBirthday();
        }
        return o1.getFullName().compareTo(o2.getFullName());
    }
}