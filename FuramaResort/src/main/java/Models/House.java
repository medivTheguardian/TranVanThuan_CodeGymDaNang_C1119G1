package Models;

public class House extends Services {
    private String roomStandard;
    private String description;
    private int numberOfFloor;

    public House() {
    }

    public House(String roomStandard, String description, int numberOfFloor) {
        this.roomStandard = roomStandard;
        this.description = description;
        this.numberOfFloor = numberOfFloor;
    }

    public House(String id, String servicesName, double area, double fee, int numbersOfPeople, String rentType, String roomStandard, String description, int numberOfFloor) {
        super(id, servicesName, area, fee, numbersOfPeople, rentType);
        this.roomStandard = roomStandard;
        this.description = description;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
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
                "Room Standard: " + roomStandard + "\n" +
                "Description: " + description + "\n" +
                "Number of Floors: " + numberOfFloor;
    }

}
