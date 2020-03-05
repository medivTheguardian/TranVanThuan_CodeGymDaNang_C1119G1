package Models;

public class Villa extends Services {
    private String roomStandard;
    private String description;
    private double poolArea;
    private int numberOfFloor;

    public Villa() {
    }

    public Villa(String roomStandard, String description, double poolArea, int numbersOfFloor) {
        this.roomStandard = roomStandard;
        this.description = description;
        this.poolArea = poolArea;
        this.numberOfFloor = numbersOfFloor;
    }

    public Villa(String id, String servicesName, double area, double fee, int numbersOfPeople, String rentType, String roomStandard, String description, double poolArea, int numbersOfFloor) {
        super(id, servicesName, area, fee, numbersOfPeople, rentType);
        this.roomStandard = roomStandard;
        this.description = description;
        this.poolArea = poolArea;
        this.numberOfFloor = numbersOfFloor;
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

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumbersOfFloor() {
        return numberOfFloor;
    }

    public void setNumbersOfFloor(int numbersOfFloor) {
        this.numberOfFloor = numbersOfFloor;
    }

    @Override
    public String showInfor() {
        return "Villa: " + "\n" +
                "Id: " + super.getId() + "\n" +
                "Service Name: " + super.getServicesName() + "\n" +
                "Area: " + super.getArea() + "\n" +
                "Fee: " + super.getFee() + "\n" +
                "Number of People: " + super.getNumbersOfPeople() + "\n" +
                "Rent Type: " + super.getRentType() + "\n" +
                "Room Standard: " + roomStandard + "\n" +
                "Description: " + description + "\n" +
                "Pool Area: " + poolArea + "\n" +
                "Number of Floors: " + numberOfFloor;
    }
}

