package Models;

public class Room extends Services {
    private String freeServices;

    public Room() {
    }

    public Room(String freeServices) {
        this.freeServices = freeServices;
    }

    public Room(String id, String servicesName, double area, double fee, int numbersOfPeople, String rentType, String freeServices) {
        super(id, servicesName, area, fee, numbersOfPeople, rentType);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String showInfor() {
        return "House: " + "\n" +
                "Id: " + super.getId() + "\n" +
                "Service Name: " + super.getServicesName() + "\n" +
                "Area: " + super.getArea() + "\n" +
                "Fee: " + super.getFee() + "\n" +
                "Number of People: " + super.getNumbersOfPeople() + "\n" +
                "Rent Type: " + super.getRentType() + "\n" +
                "Free Service: " + freeServices;

    }
}
