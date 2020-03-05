package Models;

public abstract class Services {
    private String id;
    private String servicesName;
    private double area;
    private double fee;
    private int numbersOfPeople;
    private String rentType;

    public Services() {
    }

    public Services(String id, String servicesName, double area, double fee, int numbersOfPeople, String rentType) {
        this.id = id;
        this.servicesName = servicesName;
        this.area = area;
        this.fee = fee;
        this.numbersOfPeople = numbersOfPeople;
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServicesName() {
        return servicesName;
    }

    public void setServicesName(String servicesName) {
        this.servicesName = servicesName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public int getNumbersOfPeople() {
        return numbersOfPeople;
    }

    public void setNumbersOfPeople(int numbersOfPeople) {
        this.numbersOfPeople = numbersOfPeople;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public abstract String showInfor();
}
